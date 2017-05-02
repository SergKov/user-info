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
    public Optional<User> findById(final Long id) { // TODO
        return null;
    }

    @Override
    public void save(final User user) { // TODO

    }

    @Override
    public void update(final User user) { // TODO

    }

    @Override
    public long count() { // TODO
        return 0;
    }

    @Override
    public List<User> findAll(final Pageable pageable) { // TODO
        return null;
    }

    @Override
    public void remove(final User user) { // TODO

    }
}
