package com.paulo.usermanagementapi.dto;

import java.time.LocalDateTime;

public class ErrorResponse {

        private int status;
        private String message;
        private LocalDateTime timestamp;


        public ErrorResponse(int value, String message, LocalDateTime now) {
        }
}
