package springbe.Controller;

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

    // bsit1
//    @GetMapping("/getBSIT1")
//    List<String> getAllBSIT1(){
//        return studentRepo.getAllBSIT1();
//    }
//
//    // bsit2
//    @GetMapping("/getBSIT2")
//    List<String> getAllBSIT2(){
//        return studentRepo.getAllBSIT2();
//    }
//
//    // bsit3
//    @GetMapping("/getBSIT3")
//    List<String> getAllBSIT3(){
//        return studentRepo.getAllBSIT3();
//    }
//
//    // bsit4
//    @GetMapping("/getBSIT4")
//    List<String> getAllBSIT4(){
//        return studentRepo.getAllBSIT4();
//    }
//
//    // bsis1
//    @GetMapping("/getBSIS1")
//    List<String> getAllBSIS1(){
//        return studentRepo.getAllBSIS1();
//    }
//
//    // bsis2
//    @GetMapping("/getBSIS2")
//    List<String> getAllBSIS2(){
//        return studentRepo.getAllBSIS2();
//    }
//
//    // bsis3
//    @GetMapping("/getBSIS3")
//    List<String> getAllBSIS3(){
//        return studentRepo.getAllBSIS3();
//    }
//
//    // bsis4
//    @GetMapping("/getBSIS4")
//    List<String> getAllBSIS4(){
//        return studentRepo.getAllBSIS4();
//    }
//
//    // bsc1
//    @GetMapping("/getBSCS1")
//    List<String> getAllBSCS1(){
//        return studentRepo.getAllBSCS1();
//    }
//
//    // bsc2
//    @GetMapping("/getBSCS2")
//    List<String> getAllBSCS2(){
//        return studentRepo.getAllBSCS2();
//    }
//
//    // bsc3
//    @GetMapping("/getBSCS3")
//    List<String> getAllBSCS3(){
//        return studentRepo.getAllBSCS3();
//    }
//
//    // bsc4
//    @GetMapping("/getBSCS4")
//    List<String> getAllBSCS4(){
//        return studentRepo.getAllBSCS4();
//    }
}
