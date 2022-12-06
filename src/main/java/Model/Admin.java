package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="MainADMIN")
public class Admin {

    @Id
    @GeneratedValue
    private @Getter @Setter Long id;
    @Column(nullable = false)
    private @Getter @Setter String userName;
    @Column(nullable = false)
    private @Getter @Setter String email;
    @Column(nullable = false)
    private @Getter @Setter String password;
}
