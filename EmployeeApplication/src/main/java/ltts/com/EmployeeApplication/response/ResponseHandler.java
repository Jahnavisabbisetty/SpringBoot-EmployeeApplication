package ltts.com.EmployeeApplication.response;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public static ResponseEntity< Object>resBuilder(String message, HttpStatus httpStatus)
    {

        HttpHeaders headers=new HttpHeaders();
        headers.add("Organization","ltts");
        Map<String,Object> response=new HashMap<>();
        response.put("message",message);
        response.put("httpStatus",httpStatus);
       return new ResponseEntity<>(response,headers,httpStatus);
    }
}
