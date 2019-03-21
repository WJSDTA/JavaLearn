package com.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/11
 * \* Time: 21:18
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 简单工厂模式
 * \
 */
public class Test09 {
    public static void main(String[] args) {
        //使用者和被使用者两者之间，耦合，产生了依赖，当被使用这改变时，会影响使用者
        //使用工厂模式降低两者之间的依赖
        Product phone = ProductFactory.getProduct("phone");
        phone.work();
    }
}
class ProductFactory{
    public static Product getProduct(String name){
        if("phone".equals(name)){
            return new Phone();
        }
        else if("Computer".equals(name)){
            return new Computer();
        }
        else {

            return null;
        }
    }
}
interface Product{
    public void work();
}
class Phone implements Product{
    @Override
    public void work() {
        System.out.println("手机开始工作");
    }
}
class Computer implements Product{
    @Override
    public void work() {
        System.out.println("电脑开始工作");
    }
}