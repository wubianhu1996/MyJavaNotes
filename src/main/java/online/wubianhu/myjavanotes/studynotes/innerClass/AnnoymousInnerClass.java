package online.wubianhu.myjavanotes.studynotes.innerClass;

public class AnnoymousInnerClass {
    private int a =10;

    public void method() {
        //基于接口的匿名内部类
        //1。需求  想要使用IA接口，并且创建对象
        //2。传统写法  写一个类，实现该接口，并创建对象
        //3。但是这个类只使用一次，后面不再使用了
        //4。使用匿名内部类来简化开发
        //5。ia的编译类型？  IA
        //6。ia的运行类型？  匿名内部类
        /*
        底层
        class XXX implements IA{   //匿名内部类名称  类名$1
            @Override
            public void hi(){
                System.out.println("hello,im annoymous inner class");
            }
        }
         */
        IA ia = new IA(){

            @Override
            public void hi() {
                System.out.println("hello,im annoymous inner class");
            }
        };
        ia.hi();
        //7.jdk底层在创建匿名内部类AnnoymousInnerClass$1后，立即创建了AnnoymousInnerClass$1实例，并把地址返回给了ia
        System.out.println("ia的运行类型：" + ia.getClass()); //获取对象的运行类型
        //8。匿名内部类使用一次就不能再使用了
    }

    public static void main(String[] args) {
        AnnoymousInnerClass annoymousInnerClass = new AnnoymousInnerClass();
        annoymousInnerClass.method();
    }
}
interface IA{//接口

    public void hi();
}

class Father{
    public Father(String name) {//构造器

    }
}