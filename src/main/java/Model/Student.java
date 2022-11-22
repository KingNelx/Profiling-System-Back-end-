package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import java.sql.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Students")
public class Student {

    @Id
    @GeneratedValue

    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String middleName;
    private @Getter @Setter String idNumber;
    private @Getter @Setter String emailAddress;
    private @Getter @Setter String yearLevel;
    private @Getter @Setter String classBlock;
    private @Getter @Setter String mobileNumber;
    private @Getter @Setter String course;
    private @Getter @Setter String gender;
    private @Getter @Setter int age;
    private @Getter @Setter String civilStatus;
    private @Getter @Setter String religion;
    private @Getter @Setter String language;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private @Getter @Setter Date dateOfBirth;
    private @Getter @Setter String placeOfBirth;
    private @Getter @Setter String permanentAddress;
    private @Getter @Setter String currentAddress;

}
