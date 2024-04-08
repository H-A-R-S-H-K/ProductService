package com.sst.productservice.exceptionhandler;

import com.sst.productservice.dtos.ExceptionDto;
import com.sst.productservice.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleProductNotFoundException(ProductNotFoundException productNotFoundException) {
        ExceptionDto dto = new ExceptionDto();

        dto.setMessage("Invalid productID " + productNotFoundException.getId() + " passed");
        dto.setResolution("ProductNotFoundException caught");

        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        return response;
    }
}
