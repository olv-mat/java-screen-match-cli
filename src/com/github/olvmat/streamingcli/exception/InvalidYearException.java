package com.github.olvmat.streamingcli.exception;

public class InvalidYearException extends RuntimeException {
    private final String message;

    public InvalidYearException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
