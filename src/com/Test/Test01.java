package com.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/3
 * \* Time: 20:35
 * \* To change this template use File | Settings | File Templates.
 * \* Description:继承：从已有的类产生新的类
 *
 * protect权限修饰符，子类中可以访问
 * \
 */
public class Test01 {
    public static void main(String[] args) {
        HusyDog husyDog = new HusyDog();


    }
}
class Dog{
    protected String name;
    private String sex;
    public void eat(){
        System.out.println("gouliang");
    }
}
//继承只能继承非私有的东西
class HomeDog extends Dog{
    public void print(){
        System.out.println("我是一只家狗");
    }
}
class HusyDog extends Dog{
    public void show(){
        System.out.println("I can dance!");
    }
}