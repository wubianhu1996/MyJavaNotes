package online.wubianhu.myjavanotes.studynotes.poly.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());


        //如果把子类sum方法注释了，那么结果会怎么样
//        ##### JAVA的动态绑定机制
//
//        1.当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
//
//        2.当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
    }

}


//父类
class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

//子类
class B extends A {

    public int i = 20;

//    public int sum() {
//        return getI() + 20;
//    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}