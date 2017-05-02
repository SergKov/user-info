package dao.impl;

import dao.AbstractDao;
import org.springframework.stereotype.Repository;
import pagination.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

/**
 * Created by koval on 5/2/2017.
 */
@Repository
public class AbstractDaoImpl<Entity> implements AbstractDao<Entity> {

    @PersistenceContext
    private EntityManager em;

    protected final Class<Entity> clazz;

    public AbstractDaoImpl(Class<Entity> clazz) {
        this.clazz = clazz;
    }

    @Override
    public Optional<Entity> findById(final Long id) {
        return Optional.ofNullable(em.find(clazz, id));
    }

    @Override
    public void save(final Entity entity) {
        em.persist(entity);
    }

    @Override
    public void update(final Entity entity) {
        em.merge(entity);
    }

    @Override
    public long count() { // TODO
        return 0;
    }

    @Override
    public List<Entity> findAll(final Pageable pageable) { // TODO
        return null;
    }

    @Override
    public void remove(final Entity entity) {
        em.remove(entity);
    }
}
