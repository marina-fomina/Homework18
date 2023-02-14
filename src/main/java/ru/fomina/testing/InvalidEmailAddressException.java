package ru.fomina.testing;

public class InvalidEmailAddressException extends RuntimeException {
    public InvalidEmailAddressException() {
    }

    public InvalidEmailAddressException(String message) {
        super(message);
    }
}
