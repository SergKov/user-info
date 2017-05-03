package dao.impl;

import dao.AbstractDao;
import org.springframework.stereotype.Repository;
import pagination.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
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
    public long count() {
        final CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);
        query = query.select(builder.count(query.from(clazz)));
        return em.createQuery(query).getResultList()
                .stream()
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format("Query has returned no results for %s", clazz.getSimpleName())));
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
