package dao;

import pagination.Page;

import java.util.List;
import java.util.Optional;

/**
 * Created by koval on 5/2/2017.
 */
public interface AbstractDao<Entity> {

    Optional<Entity> findById(Long id);

    void save(Entity entity);

    void update(Entity entity);

    long count();

    List<Entity> findAll(Page pageable);

    void remove(Entity entity);
}
