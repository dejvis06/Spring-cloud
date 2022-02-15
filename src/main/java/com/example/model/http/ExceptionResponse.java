package com.example.model.http;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExceptionResponse {
    private LocalDateTime timestamp;
    private String message;
    private String details;
}
