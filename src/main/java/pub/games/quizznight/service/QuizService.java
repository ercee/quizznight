package pub.games.quizznight.service;

import org.springframework.stereotype.Service;
import pub.games.quizznight.model.Question;
import pub.games.quizznight.model.Quiz;
import pub.games.quizznight.repo.BaseRepository;
import pub.games.quizznight.repo.QuizRepositoryImpl;

import java.util.List;

@Service
public class QuizService extends BaseService<Quiz> {
    public List<Question> getQuestionsOf(Integer id){
        return getRepository().getQuestionsOf(id);
    }

    @Override
    protected QuizRepositoryImpl getRepository() {
        return (QuizRepositoryImpl) super.getRepository();
    }
}
