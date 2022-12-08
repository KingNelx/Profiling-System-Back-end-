package springbe.Repository;

import springbe.Model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepo extends JpaRepository<Faculty, Long> {
}
