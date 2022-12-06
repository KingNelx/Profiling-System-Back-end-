package Repository;

import Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {

    // all course
    @Query("SELECT * FROM Student Students WHERE course=bsit")
    List<String>getAllBSIT();
    @Query("SELECT * FROM Student Students WHERE course=bsis")
    List<String>getAllBSIS();
    @Query("SELECT * FROM Student Students WHERE course=bscs")
    List<String>getAllBSCS();

    // 1st year bsit
    @Query("SELECT * FROM Student Students WHERE yearLevel=1 AND course=bsit")
    List<String>getAllBSIT1();

    // 2nd year bsit
    @Query("SELECT * FROM Student Students WHERE yearLevel=2 AND course=bsit")
    List<String>getAllBSIT2();

    // 3rd year bsit
    @Query("SELECT * FROM Student Students WHERE yearLevel=3 AND course=bsit")
    List<String>getAllBSIT3();

    // 4th year bsit
    @Query("SELECT * FROM Student Students WHERE yearLevel=4 AND course=bsit")
    List<String>getAllBSIT4();

    // 1st year bsis
    @Query("SELECT * FROM Student Students WHERE yearLevel=1 AND course=bsis")
    List<String>getAllBSIS1();

    // 2nd year bsis
    @Query("SELECT * FROM Student Students WHERE yearLevel=2 AND course=bsis")
    List<String>getAllBSIS2();

    // 3rd year bsis
    @Query("SELECT * FROM Student Students WHERE yearLevel=3 AND course=bsis")
    List<String>getAllBSIS3();

    // 4th year bsis
    @Query("SELECT * FROM Student Students WHERE yearLevel=4 AND course=bsis")
    List<String>getAllBSIS4();

    // 1st year bscs
    @Query("SELECT * FROM Student Students WHERE yearLevel=1 AND course=bscs")
    List<String>getAllBSCS1();

    // 2nd year bscs
    @Query("SELECT * FROM Student Students WHERE yearLevel=2 AND course=bscs")
    List<String>getAllBSCS2();

    // 3rd year bscs
    @Query("SELECT * FROM Student Students WHERE yearLevel=3 AND course=bscs")
    List<String>getAllBSCS3();

    // 4th year bscs
    @Query("SELECT * FROM Student Students WHERE yearLevel=4 AND course=bscs")
    List<String>getAllBSCS4();
}
