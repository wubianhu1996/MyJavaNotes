package online.wubianhu.myjavanotes.studynotes.wrapper;

/**
 * @Author Poker
 * @Date 2021/12/22
 */
public class WrapperType {
    public static void main(String[] args) {
        //jdk5以前的手动装箱和拆箱
        //int -> Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        //Integer ->int
        int i = integer.intValue();

        //jdk5 以后的自动装箱拆箱
        int n2 =200;
        Integer integer2 = n2;
        int n3 = integer2;
    }
}
