package com.cskaoyan.exception;

public class EmptyTreeException  extends  RuntimeException{
    public EmptyTreeException() {
    }

    public EmptyTreeException(String message) {
        super(message);
    }
}
