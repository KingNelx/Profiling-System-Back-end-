package Model;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.sql.Date;
import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Students")
public class Student {

    @Id
    @GeneratedValue

    private @Getter @Setter Long id;
    // personal background
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String middleName;
    private @Getter @Setter String idNumber;
    private @Getter @Setter String emailAddress;
    @Column(name = "yrLevel")
    private @Getter @Setter String yearLevel;
    private @Getter @Setter String schoolBlock;
    private @Getter @Setter String mobileNumber;
    private @Getter @Setter String course;
    private @Getter @Setter String gender;
    private @Getter @Setter int age;
    private @Getter @Setter String civilStatus;
    private @Getter @Setter String religion;
    private @Getter @Setter String language;
    @DateTimeFormat(fallbackPatterns = "dd/MM/yyyy")
    private @Getter @Setter Date birthday;
    private @Getter @Setter String placeOfBirth;
    private @Getter @Setter String permanentAddress;
    private @Getter @Setter String currentAddress;

    // educational background
    private @Getter @Setter String nameOfSchoolElementary;
    private @Getter @Setter String nameOfSchoolJuniorHigh;
    private @Getter @Setter String nameOfSchoolSeniorHigh;
    private @Getter @Setter String nameOfSchoolCollege;
    private @Getter @Setter String yearGraduatedElementary;
    private @Getter @Setter String yearGraduatedJuniorHigh;
    private @Getter @Setter String yearGraduatedSeniorHigh;
    private @Getter @Setter String yearGraduatedCollege;
    private @Getter @Setter String academicAwardsElementary;
    private @Getter @Setter String academicAwardsJuniorHigh;
    private @Getter @Setter String academicAwardsSeniorHigh;
    private @Getter @Setter String academicAwardsCollege;

    // family background
    private @Getter @Setter String fathersName;
    private @Getter @Setter String mothersName;
    private @Getter @Setter String fatherOccupation;
    private @Getter @Setter String motherOccupation;
    private @Getter @Setter String motherReligion;
    private @Getter @Setter String fatherReligion;
    private @Getter @Setter int fathersAge;
    private @Getter @Setter int mothersAge;
    private @Getter @Setter String fathersEducationAttainment;
    private @Getter @Setter String mothersEducationAttainment;
    private @Getter @Setter String maritalStatusOfParents;
    private @Getter @Setter String studentIsLivingWith;

    // other information
    private @Getter @Setter String healthConditions;
    @Column(name="Pregnant")
    private @Getter @Setter String AreYouPregnant;
    private @Getter @Setter String AreYouScholar;
    private @Getter @Setter String scholarshipProgramName;
}
