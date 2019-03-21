package com.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: WJ
 * \* Date: 2019/3/11
 * \* Time: 20:53
 * \* To change this template use File | Settings | File Templates.
 * \* Description:object类
 * \
 */
public class Test08 {
    public static void main(String[] args) {
        Student student = new Student(1,"feifei",19);
        System.out.println(student.toString());
        Student s2 = new Student(1,"feifei",19);
        boolean b = student.equals(s2);
        System.out.println(b);
    }
}
class Student{
    private String name;
    private int sid;
    private int age;
    public  Student(){}
    public  Student(int sid, String name ,int age){
        this.age = age;
        this.sid =sid;
        this.name =name;

    }

    @Override
    public String toString() {
       // return super.toString();
        return "sid="+sid+",name="+name+",age="+age;
    }

    @Override
    //重写equals
    public boolean equals(Object obj) {
        if(this==obj)
        {
            return true;
        }
        if(obj instanceof Student){
            Student s = (Student) obj;
            if(!this.name.equals(s.name)){
                return false;
            }
            if(s.sid != this.sid){
                return false;
            }
            if(this.age != s.age)
            {
                return false;
            }
            return true;
        }
        return false;

    }
}