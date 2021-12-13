package com.company.demo.DATATYPE;

public class MainFinalObj {
    public static void main(String[] args) {

  final  W a=new W("WWW",11);
        W b=new W("QQQ",22);
//        a=b;Error
      a.setName("VVV");
      a.setAge(999);
        System.out.println(a);
        System.out.println(b);
        int e=5;
        int c=7;
        e=c;

        System.out.println(e);
        System.out.println(c);


    }

}
class W {
    String name;
    int age;

    public W(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "W{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}