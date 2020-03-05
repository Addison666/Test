package com.example.demo;

import com.example.demo.exception.RunTimeException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author THLiu i531384
 */
@RequestMapping("api/v1")
//@ControllerAdvice
public class BaseController {

    @ExceptionHandler(RuntimeException.class)
    public String exception(RuntimeException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(NullPointerException.class)
    public String nullException(Exception ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(RunTimeException.class)
    public JsonResponse RunTimeException(RunTimeException ex) {
        return JsonResponse.builder(ex.getCode(), false, null, ex.getMessage());
    }

    static class JsonResponse {
        public int code;
        public boolean status;
        public Object data;
        public String mes;

        public JsonResponse(int code, boolean status, Object data, String mes) {
            this.code = code;
            this.status = status;
            this.data = data;
            this.mes = mes;
        }

        public static JsonResponse builder(int code, boolean status, Object data, String mes){
            return new JsonResponse(code, status, data, mes);
        }
    }
}
