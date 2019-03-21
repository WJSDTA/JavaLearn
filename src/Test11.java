/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/3
 * \* Time: 11:22
 * \* To change this template use File | Settings | File Templates.
 * \* Description:单例设计模式
 * 1.懒汉式：第一次调用getinstance方法时被创建，到程序结束后释放
 * 2.饿汉式:类被加载后，对象呗创建，到程序结束后释放
 *
 * 单例的好处：
 * 1.在设计一些工具类的时候（通常工具类只有方法，没有属性）
 * 2.可能会被频繁调用
 *
 * 目的是为了节省重复创建对象所带来的内存消耗，从而来提高效率
 *
 * 能不能使用构造方法私有化和静态方法来创建单例呢？
 * \
 */
public class Test11 {
    public static void main(String[] args) {
     //  Singleton1 s = new Singleton1();
       /* Singleton1 s = Singleton1.getInstance();
        s.print();
        Singleton1 s1 = Singleton1.getInstance();
        s1.print();

        System.out.println(s==s1);*/
        Singleton2 s = Singleton2.getInstance();
        s.print();
        Singleton2 s2 = Singleton2.getInstance();
        s2.print();

        System.out.println(s==s2);
    }
}
//使用构造方法私有化和静态方法来实现工具类，比如说math
class Tools{
    private Tools(){}
    public static void print(){

    }
    public static void print1(){

    }
}
//饿汉式，占用内存时间长，效率高
class Singleton1{
    private Singleton1(){

    }
    private static Singleton1 s = new Singleton1();
    public static Singleton1 getInstance(){
        return s;
    }
    public void print(){
        System.out.println("测试方法");
    }

}
//懒汉式，占用内存时间短，效率低（懒加载，延迟加载）
//多线程访问时会有安全性问题
class Singleton2{
    private Singleton2(){};
    private static Singleton2 s;
    public static Singleton2 getInstance(){
        if (s == null){
           s = new Singleton2();
        }
        return s;
    }
    public void print(){
        System.out.println("测试方法");
    }
}