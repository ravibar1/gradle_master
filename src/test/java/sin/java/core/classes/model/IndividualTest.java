package sin.java.core.classes.model;

import org.junit.Test;
import sin.java.core.classes.properties.Gender;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class IndividualTest {

    @Test
    public void test_individualName(){

       Individual x = Individual.builder()
               .dob(LocalDateTime.of(1977,04,17,00,00))
               .gender(Gender.MALE)
               .name("Ravi Jaganathan")
               .build();

        System.out.println(x);



    }

}