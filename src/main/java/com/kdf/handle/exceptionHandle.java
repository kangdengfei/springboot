package com.kdf.handle;

import com.kdf.entity.Result;
import com.kdf.util.ResultUtil;
import exception.BookException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created  by KDF on 2017/12/4.
 */

@ControllerAdvice
public class exceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof BookException){
            BookException bookException = (BookException) e;
            return ResultUtil.error(bookException.getCode(),bookException.getMessage());
        }
        else
            return null;
    }
}
