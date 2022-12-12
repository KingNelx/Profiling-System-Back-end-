package springbe.Exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(Long id){
        super("Could not found the user with: " + id);
    }
}
