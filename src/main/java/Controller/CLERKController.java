package Controller;

import Model.Clerk;
import Repository.ClerkRepo;
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
@RequestMapping("/clerk")
public class CLERKController {

    @Autowired
    private ClerkRepo clerkRepo;

    @PostMapping("/addClerk")
    Clerk addClerk(@RequestBody Clerk newClerk){
        return clerkRepo.save(newClerk);
    }

    @GetMapping("/getClerk")
    List<Clerk> getClerk(){
        return clerkRepo.findAll();
    }
}
