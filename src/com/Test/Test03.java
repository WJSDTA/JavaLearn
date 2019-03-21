package com.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/6
 * \* Time: 20:36
 * \* To change this template use File | Settings | File Templates.
 * \* Description:抽象类：用abstract关键字声明的类，就是抽象类
 *
 * \
 */
public class Test03 {
    public static void main(String[] args) {
        Man man = new Man();
        man.eat();
        man.move();
        Women women = new Women();
        women.eat();
        women.move();
        women.sleep();
    }
}
abstract class Animal{
    public abstract void move();
}
abstract class Person extends Animal{
    public abstract void eat();
    public void  sleep(){
        System.out.println("sleep");
    }
}
class Man extends Person{//继承抽象类的具体类必须实现所有抽象方法
    @Override
    public void eat() {
        System.out.println("I am Man,eat");
    }

    @Override
    public void move() {
        System.out.println("I am Man,run");
    }
}
class Women extends Person{
    @Override
    public void move() {
        System.out.println("I am woMan,run");
    }

    @Override
    public void eat() {
        System.out.println("I am woMan,eat");
    }
}