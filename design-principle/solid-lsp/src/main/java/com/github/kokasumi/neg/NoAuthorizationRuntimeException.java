package com.github.kokasumi.neg;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/3 17:55
 * @description
 * @since v1.0
 */
public class NoAuthorizationRuntimeException extends RuntimeException{
    public NoAuthorizationRuntimeException(String message) {
        super(message);
    }
}
