package dev.patika.vetapp.exception;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import java.time.Instant;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> illegalArgumentExceptionHandler(
            WebRequest request,
            IllegalArgumentException ex
    ) {

        return logAndReturnDefaultResponse(request, ex, HttpStatus.BAD_REQUEST);
    }


    @ResponseBody
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> notFoundExceptionHandler(
            WebRequest request,
            IllegalArgumentException ex
    ) {

        return logAndReturnDefaultResponse(request, ex, HttpStatus.NOT_FOUND);
    }

    @ResponseBody
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    public ResponseEntity<ErrorResponse> httpRequestMethodNotSupportedExceptionHandler(
            WebRequest request,
            IllegalArgumentException ex
    ) {
        return logAndReturnDefaultResponse(request, ex, HttpStatus.METHOD_NOT_ALLOWED);

    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ErrorResponse> exceptionHandler(WebRequest request, Exception ex) {

        return logAndReturnDefaultResponse(request, ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<ErrorResponse> logAndReturnDefaultResponse(
            WebRequest request,
            Exception ex,
            HttpStatus httpStatus
    ) {
        val response = createDefaultResponseFromWebRequest(request, ex, httpStatus);
        log.error(response.toString(), ex);
        return new ResponseEntity<>(response, httpStatus);
    }


    private ErrorResponse createDefaultResponseFromWebRequest(
            WebRequest request,
            Exception ex,
            HttpStatus httpStatus
    ) {

        return ErrorResponse.builder()
                .statusCode(httpStatus.value())
                .occurrenceDate(Instant.now())
                .message(ex.getMessage())
                .description(request.getDescription(false))
                .build();

    }
}
