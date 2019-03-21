package com.Test01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/13
 * \* Time: 20:59
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 内部类
 * 1.成员内部类
 * 2.方法内部类
 * \
 */
public class Test01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //在外部创建成员内部类，因为成员内部类需要依赖外部类的对象，通常不建议这样做
        /*Outer.Inner inner = outer.new Inner();
        inner.print();*/
        outer.innerPrint();
        outer.show();
    }
}
class Outer{
    private String name;
    //建议在外部类中定义一个方法来访问内部类
    public void  innerPrint(){
        Inner inner = new Inner();
        inner.print();
    }
    //成员内部类
    private class Inner{
        public void print(){
            System.out.println("inner");
        }

    }
    /*方法内部类*/
    public void show(){
        final  int x = 10;
        class Inner2{
            public void print(){
               // x++;
                System.out.println("方法内部类"+x);
            }
        }
        Inner2 inner2 = new Inner2();
        inner2.print();
    }
}