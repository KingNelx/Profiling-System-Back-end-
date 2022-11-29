package Controller;

import Model.Faculty;
import Repository.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    @Autowired
    FacultyRepo facultyRepo;

    @PostMapping("/addFaculty")
    Faculty addFaculty(@RequestBody Faculty addFaculty){
        return facultyRepo.save(addFaculty);
    }

    @GetMapping("/getFaculty")
    List<Faculty>getFaculty(){
        return facultyRepo.findAll();
    }
}
