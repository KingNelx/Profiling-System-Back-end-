package Controller;

import Model.Student;
import Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @PostMapping("/addStudent")
    Student addStudent(@RequestBody Student addStudent){
        return studentRepo.save(addStudent);
    }

    @GetMapping("/getAllStudents")
    List<Student>getAllStudents(){
        return studentRepo.findAll();
    }

    // bsis
    @GetMapping("/getAllBSIS1")
    List<Student>getAllBSIS1(){
        return studentRepo.getAllBSIS1();
    }

    @GetMapping("/getAllBSIS2")
    List<Student>getAllBSIS2(){
        return studentRepo.getAllBSIS2();
    }

    @GetMapping("/getAllBSIS3")
    List<Student>getAllBSIS3(){
        return studentRepo.getAllBSIS3();
    }

    @GetMapping("/getAllBSIS4")
    List<Student>getAllBSIS4(){
        return studentRepo.getAllBSIS4();
    }

    // bsit

    @GetMapping("/getAllBSIT1")
    List<Student>getAllBSIT1(){
        return studentRepo.getAllBSIT1();
    }

    @GetMapping("/getAllBSIT2")
    List<Student>getAllBSIT2(){
        return studentRepo.getAllBSIT2();
    }

    @GetMapping("/getAllBSIT3")
    List<Student>getAllBSIT3(){
        return studentRepo.getAllBSIT3();
    }

    @GetMapping("/getAllBSIT4")
    List<Student>getAllBSIT4(){
        return studentRepo.getAllBSIT4();
    }

    // bscs

    @GetMapping("/getAllBSCS1")
    List<Student>getAllBSCS1(){
        return studentRepo.getAllBSCS1();
    }

    @GetMapping("/getAllBSCS2")
    List<Student>getAllBSCS2(){
        return studentRepo.getAllBSCS2();
    }

    @GetMapping("/getAllBSCS3")
    List<Student>getAllBSCS3(){
        return studentRepo.getAllBSCS3();
    }

    @GetMapping("/getAllBSCS4")
    List<Student>getAllBSCS4(){
        return studentRepo.getAllBSCS4();
    }


}
