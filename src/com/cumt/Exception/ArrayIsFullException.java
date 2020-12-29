package com.cumt.Exception;

/**
 * @description: 数组已经满异常
 * @author: liuxiaosong
 * @Date: 2020/9/5
 * @version: 1.0
 */
public class ArrayIsFullException extends RuntimeException{
    public ArrayIsFullException() {
    }

    public ArrayIsFullException(String message) {
        super(message);
    }
}
