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

    private @Getter @Setter String lastName;

    private @Getter @Setter String firstName;

    private @Getter @Setter String middleName;

    private @Getter @Setter String studentID;

    private @Getter @Setter String yearLevel;

    private @Getter @Setter String block;

    private @Getter @Setter String course;

    private @Getter @Setter String emailAddress;

    private @Getter @Setter String facebookAccount;

    private @Getter @Setter String mobileNumber;

    private @Getter @Setter String permanentAddress;

    private @Getter @Setter String temporaryAddress;

    private @Getter @Setter String gender;

//    @DateTimeFormat(pattern="dd/MM/yyyy")
    private @Getter @Setter String dateOfBirth;

    private @Getter @Setter String placeOfBirth;

    private @Getter @Setter String citizenship;

    private @Getter @Setter String civilStatus;

    private @Getter @Setter String scholarship;

    private @Getter @Setter String gadgetsUsingForStudy;

    private @Getter @Setter String statusOfInternet;


    // educational background

    private @Getter @Setter String elementarySchool;

    private @Getter @Setter String juniorHighSchool;

    private @Getter @Setter String seniorHighSchool;

    private @Getter @Setter String college;

    private @Getter @Setter String elementaryDegree;

    private @Getter @Setter String elementaryStartDate;

    private @Getter @Setter String elementaryHonorsReceived;

    private @Getter @Setter String juniorDegree;

    private @Getter @Setter String juniorStartDate;

    private @Getter @Setter String juniorHonorsReceived;

    private @Getter @Setter String seniorHighDegree;

    private @Getter @Setter String seniorHighStartDate;

    private @Getter @Setter String seniorHighHonorsReceived;

    private @Getter @Setter String collegeDegree;

    private @Getter @Setter String collegeStartDate;

    private @Getter @Setter String collegeHonorsReceived;


    // family background

    private @Getter @Setter String fathersSurname;

    private @Getter @Setter String fathersGivenName;

    private @Getter @Setter String fathersMiddleName;

    private @Getter @Setter String fathersAddress;

    private @Getter @Setter String fathersHighestEducation;

    private @Getter @Setter String fathersOccupation;

    private @Getter @Setter String fathersCompany;

    private @Getter @Setter String fathersMobileNumber;

    private @Getter @Setter String fathersMonthlyIncome;

    private @Getter @Setter String fathersEmailAddress;


    private @Getter @Setter String mothersSurname;

    private @Getter @Setter String mothersGivenName;

    private @Getter @Setter String mothersMiddleName;

    private @Getter @Setter String mothersAddress;

    private @Getter @Setter String mothersHighestEducation;

    private @Getter @Setter String mothersOccupation;

    private @Getter @Setter String mothersCompany;

    private @Getter @Setter String mothersMobileNumber;

    private @Getter @Setter String mothersMonthlyIncome;

    private @Getter @Setter String mothersEmailAddress;
    private @Getter @Setter String studEmail;
    private @Getter @Setter String studPass;
    private @Getter @Setter String studFirstName;
    private @Getter @Setter String studLastName;

}
