/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/3
 * \* Time: 10:02
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * static关键字
 * 1.静态方法或变量，不属于对象，但是依赖类
 * 2.静态变量是全局变量，生命周期从类加载后，到程序结束
 * 3.静态变量只有一份，在静态方法区中存放
 * 4.静态变量是本类对象共享一份
 * 5.建议不要用对象名去调用静态数据，直接使用类名调用
 * 6.static修饰一个方法，不属于对象，但是依赖类，不建议使用对象调用，直接使用方法调用
 * 7.静态方法不能访问非静态方法和属性，只能访问静态
 * \
 */
public class Test09 {
    public static void main(String[] args) {
       // Role liu = new Role("liubei","蜀国");
    //    Role guan = new Role("guanyunchang","蜀国");
        Role liu = new Role("liubei");
        Role guan = new Role("guanyunchang");
        System.out.println(liu.getInfo());
        System.out.println(guan.getInfo());
        System.out.println(liu.country);
        System.out.println(guan.country);
        System.out.println("----------------------------------------------");
        liu.country = "秦国";
        System.out.println(liu.country);
        System.out.println(guan.country);
        System.out.println("----------------------------------------------");
        System.out.println(Role.country);
    }
}
class Role{
    private String name;
   // private String country;
    static String country = "蜀国";//静态变量，全局变量
    public Role(){}
    public Role(String name,String country){
        this.country = country;
        this.name = name;
    }
    public Role(String name){
      //  this.country = country;
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //静态方法不能访问非静态数据
    public void setCountry(String country){
        Role.country= country;
    }
   /* public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }*/
    public String getInfo(){
        return name+"  "+country;
    }
}