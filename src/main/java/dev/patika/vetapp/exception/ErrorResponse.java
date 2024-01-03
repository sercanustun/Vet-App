package dev.patika.vetapp.exception;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private Integer statusCode;
    private Instant occurrenceDate;
    private String message;
    private String description;
}
