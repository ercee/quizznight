package pub.games.quizznight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pub.games.quizznight.model.BaseModel;
import pub.games.quizznight.service.BaseService;

import java.util.List;

public abstract class BaseController<T extends BaseModel> {
    @Autowired
    private BaseService<T> service;

    protected BaseService<T> getService() {
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

    @PostMapping("ins")
    public List<T> ins(@RequestBody T t){
        return getService().ins(t);
    }

    @DeleteMapping("del/{id}")
    public List<T> delete(@PathVariable("id") Integer id){
        return getService().delete(id);
    }
}
