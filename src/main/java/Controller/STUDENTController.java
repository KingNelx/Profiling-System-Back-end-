package Controller;

import Model.Student;
import Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@RequestMapping("/student")
public class STUDENTController {

    @Autowired
    StudentRepo studentRepo;

    @PostMapping("/addStudent")
    Student addStudent(@RequestBody Student newStudent){
        return studentRepo.save(newStudent);
    }

    @GetMapping("/getAllStudents")
    List<Student> getAllStudents(){
        return studentRepo.findAll();
    }


}
