package domain;

import javax.persistence.Entity;
import java.time.LocalDateTime;

/**
 * Created by koval on 5/1/2017.
 */
@Entity
public class User {

    private String name;
    private Integer age;
    private Role role;
    private LocalDateTime createdDateTime;

    public User() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}