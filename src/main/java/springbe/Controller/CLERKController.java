package springbe.Controller;

import springbe.Model.Clerk;
import springbe.Repository.ClerkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clerk")
@CrossOrigin("http://localhost:3000/")
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
