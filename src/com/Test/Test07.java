package com.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/11
 * \* Time: 20:08
 * \* To change this template use File | Settings | File Templates.
 * \* Description:策略模式，定义了一系列的算法，将每一种算法封装起来并可以相互替换使用
 * 策略模式让算法独立于使用它的客户应用而独立变化
 * 把可变的行为抽象出来，这样的好处是在真正使用时可以相互替换
 * \
 */
public class Test07 {
    public static void main(String[] args) {
        BaseService baseService = new UserService();
        baseService.setiSave(new FileSave());
        baseService.add("user");
    }
}
//把可变行为抽象出来，定义一些列算法
interface ISave{
    public void save(String data);
}
abstract class BaseService{
   /* public abstract void save(String data);
*/
    private ISave iSave;
    public void setiSave(ISave iSave){
        this.iSave = iSave;
    }
    public void add(String data){
        System.out.println("检查数据合法性。。。。。");
        iSave.save(data);
        System.out.println("数据保存完毕");
    }

}

/*class UserService extends BaseService{
    @Override
    public void save(String data) {
        System.out.println("把数据保存到文件中"+data);
    }
}*/
class FileSave implements ISave{
    @Override
    public void save(String data) {
        System.out.println("把数据保存到文件中"+data);
    }
}
class NetSave implements ISave{
    @Override
    public void save(String data) {
        System.out.println("把数据保存到网络中"+data);

    }
}
class UserService extends BaseService{

}