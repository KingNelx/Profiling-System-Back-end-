package Repository;

import Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
public interface StudentRepo extends JpaRepository<Student, Long> {

    // bsis
    @Query("SELECT * FROM Student Students WHERE course = bsis1")
    List<Student> getAllBSIS1();

    @Query("SELECT * FROM Student Students WHERE course = bsis2")
    List<Student> getAllBSIS2();

    @Query("SELECT * FROM Student Students WHERE course = bsis3")
    List<Student> getAllBSIS3();

    @Query("SELECT * FROM Student Students WHERE course = bsis4")
    List<Student> getAllBSIS4();

    // bsit
    @Query("SELECT * FROM Student Students WHERE course = bsit1")
    List<Student> getAllBSIT1();

    @Query("SELECT * FROM Student Students WHERE course = bsit2")
    List<Student> getAllBSIT2();

    @Query("SELECT * FROM Student Students WHERE course = bsit3")
    List<Student> getAllBSIT3();

    @Query("SELECT * FROM Student Students WHERE course = bsit4")
    List<Student> getAllBSIT4();

    // bscs
    @Query("SELECT * FROM Student Students WHERE course = bscs1")
    List<Student> getAllBSCS1();

    @Query("SELECT * FROM Student Students WHERE course = bscs2")
    List<Student> getAllBSCS2();

    @Query("SELECT * FROM Student Students WHERE course = bscs3")
    List<Student> getAllBSCS3();

    @Query("SELECT * FROM Student Students WHERE course = bscs4")
    List<Student> getAllBSCS4();
}
