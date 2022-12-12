package springbe.Model;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Student {

    @Id
    @GeneratedValue

    // personal information

    private @Getter @Setter Long id;
    @Column(nullable = false)
    private @Getter @Setter String lastName;
    @Column(nullable = false)
    private @Getter @Setter String firstName;
    @Column(nullable = false)
    private @Getter @Setter String middleName;
    @Column(nullable = false)
    private @Getter @Setter String studentID;
    @Column(nullable = false)
    private @Getter @Setter String yearLevel;
    @Column(nullable = false)
    private @Getter @Setter String block;
    @Column(nullable = false)
    private @Getter @Setter String course;
    @Column(nullable = false)
    private @Getter @Setter String emailAddress;
    @Column(nullable = false)
    private @Getter @Setter String facebookAccount;
    @Column(nullable = false)
    private @Getter @Setter String mobileNumber;
    @Column(nullable = false)
    private @Getter @Setter String permanentAddress;
    @Column(nullable = false)
    private @Getter @Setter String temporaryAddress;
    @Column(nullable = false)
    private @Getter @Setter String gender;
    @Column(nullable = false)
//    @DateTimeFormat(pattern="dd/MM/yyyy")
    private @Getter @Setter String dateOfBirth;
    @Column(nullable = false)
    private @Getter @Setter String placeOfBirth;
    @Column(nullable = false)
    private @Getter @Setter String citizenship;
    @Column(nullable = false)
    private @Getter @Setter String civilStatus;
    @Column(nullable = false)
    private @Getter @Setter String scholarship;
    @Column(nullable = false)
    private @Getter @Setter String gadgetsUsingForStudy;
    @Column(nullable = false)
    private @Getter @Setter String statusOfInternet;
    @Column(nullable = false)

    // educational background

    private @Getter @Setter String elementarySchool;
    @Column(nullable = false)
    private @Getter @Setter String juniorHighSchool;
    @Column(nullable = false)
    private @Getter @Setter String seniorHighSchool;
    @Column(nullable = false)
    private @Getter @Setter String college;
    @Column(nullable = false)
    private @Getter @Setter String elementaryDegree;
    @Column(nullable = false)
    private @Getter @Setter String elementaryStartDate;
    @Column(nullable = false)
    private @Getter @Setter String elementaryHonorsReceived;
    @Column(nullable = false)
    private @Getter @Setter String juniorDegree;
    @Column(nullable = false)
    private @Getter @Setter String juniorStartDate;
    @Column(nullable = false)
    private @Getter @Setter String juniorHonorsReceived;
    @Column(nullable = false)
    private @Getter @Setter String seniorHighDegree;
    @Column(nullable = false)
    private @Getter @Setter String seniorHighStartDate;
    @Column(nullable = false)
    private @Getter @Setter String seniorHighHonorsReceived;
    @Column(nullable = false)
    private @Getter @Setter String collegeDegree;
    @Column(nullable = false)
    private @Getter @Setter String collegeStartDate;
    @Column(nullable = false)
    private @Getter @Setter String collegeHonorsReceived;
    @Column(nullable = false)

    // family background

    private @Getter @Setter String fathersSurname;
    @Column(nullable = false)
    private @Getter @Setter String fathersGivenName;
    @Column(nullable = false)
    private @Getter @Setter String fathersMiddleName;
    @Column(nullable = false)
    private @Getter @Setter String fathersAddress;
    @Column(nullable = false)
    private @Getter @Setter String fathersHighestEducation;
    @Column(nullable = false)
    private @Getter @Setter String fathersOccupation;
    @Column(nullable = false)
    private @Getter @Setter String fathersCompany;
    @Column(nullable = false)
    private @Getter @Setter String fathersMobileNumber;
    @Column(nullable = false)
    private @Getter @Setter String fathersMonthlyIncome;
    @Column(nullable = false)
    private @Getter @Setter String fathersEmailAddress;
    @Column(nullable = false)

    private @Getter @Setter String mothersSurname;
    @Column(nullable = false)
    private @Getter @Setter String mothersGivenName;
    @Column(nullable = false)
    private @Getter @Setter String mothersMiddleName;
    @Column(nullable = false)
    private @Getter @Setter String mothersAddress;
    @Column(nullable = false)
    private @Getter @Setter String mothersHighestEducation;
    @Column(nullable = false)
    private @Getter @Setter String mothersOccupation;
    @Column(nullable = false)
    private @Getter @Setter String mothersCompany;
    @Column(nullable = false)
    private @Getter @Setter String mothersMobileNumber;
    @Column(nullable = false)
    private @Getter @Setter String mothersMonthlyIncome;
    @Column(nullable = false)
    private @Getter @Setter String mothersEmailAddress;

}
