package pub.games.quizznight.repo;

import pub.games.quizznight.model.BaseModel;

import java.util.List;

public interface BaseRepository<T extends BaseModel> {

    List<T> list();

    T get(Integer id);

    List<T> ins(T t);

    List<T> delete(Integer id);
}
