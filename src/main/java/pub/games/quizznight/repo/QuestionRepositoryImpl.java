package pub.games.quizznight.repo;

import org.springframework.stereotype.Repository;
import pub.games.quizznight.model.Question;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Repository
public class QuestionRepositoryImpl implements BaseRepository<Question> {
    private static final Map<Integer, Question> questionMap;

    static {
        questionMap = new LinkedHashMap<>();
        Question q1 = new Question();
        q1.setId(1);
        q1.setQuestion("Nasılsın?");
        q1.getChoices().put("iyiyim", true);
        q1.getChoices().put("kötüyüm", false);
        q1.setSubject("Sosyal");
        q1.setQuizId(1);
        questionMap.put(q1.getId(), q1);

        Question q2 = new Question();
        q2.setId(2);
        q2.setQuestion("İşler nasıl?");
        q2.getChoices().put("Valla n'olsun?", false);
        q2.getChoices().put("İyi ya, fena değil", true);
        q2.setSubject("İşler");
        q2.setQuizId(1);
        questionMap.put(q2.getId(), q2);

        Question q3 = new Question();
        q3.setId(3);
        q3.setQuestion("Nerelisin?");
        q3.getChoices().put("Buralı", false);
        q3.getChoices().put("Şuralı", true);
        q3.setSubject("Memleket");
        q3.setQuizId(2);
        questionMap.put(q3.getId(), q3);
    }

    @Override
    public List<Question> list() {
        return new LinkedList<>(questionMap.values());
    }

    @Override
    public Question get(Integer id) {
        return questionMap.get(id);
    }

    @Override
    public List<Question> ins(Question question) {
        if (question.getId() == null) {
            question.setId(questionMap.size() + 1);
        }
        questionMap.put(question.getId(), question);
        return list();
    }

    @Override
    public List<Question> delete(Integer id) {
        questionMap.remove(id);
        return list();
    }
}
