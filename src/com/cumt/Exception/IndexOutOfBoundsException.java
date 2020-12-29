package com.cumt.Exception;

/**
 * @description: 越界异常
 * @author: liuxiaosong
 * @Date: 2020/9/5
 * @version: 1.0
 */
public class IndexOutOfBoundsException extends RuntimeException{
    public IndexOutOfBoundsException(String message) {
        super(message);
    }

    public IndexOutOfBoundsException() {
    }
}
