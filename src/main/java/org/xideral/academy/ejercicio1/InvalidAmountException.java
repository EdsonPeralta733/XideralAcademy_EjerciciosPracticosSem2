package org.xideral.academy.ejercicio1;

// --- Excepciones ---
public class InvalidAmountException extends RuntimeException {
    // TODO: constructor que reciba mensaje
    public InvalidAmountException(String message) {
        super(message);
    }
}