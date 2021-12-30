package online.wubianhu.myjavanotes.studynotes.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author Poker
 * @Date 2021/12/21
 */
public class Throws {
    public static void main(String[] args) {

    }

    public static void f1() {
        //因为f3方法抛出的是一个编译异常
        //这个时候，就要f1必须处理这个编译异常
        //在f1中，要么try-catch这个异常，或者继续throws这个编译异常
//        f3();
    }

    public static void f3() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("d://axx.doc");
    }

    public static void f4() {
        //f5()抛出的是运行时异常
        //java中对运行时异常，并不要求程序员现实的处理，因为有默认的处理机制
        f5();
    }

    public static void f5() throws ArithmeticException{

    }

}
