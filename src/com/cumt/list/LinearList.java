package com.cumt.list;

/**
 * @description: 线性表
 * @author: liuxiaosong
 * @Date: 2020/9/5
 * @version: 1.0
 */
public interface LinearList<T>{

    public void clear();

    public boolean isEmpty();

    public int length(); //容器的大小

    public int size(); //实际元素数量

    public T get(int index);

    public void insert(int index,T object) throws Exception;

    public void delete(int index) throws Exception;

    public int indexOf(T object);

    public void display();

    public void add(T object); //默认尾插


}
