package pub.games.quizznight.repo;

import org.springframework.stereotype.Repository;
import pub.games.quizznight.model.Quiz;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Repository
public class QuizRepositoryImpl implements BaseRepository<Quiz> {
    public static final Map<Integer, Quiz> quizMap;

    static {
        quizMap = new LinkedHashMap<>();
        Quiz quiz = new Quiz();
        quiz.setId(1);
        quiz.getQuestions().addAll(QuestionRepositoryImpl.questionMap.values());
        quizMap.put(quiz.getId(), quiz);
    }

    @Override
    public List<Quiz> list() {
        return new LinkedList<>(quizMap.values());
    }

    @Override
    public Quiz get(Integer id) {
        return quizMap.get(id);
    }
}
