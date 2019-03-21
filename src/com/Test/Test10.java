package com.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/13
 * \* Time: 20:27
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 代理模式
 * \
 */
public class Test10 {
    public static void main(String[] args) {
        Action useraction = new UserAction();
        ActionProxy actionProxy = new ActionProxy(useraction);
        actionProxy.doAction();
    }
}
class ActionProxy implements Action{
    private Action target;//被代理对象
    public ActionProxy( Action target){
        this.target = target;

    }
    @Override
    public void doAction() {
        long startTime = System.currentTimeMillis();
        target.doAction();//执行真正任务
        long endTime = System.currentTimeMillis();
        System.out.println("total time"+(endTime -startTime));

    }
}
interface Action{
    public void doAction();
}
class UserAction implements Action{
    @Override
    public void doAction() {
        for (int i = 0; i <10000 ; i++) {
            for (int j = 0; j < 100; j++) {

            }
        }

        System.out.println("用户开始工作。。。。。");
    }
}