package com.example.demo.exception;

/**
 * @author THLiu i531384
 */
public class RunTimeException extends RuntimeException {

    public int code;

    public RunTimeException(int code, String mes) {
        super(mes);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
