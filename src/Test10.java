/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/3
 * \* Time: 11:04
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * 1.代码块
 * 普通代码块：在方法中写的代码块
 * 构造块：类中定义的代码块，在创建对象时被调用，优于构造方法执行
 * 静态代码块：在类中使用static定义的代码块。在第一次使用的时候被调用，只会执行一次，优于构造快执行
 * 我们在项目开发的过程中，通常会使用静态代码块初始化只调用一次的数据
 * 重点：静态代码块，普通代码块，同步代码块，构造快
 *
 *
 * \
 */
public class Test10 {
    public static void main(String[] args) {
        Student student = new Student();
    }
}
class Student{
    static {
        System.out.println("我是静态代码块");
    }
    {
        System.out.println("我是构造快");
    }
    public Student(){
        System.out.println("我是构造方法");
    }
    public  void  study(){
       //限制作用域
        {
            System.out.println("我是普通代码块");
        }
    }

}