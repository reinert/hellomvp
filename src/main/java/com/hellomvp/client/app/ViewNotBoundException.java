package com.hellomvp.client.app;

public class ViewNotBoundException extends RuntimeException {

    public ViewNotBoundException() {
    }

    public ViewNotBoundException(String s) {
        super(s);
    }

    public ViewNotBoundException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
