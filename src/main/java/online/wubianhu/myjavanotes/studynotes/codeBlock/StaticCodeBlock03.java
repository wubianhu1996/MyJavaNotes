package online.wubianhu.myjavanotes.studynotes.codeBlock;

public class StaticCodeBlock03 {
    public static void main(String[] args) {
//        new BBB();
        new CCC();
    }
}

class AAA{

    public int a = getValueA();
    {
        System.out.println("aaa的普通代码块");
    }

    static {
        System.out.println("aaa的静态代码块");
    }
    public AAA(){
        System.out.println("aaa的构造器被调用");
    }

    public int getValueA() {
        System.out.println("aaa的普通方法被调用");
        return 100;
    }

    public static int getstaticvaluea() {
        System.out.println("aaa的静态方法被调用");
        return 11;
    }
}

class BBB extends AAA{
    public int b = getValueB();
    {
        System.out.println("bbb的普通代码块");
    }

    static {
        System.out.println("bbb的静态代码块");
    }

    public BBB(){
        //1.super();
        //2.调用本类的普通代码块
        System.out.println("bbb的构造器被调用");
    }
    public int getValueB() {
        System.out.println("bbb的普通方法被调用");
        return 100;
    }

    public static int getstaticvaluea() {
        System.out.println("bbb的静态方法被调用");
        return 11;
    }
}

class CCC extends BBB{

    public int c = getValueC();
    {
        System.out.println("ccc的普通代码块");
    }

    static {
        System.out.println("ccc的静态代码块");
    }

    public CCC() {
        System.out.println("ccc的构造器被调用");
    }

    public int getValueC() {
        System.out.println("ccc的普通方法被调用");
        return 100;
    }


    public static int getstaticvaluea() {
        System.out.println("ccc的静态方法被调用");
        return 11;
    }
}
