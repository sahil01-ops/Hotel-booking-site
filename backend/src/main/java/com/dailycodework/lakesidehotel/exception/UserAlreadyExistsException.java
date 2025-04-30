package com.dailycodework.lakesidehotel.exception;

/**
 * @author Simpson Alfred
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }

    public String getMessage() {

        return "User already exists with the given email address.";
    }
}
