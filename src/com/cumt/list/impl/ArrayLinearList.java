package com.cumt.list.impl;

import com.cumt.Exception.ArrayIsFullException;
import com.cumt.Exception.IndexOutOfBoundsException;
import com.cumt.list.LinearList;

import java.util.Arrays;

/**
 * @description: 线性表的顺序存储结构
 * @author: liuxiaosong
 * @Date: 2020/9/5
 * @version: 1.0
 */
public class ArrayLinearList<T> implements LinearList<T> {

    private int INIT_LENGTH = 10;

    private int length;
    private int size;
    private Object[] value;

    public ArrayLinearList(int length) {
        this.length = length;
        this.value = new Object[length];
    }

    public ArrayLinearList() {
        this.length = INIT_LENGTH;
        this.value = new Object[INIT_LENGTH];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        this.size = 0;
        Arrays.fill(value, null);
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index > this.length - 1){
            throw new IndexOutOfBoundsException("下标越界异常...");
        }
        return (T)value[index];
    }

    @Override
    public void insert(int index, T object) throws Exception {
        if(index < 0 || index > this.length - 1){
            throw new IndexOutOfBoundsException("下标越界异常...");
        }
        if(this.size == this.length){
            throw new ArrayIsFullException("顺序表已经满,暂不支持扩容...");
        }
        for(int i = size;i > index;i--){
            value[i] = value[i-1];
        }
        value[index] = object;
        size++;
    }

    @Override
    public void delete(int index) throws Exception {
        if(index < 0 || index > this.length - 1){
            throw new IndexOutOfBoundsException("下标越界异常...");
        }
        for(int i = index;i < size - 1;i++){
            value[i] = value[i+1];
        }
        size--;
    }

    @Override
    public int indexOf(T object) {
        for(int i = 0;i < this.size;i++){
            if(object.equals(value[i])){
                return i;
            }

        }
        return -1;
    }

    @Override
    public void add(T object) {
        if(this.size == this.length){
            throw new ArrayIsFullException("顺序表已经满,暂不支持扩容...");
        }
        value[size] = object;
        size++;
    }

    @Override
    public void display() {
        for(int i = 0;i < this.size;i++){
            System.out.println("第"+(i+1)+"个元素是"+value[i]);
        }
    }
}
