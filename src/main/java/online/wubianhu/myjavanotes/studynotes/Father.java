package online.wubianhu.myjavanotes.studynotes;

/**
 * @author:Poker
 * @Date:2021/6/28 22:16
 */
public class Father {
    String name;
    int age;

//    public Father() {
//        System.out.println("父类中的无参构造器");
//    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类中的有参构造器");
    }
}
