package pub.games.quizznight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pub.games.quizznight.model.BaseModel;
import pub.games.quizznight.service.BaseService;

import java.util.List;

public abstract class BaseController<T extends BaseModel> {
    @Autowired
    protected BaseService<T> service;

    public BaseService<T> getService() {
        return service;
    }

    @GetMapping("list")
    public List<T> list() {
        return getService().list();
    }

    @GetMapping("{id}")
    public T getQuiz(@PathVariable("id") Integer id) {
        return getService().get(id);
    }
}
