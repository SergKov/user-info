package domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by koval on 5/7/2017.
 */
@Entity
public class Role extends AbstractEntity {

    @ManyToMany
    private List<User> user;

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
