package pub.games.quizznight.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pub.games.quizznight.model.Question;
import pub.games.quizznight.model.Quiz;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class QuizRepositoryImpl implements BaseRepository<Quiz> {
    private static final Map<Integer, Quiz> quizMap;

    @Autowired
    private QuestionRepositoryImpl questionRepository;

    static {
        quizMap = new LinkedHashMap<>();
        Quiz quiz = new Quiz();
        quiz.setId(1);
        quiz.setName("My First Quizz");
        quizMap.put(quiz.getId(), quiz);
        Quiz quiz2 = new Quiz();
        quiz2.setId(2);
        quiz2.setName("Memleket Meselesi");
        quizMap.put(quiz2.getId(), quiz2);
    }

    @Override
    public List<Quiz> list() {
        return new LinkedList<>(quizMap.values());
    }

    @Override
    public Quiz get(Integer id) {
        return quizMap.get(id);
    }

    @Override
    public List<Quiz> ins(Quiz quiz) {
        if (quiz.getId() == null) {
            quiz.setId(quizMap.size() + 1);
        }
        quizMap.put(quiz.getId(), quiz);
        return list();
    }

    @Override
    public List<Quiz> delete(Integer id) {
        quizMap.remove(id);
        return list();
    }

    public List<Question> getQuestionsOf(Integer id) {
        return questionRepository.list().stream().filter(e -> e.getQuizId().equals(id)).collect(Collectors.toList());
    }

}
