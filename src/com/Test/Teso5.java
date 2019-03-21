package com.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/7
 * \* Time: 9:55
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Teso5 {
    public static void main(String[] args) {
        //用父类的引用指向子类对象（用大的类型来表示小的类型），自动转换（向上转型）
        Chicken hc = new HomeChicken("xiaojiji");
       // hc.eat();
        Chicken yc = new YeChicken("dajiji");
        yc.eat();
       // hc = yc;
       // hc.eat();
        eat(yc);
        eat(hc);
        Chicken jjc = new JianjiaoChicken("jianjiaoji");
        eat(jjc);
    }
    //抽象（粒度）面向抽象编程（面向接口编程）
    public  static  void eat(Chicken c){
        System.out.println("jichifan");
        c.eat();

        //当我们需要把父类的实力强制转换为子类引用时，为避免类型转换异常，
        //那么我们需要在转换之前做类型检查
        if(c instanceof  JianjiaoChicken)
        {
            JianjiaoChicken jjc = (JianjiaoChicken) c;//强制类型转换
            jjc.song();
        }


    }
}
abstract class Chicken{
    private String name;
    public Chicken(){}
    public Chicken(String name){
        this.name =name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    abstract public void  eat();
}
class HomeChicken extends Chicken{
    public HomeChicken(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"I like eat");
    }
}
class YeChicken extends Chicken{
    public YeChicken(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"I like eat chong");
    }
}

class JianjiaoChicken extends Chicken{
    public JianjiaoChicken(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"wobuchidongxi");
    }
    public  void song(){
        System.out.println("唧唧复唧唧，我是尖椒鸡");
    }
}