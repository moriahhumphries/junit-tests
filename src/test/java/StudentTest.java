import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testCreateStudent(){
        Student Moriah = new Student(123, "Moriah");
        Student Kerrigan = null;
        assertNull(Kerrigan);
        assertNotNull(Moriah);
    }

    @Test
    public void testStudentFields(){
        Student Moriah = new Student(123, "Moriah");
//        assertSame(123, Moriah.getId());
//        assertSame("Moriah", Moriah.getName());
//        assertSame(123, Moriah.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student Moriah = new Student(123, "Moriah");
        Moriah.addGrade(92);
        assertSame(92, Moriah.getGrades().get(0));
        Moriah.addGrade(82);
        assertSame(82, Moriah.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student Moriah = new Student(123, "Moriah");
        Moriah.addGrade(76);
        Moriah.addGrade(90);
        assertEquals(83, Moriah.getGradeAverage(), 0);
    }

}
