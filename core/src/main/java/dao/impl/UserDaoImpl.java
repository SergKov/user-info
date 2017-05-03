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
public class UserDaoImpl extends AbstractDaoImpl<User> implements UserDao {

    @PersistenceContext
    private EntityManager em;

    public UserDaoImpl() {
        super(User.class);
    }

    @Override
    public Optional<User> findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public void save(final User user) {
        super.save(user);
    }

    @Override
    public void update(final User user) {
        super.update(user);
    }

    @Override
    public long count() {
        return super.count();
    }

    @Override
    public List<User> findAll(final Pageable pageable) {
        return super.findAll(pageable);
    }

    @Override
    public void remove(final User user) {
        super.remove(user);
    }
}
