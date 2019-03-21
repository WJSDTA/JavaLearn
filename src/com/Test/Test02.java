package com.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/6
 * \* Time: 19:54
 * \* To change this template use File | Settings | File Templates.
 * \* Description:final关键字
 * 1.使用final声明一个属性，就是常量，常量的命名规则建议使用全大写,常量必须在定义时初始化或者在构造器中初始化
 * 2.final方法只能被继承，不能被重写
 * 3.final类没有子类，不能被继承
 * \
 */
public class Test02 {

    public static void main(String[] args) {
        System.out.println(Constant.PERSON_NUM);

    }
}
//常量类（工具类）
final class Constant{
    static final  int PERSON_NUM = 10;
}
class FinalClass{
    public final int DAY_NUM;
    FinalClass(){
        DAY_NUM = 10;
    }
    public final void print(){
        System.out.println("我是fianl");
    }
    public void set_Length(final int size){
      //  size++;

    }
}
class SubClass extends FinalClass{
    /*public void print(){

    }*/
    //
}