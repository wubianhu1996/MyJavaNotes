package online.wubianhu.myjavanotes.studynotes.interface_;

public class InterfacePolyParamter {
    public static void main(String[] args) {

        //接口的多态体现
        //接口类型的变量a 可以指向 实现了interface接口的对象实例
        Interface a = new A();
        a = new B();


        //继承的多态体现
        AAA aaa = new BBB();
        aaa = new CCC();

    }
}
interface Interface{
}
class A implements Interface{
}
class B implements Interface{
}
class AAA{
}

class BBB extends AAA {
}

class CCC extends AAA {
}
