package domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by koval on 5/1/2017.
 */
@MappedSuperclass
public abstract class AbstractUser {

    @Id
    @GeneratedValue
    private Long id;

    public AbstractUser() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
