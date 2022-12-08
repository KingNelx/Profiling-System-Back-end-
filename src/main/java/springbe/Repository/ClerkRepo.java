package springbe.Repository;

import springbe.Model.Clerk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClerkRepo extends JpaRepository<Clerk, Long> {
}
