package pub.games.quizznight.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question extends BaseModel {
    private String question;
    private Map<String, Boolean> choices;
    private String subject;

    public Question() {
        choices = new LinkedHashMap<>();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Map<String, Boolean> getChoices() {
        return choices;
    }

    public void setChoices(Map<String, Boolean> choices) {
        this.choices = choices;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
