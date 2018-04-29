package pub.games.quizznight.service;

import org.springframework.beans.factory.annotation.Autowired;
import pub.games.quizznight.model.BaseModel;
import pub.games.quizznight.repo.BaseRepository;

import java.util.List;

public abstract class BaseService<T extends BaseModel> {

    @Autowired
    private BaseRepository<T> repository;

    private BaseRepository<T> getRepository() {
        return repository;
    }

    public List<T> list() {
        return getRepository().list();
    }

    public T get(Integer id) {
        return getRepository().get(id);
    }
}
