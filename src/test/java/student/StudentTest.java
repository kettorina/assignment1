package student;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    Student student = new Student("AnnaJones", 21, new Date(23/7/1995));

    @Test
    public void getUsername(){
        String expected = "AnnaJones21";
        String actual = student.getUsername();


        assertEquals(expected, actual);

    }
}
