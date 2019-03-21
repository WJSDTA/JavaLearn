/*
* 两个对象间的一对一关系
* 比如一个英雄对一个武器
* */
public class Test08 {
    public static void main(String[] args) {
         Hero h = new Hero("liubei",300);
         Weapon w = new Weapon("shuanggujian",3);
         //把两个对象关联起来
        h.setWeapon(w);
        w.setHero(h);

        //通过英雄获取信息
        String name = h.getName();
        Weapon weapon = h.getWeapon();
        int age = h.getAge();
        System.out.println(name+age+weapon.getName());
    }
}
class  Hero{
    private String name;
    private int age;
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Hero(){

    }
    public Hero(String name,int age)
    {
        this.age = age;
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
class Weapon{
    private String name;
    private int grade;
    private Hero hero;

    public Weapon(){}
    public Weapon(String name,int grade)
    {
        this.grade = grade;
        this.name = name;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Hero getHero() {
        return hero;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}