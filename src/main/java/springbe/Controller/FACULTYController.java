package springbe.Controller;

import springbe.Model.Faculty;
import springbe.Repository.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")
@CrossOrigin("http://localhost:3000/")
public class FACULTYController {

    @Autowired
    private FacultyRepo facultyRepo;

    @PostMapping("/addFaculty")
    Faculty addFaculty(@RequestBody Faculty newFaculty){
        return facultyRepo.save(newFaculty);
    }

    @GetMapping("/getFaculty")
    List<Faculty> getFaculty(){
        return facultyRepo.findAll();
    }
}
