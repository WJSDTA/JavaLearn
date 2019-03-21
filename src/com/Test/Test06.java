package com.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/11
 * \* Time: 19:53
 * \* To change this template use File | Settings | File Templates.
 * \* Description:模板方法模式
 * 定义一个操作中的算法的骨架，而将一些可变部分的实现延迟到子类中
 * 模板方法模式使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定的步骤
 * \
 */
public class Test06 {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.action("admin","action");
    }
}
abstract class BaseManager{
    public void action(String name,String method){
        if ("admin".equals(name))
        {
        execute(method);
        }else{
            System.out.println("你没有操作权限");
        }
    }
    public abstract void execute(String method);
}
class UserManager extends BaseManager{
    public void execute(String method){
        //用户是否登录的验证，验证成功了才可以执行以下操作
        if("add".equals(method)){
            System.out.println("执行了添加操作");
        }
        else if("del".equals(method)){
            System.out.println("执行了删除操作");
        }
    }
}