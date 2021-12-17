package online.wubianhu.myjavanotes.studynotes.innerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
        //外部其他类访问静态内部类
        //方式一
        OuterClass04.Inner inner = new OuterClass04.Inner();
        inner.f1();
        //方式二
        //编写一个方法，可以返回静态内部类的对象实例
        OuterClass04.Inner inner1 = new OuterClass04().getInner();
        inner1.f1();
        OuterClass04.Inner innerStatic = OuterClass04.getInnerStatic();
        innerStatic.f1();

    }
}
class OuterClass04{
    private int a =10;
    private static String name = "poker";
    //Inner是静态内部类
    //1。放在外部类的成员位置
    //2。使用static修饰
    //3.可以添加任意访问修饰符（public、protected、默认、priviate）
     static class Inner{
        public void f1() {
//            System.out.println(a);
            System.out.println(name);
        }
    }

    public void f2() {
        Inner inner = new Inner();
        inner.f1();
    }

    public Inner getInner() {
         return new Inner();
    }

    public static Inner getInnerStatic() {
         return new Inner();
    }
}