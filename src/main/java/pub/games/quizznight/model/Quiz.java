package pub.games.quizznight.model;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
import java.util.LinkedList;
import java.util.List;

public class Quiz extends BaseModel {
    private List<Question> questions;

    public Quiz() {
        questions = new LinkedList<>();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
