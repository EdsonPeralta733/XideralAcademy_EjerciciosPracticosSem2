package org.xideral.academy.ejercicio1;

// --- Excepciones ---
public class AccountLockedException extends Exception {
    // TODO: constructor que reciba mensaje
    public AccountLockedException(String message) {
        super(message);
    }
}