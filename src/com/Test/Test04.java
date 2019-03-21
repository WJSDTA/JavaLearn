package com.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/7
 * \* Time: 9:29
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Test04 {
    public static void main(String[] args) {
    Girl girl = new Girl();
    girl.eat();
    girl.run();
    girl.sleep();
    }
}

interface IEat{
    //public abstract void eat();//接口中只能定义抽象方法
    void eat();//接口中没有定义修饰符，默认为public abstract
    //public static final int NUM =10;
    int NUM  =10;
    public default void print(){
        System.out.println("hello");
    }//JDK 1.8新特性，  可以被所有实现类继承
}
interface IRun {
    void run();
}
//接口可以多继承，类不能多继承
interface ISleep extends IEat,IRun{
    void sleep();
}
class Girl implements ISleep,IEat{
    private String name;
    public Girl(String name){
        this.name = name;

    }
    public Girl(){}

    @Override
    public void eat() {
        System.out.println("I am "+name+"I eat");
    }

    @Override
    public void run() {
        System.out.println("I am "+name+"I run");
    }

    @Override
    public void sleep() {
        System.out.println("I am "+name+"I sleep");
    }
}