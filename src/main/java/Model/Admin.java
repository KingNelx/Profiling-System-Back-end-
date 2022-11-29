package Model;

import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import  javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="MainADMIN")
public class Admin {

    @Id
    @GeneratedValue

    private @Getter @Setter Long id;
    private @Getter @Setter String userName;
    private @Getter @Setter String email;
    private @Getter @Setter String password;

}
