public class Test07 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat("11",11);
    }
}
class Cat{
    private String name;
    private int age;
    public Cat(){
        System.out.println("构造方法执行了！");
    }
    public Cat(String name,int age)
    {
        this.age = age;
        this.name = name;
        System.out.println("liang构造方法执行了！");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}