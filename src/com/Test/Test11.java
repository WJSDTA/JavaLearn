package com.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/13
 * \* Time: 20:40
 * \* To change this template use File | Settings | File Templates.
 * \* Description:适配器模式
 * \
 */
public class Test11 {
    public static void main(String[] args) {
        PowerA powerA = new PowerAImpl();
        work(powerA);
        PowerB powerB = new PowerBImpl();
        Adapter adapter = new Adapter(powerB);
        work(adapter);
    }
    public static  void work(PowerA a){
        System.out.println("正在连接。。");
        a.insert();
        System.out.println("工作结束。。。。");
    }
}
interface PowerA{
    public void insert();
}
class PowerAImpl implements  PowerA{
    @Override
    public void insert() {
        System.out.println("电源A开始工作。。。。");
    }
}
interface PowerB{
    public void connet();
}
class PowerBImpl implements PowerB{
    @Override
    public void connet() {
        System.out.println("电源B开始工作。。。");
    }
}
//适配器
class Adapter implements PowerA{
    private PowerB powerB;
    public Adapter(PowerB powerB){
        this.powerB = powerB;
    }
    @Override
    public void insert() {
        powerB.connet();
    }
}
interface Animal1{
    public void sing();
    public void cry();
    public void run();
    public void swim();


}
//适配器
abstract  class  AnimalFunction implements Animal1{

    public void sing() {

    }


    public void run() {

    }


    public void cry() {

    }


    public void swim() {

    }
}
class Dog1 extends AnimalFunction{
    @Override
    public void sing() {

    }

    @Override
    public void run() {

    }

    @Override
    public void cry() {

    }

    @Override
    public void swim() {

    }
}