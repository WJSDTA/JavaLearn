/*
* String传递
*
* */
public class RefDemo3 {
    public static void main(String[] args) {
        Human h = new Human();
        method(h);
        System.out.println(h.name);
    }
    public static void method(Human human){
        human.name = "feifei";
    }
}
class Human{
    String name = "菲菲";
}
