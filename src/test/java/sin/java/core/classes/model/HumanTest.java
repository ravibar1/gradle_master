package sin.java.core.classes.model;

import org.junit.Before;
import org.junit.Test;
import sin.java.core.classes.properties.Gender;

import java.time.LocalDateTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;


public class HumanTest {


    Human human = new Human(null, null);


    @Before
    public void setup(){
        human.setGender(null);
        human.setDob(null);
    }

    @Test
    public void getDob() {
        human.setDob(LocalDateTime.of(1977,04,17,00,00));
        assertEquals(LocalDateTime.of(1977,04,17,00,00),human.getDob());
    }

    @Test
    public void getGender() {
        human.setGender(Gender.MALE);
        assertEquals(Gender.MALE,human.getGender());
    }


}