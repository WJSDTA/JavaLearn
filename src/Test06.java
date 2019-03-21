/*?
*
* 如果没有封装性，可以直接访问属性
* 提供工友的方法
* */
public class Test06 {
    public static void main(String[] args) {
        Person p =new Person();
       // p.age=19;
        //p.name = "ss";
        p.setAge(19);
        p.setName("11");
    }
}
class Person{
   private String name;
   private   int age;
   public void setName(String
                               name)
   {
      this.name = name ;
   }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
