package online.wubianhu.myjavanotes.studynotes.innerClass;

public class InnerClass {
    public static void main(String[] args) {

    }
}
class OuterClass{//外部类
    private int a = 10;

    private void m2() {
        System.out.println("OuterClass02 m2()");
    }//私有方法

    public void m1() {//方法
        //1。局部内部类是定义在外部类的局部位置，通常在方法
        //3。不能添加访问修饰符，但是可以使用final修饰
        //4。作用域：仅仅在定义它的方法或者代码块中
        final class Inner{//局部内部类（本质上还是一个类）
            //2。可以访问外部类的所有成员，包含私有的。
            private void f1() {
                //5.局部内部类可以直接访问外部类的成员，比如下面的a m2()
                //7.如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员
                //使用  外部类名.this.成员  去访问
                System.out.println("a=" + a + "外部类的a" + OuterClass.this.a);
                System.out.println("OuterClass的hashcode：" + OuterClass.this);
                m2();
            }
        }
        //6.外部类在方法中，可以创建Inner对象，然后调用方法即可
        Inner inner = new Inner();
        inner.f1();
    }
}