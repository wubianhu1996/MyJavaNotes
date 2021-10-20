package online.wubianhu.myjavanotes.studynotes.codeBlock;

public class StaticCodeBlock03 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA{
    {
        System.out.println("aaa的普通代码块");
    }
    public AAA(){
        System.out.println("aaa的构造器被调用");
    }
}

class BBB extends AAA{

    {
        System.out.println("bbb的普通代码块");
    }

    public BBB(){
        //1.super();
        //2.调用本类的普通代码块
        System.out.println("bbb的构造器被调用");
    }
}
