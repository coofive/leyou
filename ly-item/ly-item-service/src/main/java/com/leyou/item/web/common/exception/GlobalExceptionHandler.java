package com.leyou.item.web.common.exception;

import com.leyou.common.constants.StatusCode;
import com.leyou.common.dto.ResultDTO;
import com.leyou.common.utils.ResponseGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 11/7/2018 10:27 PM
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.OK)
    protected ResultDTO handlerException(Exception e) {
        e.printStackTrace();
        return ResponseGenerator.fail(StatusCode.SYSTEM_ERROR);
    }

}
