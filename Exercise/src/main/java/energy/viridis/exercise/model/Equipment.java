package energy.viridis.exercise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Equipment must have name.")
    @Column
    private String name;

    public Equipment withId(Long id) {
        this.id = id;
        return this;
    }

    public Equipment withName(String name) {
        this.name = name;
        return this;
    }
}
