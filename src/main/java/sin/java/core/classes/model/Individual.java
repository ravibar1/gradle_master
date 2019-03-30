package sin.java.core.classes.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import sin.java.core.classes.properties.Gender;

import java.time.LocalDateTime;

@Getter
@Setter
public class Individual extends Human {
    String name;

    @Builder
    public Individual(LocalDateTime dob, Gender gender, String name){
        super(dob,gender);
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString()+"\nIndividual{" +
                "name='" + name + '\'' +
                '}';
    }
}
