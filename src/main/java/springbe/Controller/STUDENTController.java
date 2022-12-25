package springbe.Controller;

import springbe.Exception.StudentNotFoundException;
import springbe.Model.Student;
import springbe.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class STUDENTController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/addStudent")
    Student addStudent(@RequestBody Student newStudent){
        return studentRepo.save(newStudent);
    }
    @PostMapping("/studCred")
    Student studCred (@RequestBody Student studCred) {
        return studentRepo.save(studCred);
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
            student.setGender(newStudent.getGender());
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
            student.setMothersAddress(newStudent.getMothersAddress());
            student.setMothersGivenName(newStudent.getMothersGivenName());
            student.setMothersMiddleName(newStudent.getMothersMiddleName());
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


    @GetMapping("/allBSIS")
    List<Student> getAllBSIS(){
        return studentRepo.findAllStudentByCourse("BSIS");
    }

    @GetMapping("/allBSIT")
    List<Student> getAllBSIT(){
        return studentRepo.findAllStudentByCourse("BSIT");
    }

    @GetMapping("/allBSCS")
    List<Student> getAllBSCS(){
        return studentRepo.findAllStudentByCourse("BSCS");
    }

    @GetMapping("/allMale")
    List<Student> getAllMales(){
        return studentRepo.findAllStudentsByGender("male");
    }

    @GetMapping("/allFemales")
    List<Student> getAllFemales(){
        return studentRepo.findAllStudentsByGender("female");
    }

    @GetMapping("/withScholar")
    List<Student> getAllScholar () {
        return studentRepo.findAllStudentByScholarship("yes");
    }

    @GetMapping("/withNoScholar")
    List<Student> getAllWithNoScholar () {
        return studentRepo.findAllStudentByScholarship("no");
    }

    @GetMapping("/getAllFromVirac")
    List<Student> getAllFromVirac(){
        return studentRepo.findAllStudentByPermanentAddress("Virac");
    }

    @GetMapping("/getAllFromSanAndress")
    List<Student> getAllFromSanAndress(){
        return studentRepo.findAllStudentByPermanentAddress("SanAndress");
    }

    @GetMapping("/getAllFromCaramoran")
    List<Student> getAllFromCaramoran(){
        return studentRepo.findAllStudentByPermanentAddress("Caramoran");
    }

    @GetMapping("/getAllFromViga")
    List<Student> getAllFromViga(){
        return studentRepo.findAllStudentByPermanentAddress("Viga");
    }

    @GetMapping("/getAllFromPandan")
    List<Student> getAllFromPandan(){
        return studentRepo.findAllStudentByPermanentAddress("Pandan");
    }

    @GetMapping("/getAllFromBato")
    List<Student> getAllFromBato(){
        return studentRepo.findAllStudentByPermanentAddress("Bato");
    }

    @GetMapping("/getAllFromSanMiguel")
    List<Student> getAllFromSanMiguel(){
        return studentRepo.findAllStudentByPermanentAddress("SanMiguel");
    }

    @GetMapping("/getAllFromBaras")
    List<Student> getAllFromBaras(){
        return studentRepo.findAllStudentByPermanentAddress("Baras");
    }

    @GetMapping("/getAllFromBagamanoc")
    List<Student> getAllFromBagamanoc(){
        return studentRepo.findAllStudentByPermanentAddress("Bagamanoc");
    }

    @GetMapping("/getAllFromPayo")
    List<Student> getAllFromPayo(){
        return studentRepo.findAllStudentByPermanentAddress("Payo");
    }

    @GetMapping("/getAllFromGigmoto")
    List<Student> getAllFromGigmoto(){
        return studentRepo.findAllStudentByPermanentAddress("Gigmoto");
    }

    @GetMapping("/getAllFrom1stYear")
    List<Student> getAllFrom1stYear(){
        return studentRepo.findAllStudentByYearLevel("1");
    }

    @GetMapping("/getAllFrom2ndYear")
    List<Student> getAllFrom2ndYear(){
        return studentRepo.findAllStudentByYearLevel("2");
    }

    @GetMapping("/getAllFrom3rdYear")
    List<Student> getAllFrom3rdYear(){
        return studentRepo.findAllStudentByYearLevel("3");
    }

    @GetMapping("/getALlFrom4thYear")
    List<Student> getAllFrom4thYear(){
        return studentRepo.findAllStudentByYearLevel("4");
    }
}
