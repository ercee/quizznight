package pub.games.quizznight.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.games.quizznight.model.Question;

@RestController
@RequestMapping("question")
public class QuestionController extends BaseController<Question> {

}
