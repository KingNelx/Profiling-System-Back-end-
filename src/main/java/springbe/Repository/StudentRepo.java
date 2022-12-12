package springbe.Repository;

import springbe.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {

    @Query("SELECT firstName, lastName, middleName FROM Student WHERE course=bsit")
    List<String>getAllBSIT();

    @Query("SELECT firstName, lastName, middleName FROM Student WHERE course=bsis")
    List<String>getAllBSIS();

    @Query("SELECT firstName, lastName, middleName FROM Student WHERE course=bscs")
    List<String>getAllBSCS();
}
