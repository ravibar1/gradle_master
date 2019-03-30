package sin.java.core.classes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import sin.java.core.classes.properties.Gender;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Human {
    LocalDateTime dob;
    Gender gender;
}
