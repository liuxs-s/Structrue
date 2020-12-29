package com.cumt.list.impl;

import com.cumt.Exception.ArrayIsFullException;
import com.cumt.Exception.IndexOutOfBoundsException;
import com.cumt.list.LinearList;

/**
 * @description: 线性表-链表
 * @author: liuxiaosong
 * @Date: 2020/9/5
 * @version: 1.0
 */
public class LinkLinearList<E> implements LinearList<E> {

    private Node header;
    private Node tail;
    private int size;


    public LinkLinearList() {
        this.header = null;
        this.tail = null;
        size = 0;
    }

    public LinkLinearList(E element) {
        this.header = new Node(element,null);
        tail = header;
        size++;
    }


    class Node{
        private E data;
        private Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node() {
        }
    }
    @Override
    public void clear() {
        this.header = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int length() {
        return this.size;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E get(int index) {
        return getNodeByIndex(index).data;
    }

    public Node getNodeByIndex(int index){
        if(index < 0 || index > this.size - 1){
            throw new IndexOutOfBoundsException("下标越界异常...");
        }
        Node current = this.header;
        int i = 0;
        while (current != null){

            if(i == index){
                return current;
            }
            i++;
            current = current.next;
        }
        return null;
    }

    //指定位置范围内插入元素
    @Override
    public void insert(int index, E object) throws Exception {
        if(index < 0 || index > this.size){
            throw new IndexOutOfBoundsException("下标越界异常...");
        }
        Node node = new Node(object,null);
        //链表为空
        if(this.header == null){
            add(object);
        }else{
            //是否插入的是第一个节点
            if(index == 0){
                addAtHeader(object);
            }
            //插入的是最后一个节点后面
            else if(index == size){
                Node last = getNodeByIndex(index -1); //原来前边那个
                last.next = node;
                node.next = null;
                this.tail = node;
                size++;
            }else{
                Node last = getNodeByIndex(index -1); //原来前边那个
                Node next = last.next; //原来index处那个
                last.next = node;
                node.next = next;
                size++;
            }
        }
    }

    @Override
    public void delete(int index) throws Exception {
        if(index < 0 || index > this.size - 1){
            throw new IndexOutOfBoundsException("下标越界异常...");
        }
        if(this.size <= 0){
            throw new ArrayIsFullException("链表为空...");
        }
        //删除的是头结点
        if(index == 0){
            this.header = header.next;
        }else if(index == size -1) {
            Node last = getNodeByIndex(index -1);
            last.next = null;
            this.tail = last;
        }else {
                Node last = getNodeByIndex(index -1);
                last.next = last.next.next;
         }
        size--;

    }

    @Override
    public int indexOf(E object) {
        Node current = this.header;
        int i = 0;
        while (current != null){

            if(object.equals(current.data)){
                return i;
            }
            i++;
            current = current.next;
        }
        return -1;
    }

    @Override
    public void display() {
        Node node = header;
//        while (node != null){
//            System.out.print(node.data+",");
//            node = node.next;
//        }
        displayRecursion(node);
    }

    /**
     * 链表遍历递归实现
     * @param node
     */
    public void displayRecursion(Node node){
        if(node != null){
            System.out.println(node.data+",");
            if(node.next != null){//递归结束条件
                displayRecursion(node.next);
            }
        }

    }

    //尾插
    @Override
    public void add(E object) {
        //空链表
        if(this.header == null){
            Node node = new Node(object,null);
            this.header = node;
            this.tail = header;
        }else{
            Node node = new Node(object,null);
            tail.next = node;
//            this.tail = node;
            this.tail = tail.next;
        }
        size++;
    }

    public void addAtHeader(E object){
        Node node = new Node(object,null);
        //空链表
        if(this.header == null){
            this.header = node;
            this.tail = header;
        }else{
            node.next = header;
            header = node;
        }
        size++;
    }

    public void remove() throws Exception{
        delete(size -1);
    }

    public E getHeader(){
        if(header == null){
            return null;
        }
        return header.data;
    }

    public E getTail(){
        if(tail == null){
            return null;
        }
        return this.tail.data;
    }
}
