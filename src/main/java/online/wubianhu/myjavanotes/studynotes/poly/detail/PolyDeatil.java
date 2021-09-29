package online.wubianhu.myjavanotes.studynotes.poly.detail;

public class PolyDeatil {
    public static void main(String[] args) {
        Animal animal = new Cat();
        //向上转型：父类的引用指向子类对象
        animal.cry();
        animal.eat();
        animal.run();
        animal.sleep();



        //多态向下转型
        //（1）语法：子类类型 引用名 = （子类类型）父类引用名
        Cat cat = (Cat) animal;
        cat.catchmouse();
        //(2)要求父类引用必须指向的是当前目标类型的对象
        //Dog dog = (Dog) animal;

    }
}
