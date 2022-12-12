package springbe.Controller;

import springbe.Exception.StudentNotFoundException;
import springbe.Model.Student;
import springbe.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:3000/")
public class STUDENTController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/addStudent")
    Student addStudent(@RequestBody Student newStudent){
        return studentRepo.save(newStudent);
    }

    @GetMapping("/getAllStudents")
    List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    @GetMapping("/students/{id}")
    Student getStudentById(@PathVariable Long id){
        return studentRepo.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }

    @PutMapping("/students/{id}")
    Student updateStudent(@RequestBody Student newStudent, @PathVariable Long id){
        return studentRepo.findById(id).map(student -> {
            student.setLastName(newStudent.getLastName());
            student.setFirstName(newStudent.getFirstName());
            student.setMiddleName(newStudent.getMiddleName());
            student.setStudentID(newStudent.getStudentID());
            student.setYearLevel(newStudent.getYearLevel());
            student.setBlock(newStudent.getBlock());
            student.setCourse(newStudent.getCourse());
            student.setEmailAddress(newStudent.getEmailAddress());
            student.setFacebookAccount(newStudent.getFacebookAccount());
            student.setMobileNumber(newStudent.getMobileNumber());
            student.setPermanentAddress(newStudent.getPermanentAddress());
            student.setTemporaryAddress(newStudent.getTemporaryAddress());
            student.setGender(newStudent.getTemporaryAddress());
            student.setDateOfBirth(newStudent.getDateOfBirth());
            student.setPlaceOfBirth(newStudent.getPlaceOfBirth());
            student.setCitizenship(newStudent.getCitizenship());
            student.setScholarship(newStudent.getScholarship());
            student.setGadgetsUsingForStudy(newStudent.getGadgetsUsingForStudy());
            student.setStatusOfInternet(newStudent.getStatusOfInternet());
            student.setElementarySchool(newStudent.getElementarySchool());
            student.setJuniorHighSchool(newStudent.getJuniorHighSchool());
            student.setSeniorHighSchool(newStudent.getSeniorHighSchool());
            student.setCollege(newStudent.getCollege());
            student.setElementaryDegree(newStudent.getElementaryDegree());
            student.setElementaryStartDate(newStudent.getElementaryStartDate());
            student.setElementaryHonorsReceived(newStudent.getElementaryHonorsReceived());
            student.setJuniorDegree(newStudent.getJuniorDegree());
            student.setJuniorStartDate(newStudent.getJuniorStartDate());
            student.setJuniorHonorsReceived(newStudent.getJuniorHonorsReceived());
            student.setSeniorHighDegree(newStudent.getSeniorHighDegree());
            student.setSeniorHighStartDate(newStudent.getSeniorHighStartDate());
            student.setSeniorHighHonorsReceived(newStudent.getSeniorHighHonorsReceived());
            student.setFathersSurname(newStudent.getFathersSurname());
            student.setFathersGivenName(newStudent.getFathersGivenName());
            student.setFathersMiddleName(newStudent.getFathersMiddleName());
            student.setFathersAddress(newStudent.getFathersAddress());
            student.setFathersHighestEducation(newStudent.getFathersHighestEducation());
            student.setFathersOccupation(newStudent.getFathersOccupation());
            student.setFathersCompany(newStudent.getFathersCompany());
            student.setFathersMobileNumber(newStudent.getFathersMobileNumber());
            student.setFathersMonthlyIncome(newStudent.getFathersMonthlyIncome());
            student.setFathersEmailAddress(newStudent.getFathersEmailAddress());
            student.setMothersSurname(newStudent.getMothersSurname());
            student.setMothersAddress(newStudent.getMothersGivenName());
            student.setMothersMiddleName(newStudent.getMothersMiddleName());
            student.setMothersAddress(newStudent.getMothersAddress());
            student.setMothersHighestEducation(newStudent.getMothersHighestEducation());
            student.setMothersOccupation(newStudent.getMothersOccupation());
            student.setMothersCompany(newStudent.getMothersCompany());
            student.setMothersMobileNumber(newStudent.getMothersMobileNumber());
            student.setMothersMonthlyIncome(newStudent.getMothersMonthlyIncome());
            student.setMothersEmailAddress(newStudent.getMothersEmailAddress());
            return studentRepo.save(student);
        }).orElseThrow(() -> new StudentNotFoundException(id));
    }

    @DeleteMapping("/students/{id}")
    String deleteUserById(@PathVariable Long id){
        if(!studentRepo.existsById(id))
        {
            throw new StudentNotFoundException(id);
        }
        studentRepo.deleteById(id);
        return "Student with id: "+id+" has been deleted successfully";
    }

}
