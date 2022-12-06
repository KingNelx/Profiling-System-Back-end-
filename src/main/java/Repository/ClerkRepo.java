package Repository;

import Model.Clerk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClerkRepo extends JpaRepository<Clerk, Long> {
}
