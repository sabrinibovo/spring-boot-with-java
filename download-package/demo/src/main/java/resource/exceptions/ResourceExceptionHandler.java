package resource.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException ex){
		 HttpStatus status = HttpStatus.NOT_FOUND;
	     StandardError error = new StandardError(status.value(), "Resource not found: " + ex.getMessage());
	     return ResponseEntity.status(status).body(error);
	    }
};
  