package online.wubianhu.myjavanotes.studynotes;

/**
 * @author:Poker
 * @Date:2021/6/28 22:18
 */
public class Son extends Father {
    public Son() {
        super("name",10);
        System.out.println("子类对象被创建");
    }

    public Son(String name, int age) {
//        super(name, age);
        super("name",20);
        System.out.println("子类中的无参构造器");
    }
}
