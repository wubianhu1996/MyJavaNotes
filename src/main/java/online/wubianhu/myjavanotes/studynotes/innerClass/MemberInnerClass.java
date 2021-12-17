package online.wubianhu.myjavanotes.studynotes.innerClass;

public class MemberInnerClass {
    public static void main(String[] args) {
        OuterClass03 outerClass03 = new OuterClass03();
        outerClass03.say();
        //外部其他类使用成员内部类的三种方式

        //1.new InnerClass
        OuterClass03.InnerClass innerClass = outerClass03.new InnerClass();
        //2.在外部类编写一个方法，可以返回InnerClass对象
        OuterClass03.InnerClass innerClass1 = outerClass03.getInnerClass();
        innerClass1.say();
        //3。其实就是第一种方式
        OuterClass03.InnerClass innerClass2 = new OuterClass03().new InnerClass();
        innerClass2.say();
    }
}
class OuterClass03{
    private int a =10;
    public String name = "lisi";

    private void hi() {
        System.out.println("hi");
    }

    class InnerClass{//成员内部类
        private int a = 99;
        private String name = "zhangsan";
        public void say() {
            //可以直接访问外部类的所有属性，包括私有的
            //如果外部类核内部类的成员重名时，内部类访问的话，默认遵循就近原则
            System.out.println("a = " + a + "，name=" +name + ",内外部类的a=" + OuterClass03.this.a   );
            hi();
        }
    }


    //写方法
    public void say() {
        InnerClass innerClass = new InnerClass();
        innerClass.say();
    }


    public InnerClass getInnerClass() {
        return new InnerClass();
    }
}
