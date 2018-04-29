package pub.games.quizznight.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.games.quizznight.model.Quiz;

@RestController
@RequestMapping("quiz")
public class QuizController extends BaseController<Quiz> {

}
