package pub.games.quizznight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.games.quizznight.model.Question;
import pub.games.quizznight.model.Quiz;
import pub.games.quizznight.service.BaseService;
import pub.games.quizznight.service.QuizService;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController extends BaseController<Quiz> {

    @GetMapping("{id}/questions")
    public List<Question> getQuestionsOf(@PathVariable("id") Integer id){
        return getService().getQuestionsOf(id);
    }

    @Override
    protected QuizService getService() {
        return (QuizService) super.getService();
    }
}
