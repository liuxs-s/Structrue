package com.cumt.test;

import com.cumt.list.LinearList;
import com.cumt.list.impl.ArrayLinearList;
import com.cumt.list.impl.LinkLinearList;
import org.junit.Test;

/**
 * @description: 顺序表测试类
 * @author: liuxiaosong
 * @Date: 2020/9/5
 * @version: 1.0
 */
public class ArrayLinearListTest {

    @Test
    public void fun1() throws Exception {
        LinearList<Integer> list = new ArrayLinearList();
        System.out.println("list.size()："+list.size());
        System.out.println("list.isEmpty()："+list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        //list.add(1);
        System.out.println("list.size()："+list.size());
        list.display();
        System.out.println("---------------------------");
        list.insert(3,33);
        System.out.println("list.size()："+list.size());
        list.display();

        System.out.println("---------------------------");
        list.delete(3);
        list.display();

        System.out.println("list.length()："+list.length());
        System.out.println("list.size()："+list.size());

        System.out.println("list.indexOf()："+list.indexOf(6));
        list.clear();
        list.display();
    }

    @Test
    public void fun2() throws Exception {
        LinkLinearList<Integer> list = new LinkLinearList<>();
        System.out.println("size:"+list.size());
        System.out.println("list:");
        list.display();
        System.out.println("header:"+list.getHeader());
        System.out.println("tail:"+list.getTail());
        System.out.println("-------------------------------");


        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println("size:"+list.size());
        System.out.println("list:");
        list.display();
        System.out.println("header:"+list.getHeader());
        System.out.println("tail:"+list.getTail());
        System.out.println("--------------add方法-----------------");

        list.add(10);
        System.out.println("size:"+list.size());
        System.out.println("list:");
        list.display();
        System.out.println("header:"+list.getHeader());
        System.out.println("tail:"+list.getTail());
        System.out.println("--------------add尾插-----------------");

        list.delete(0);
        System.out.println("size:"+list.size());
        System.out.println("list:");
        list.display();
        System.out.println("header:"+list.getHeader());
        System.out.println("tail:"+list.getTail());
        System.out.println("---------------delete头部删除----------------");

        list.delete(2);
        System.out.println("size:"+list.size());
        System.out.println("list:");
        list.display();
        System.out.println("header:"+list.getHeader());
        System.out.println("tail:"+list.getTail());
        System.out.println("---------------delete中间删除----------------");

        list.delete(2);
        System.out.println("size:"+list.size());
        System.out.println("list:");
        list.display();
        System.out.println("header:"+list.getHeader());
        System.out.println("tail:"+list.getTail());
        System.out.println("---------------delete尾部删除----------------");

        list.remove();
        System.out.println("size:"+list.size());
        System.out.println("list:");
        list.display();
        System.out.println("header:"+list.getHeader());
        System.out.println("tail:"+list.getTail());
        System.out.println("---------------delete尾部删除2----------------");

        list.addAtHeader(-1);
        System.out.println("size:"+list.size());
        System.out.println("list:");
        list.display();
        System.out.println("header:"+list.getHeader());
        System.out.println("tail:"+list.getTail());
        System.out.println("---------------addAtHeader插入----------------");

        list.insert(1,-2);
        System.out.println("size:"+list.size());
        System.out.println("list:");
        list.display();
        System.out.println("header:"+list.getHeader());
        System.out.println("tail:"+list.getTail());
        System.out.println("---------------insert中间插入----------------");

        list.insert(0,-3);
        System.out.println("size:"+list.size());
        System.out.println("list:");
        list.display();
        System.out.println("header:"+list.getHeader());
        System.out.println("tail:"+list.getTail());
        System.out.println("---------------insert头部插入----------------");

        list.insert(4,-4);
        System.out.println("size:"+list.size());
        System.out.println("list:");
        list.display();
        System.out.println("header:"+list.getHeader());
        System.out.println("tail:"+list.getTail());
        System.out.println("---------------insert头部插入----------------");

        System.out.println(list.get(3));

        System.out.println(list.isEmpty());

        System.out.println(list.indexOf(-2));
        System.out.println(list.indexOf(8));
        list.clear();
        System.out.println("header:"+list.getHeader());
        System.out.println("tail:"+list.getTail());
    }


}
