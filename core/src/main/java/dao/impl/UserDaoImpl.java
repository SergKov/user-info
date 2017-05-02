package dao.impl;

import dao.UserDao;
import domain.User;
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
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Optional<User> findById(final Long id) {
        return null;
    }

    @Override
    public void save(final User user) {

    }

    @Override
    public void update(final User user) {

    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public List<User> findAll(final Pageable pageable) {
        return null;
    }

    @Override
    public void remove(final User user) {

    }
}
