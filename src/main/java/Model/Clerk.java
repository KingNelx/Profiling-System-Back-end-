package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Table(name="CICTClerk")
@Entity
public class Clerk {

    @Id
    @GeneratedValue
    private @Getter @Setter Long id;
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String clerkEmail;
    private @Getter @Setter String clerkUsername;
    private @Getter @Setter String password;
}
