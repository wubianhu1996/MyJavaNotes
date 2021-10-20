package online.wubianhu.myjavanotes.studynotes.codeBlock;

public class StaticCodeBlock02 {
    public static void main(String[] args) {
        Demo demo = new Demo();

    }
}

class Demo{

    public Demo(){
        System.out.println("demo无惨构造");
    }

    //静态属性初始化
    private static int a = get1();

    private int b = get2();

    //非静态代码块
    {
        System.out.println("demo的非静态代码块");
    }

    //静态代码块
    static {
        System.out.println("demo的静态代码块被调用");
    }

    public static int get1(){
        System.out.println("get1静态方法被调用");
        return 100;
    }

    public int get2(){
        System.out.println("get2非静态方法被调用");
        return 99;
    }


}
