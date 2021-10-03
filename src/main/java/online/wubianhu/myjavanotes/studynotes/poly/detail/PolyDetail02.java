package online.wubianhu.myjavanotes.studynotes.poly.detail;

public class PolyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说，属性的值看编译类型
        Base base = new Sub();
        System.out.println(base.count);

        Sub sub = new Sub();
        System.out.println(sub.count);
    }
}

//父类
class Base{
    int count = 10;
}
//子类
class Sub extends Base{
    int count = 20;
}
