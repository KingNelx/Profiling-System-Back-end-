package springbe.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import java.util.Map;
import java.util.HashMap;

@ControllerAdvice
public class StudentNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(StudentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map <String, String> exceptionHandler(StudentNotFoundException exception){
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("Student data is not found ", exception.getMessage());
        return  errorMap;
    }
}
