package ltts.com.EmployeeApplication.exception;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalTime;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

//    @ExceptionHandler(ResourceNotFoundException.class)
//    @ResponseStatus(value = HttpStatus.NOT_FOUND)

    public Object ExceptionResponsehandleResourceNotFound(final ResourceNotFoundException exception ,
                                                                     final HttpServletRequest request)
    {
        ExceptionResponse error=new ExceptionResponse();
        error.setErrorMessage(exception.getMessage());
        error.setRequestedURI(request.getRequestURI());
        error.setTimeStamp(LocalTime.now().toString());

        return error;
    }
}
