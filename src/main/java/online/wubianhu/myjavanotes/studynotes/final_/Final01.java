package online.wubianhu.myjavanotes.studynotes.final_;


//final修饰的属性在定义时，必须赋初值，并且以后不能再修改，赋值可以在如下位置之一：
//
//- 在定义时：如public final double TAX_RATE=0.08;
//- 在构造器中
//- 在代码块中
public class Final01 {
    public static void main(String[] args) {
        //final类不能被继承，但是可以实例化对象
        FinalExtends finalExtends = new FinalExtends();
    }
    public final double TAX_RATE_01 = 0.08;

    public final double TAX_RATE_02;

    public final double TAX_RATE_03;

    //构造器写法
    public Final01(){
        TAX_RATE_02 = 0.01;
    }

    //代码块写法
    {
        TAX_RATE_03 = 0.02;
    }
}


//如果final修饰的属性是静态的，则初始化的位置只能是
// 1.定义时
// 2.在静态代码块。不能在构造器中赋值
class StaticBlickFianl{
    public static final double STATIC_FINAL_VAR_01 = 1.1;
    public static final double STATIC_FINAL_VAR_02;

    static {
         STATIC_FINAL_VAR_02 = 1.2;
    }
}

//final类不能被继承，但是可以实例化对象
final class FinalExtends{

}

