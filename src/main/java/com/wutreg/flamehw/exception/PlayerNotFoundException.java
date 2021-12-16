package com.wutreg.flamehw.exception;

public class PlayerNotFoundException extends RuntimeException {

    public PlayerNotFoundException(Long id) {
        super("Could not find player " + id);
    }

}

