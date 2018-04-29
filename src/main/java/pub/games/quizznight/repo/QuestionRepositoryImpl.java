package pub.games.quizznight.repo;

import org.springframework.stereotype.Repository;
import pub.games.quizznight.model.Question;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Repository
public class QuestionRepositoryImpl implements BaseRepository<Question> {
    public static final Map<Integer, Question> questionMap;

    static {
        questionMap = new LinkedHashMap<>();
        Question q1 = new Question();
        q1.setId(1);
        q1.setQuestion("Nasılsın?");
        q1.getChoices().put("iyiyim", true);
        q1.getChoices().put("kötüyüm", false);
        q1.setSubject("Sosyal");
        questionMap.put(q1.getId(), q1);

        Question q2 = new Question();
        q2.setId(2);
        q2.setQuestion("İşler nasıl?");
        q2.getChoices().put("Valla n'olsun?", false);
        q2.getChoices().put("İyi ya, fena değil", true);
        q2.setSubject("İşler");
        questionMap.put(q2.getId(), q2);
    }

    @Override
    public List<Question> list() {
        return new LinkedList<>(questionMap.values());
    }

    @Override
    public Question get(Integer id) {
        return questionMap.get(id);
    }
}
