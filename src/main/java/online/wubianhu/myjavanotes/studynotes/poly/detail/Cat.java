package online.wubianhu.myjavanotes.studynotes.poly.detail;

public class Cat extends Animal{

    public void eat() {
        //方法重写了父类的eat
        System.out.println("小猫吃鱼");
    }

    public void catchmouse() {
        //cat特有的方法
        System.out.println("猫抓老鼠");
    }
}
