package Controller;

import Model.Faculty;
import Repository.FacultyRepo;
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
@RequestMapping("/faculty")
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
