package dao.impl;

import dao.UserDao;
import domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
}
