package springbe.Controller;


import springbe.Model.Admin;
import springbe.Repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:3000/")
public class ADMINController {

    @Autowired
    AdminRepo adminRepo;

    @PostMapping("/addAdmin")
    Admin addAdmin(@RequestBody Admin newAdmin){
        return adminRepo.save(newAdmin);
    }

    @GetMapping("/getAllAdmins")
    List<Admin>getAllAdmins(){
        return adminRepo.findAll();
    }
}
