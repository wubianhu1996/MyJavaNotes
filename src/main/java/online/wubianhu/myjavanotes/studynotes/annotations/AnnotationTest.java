package online.wubianhu.myjavanotes.studynotes.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author:Poker
 * @Date:2021/6/9 23:27
 */
public class AnnotationTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //新建一个person2对象
        Person2 person2 = new Person2();
        //获取Person2的Class实例
        Class<Person2> person2Class = Person2.class;
        //获取somebody()方法的 Method实例
        Method mSomebody = person2Class.getMethod("somebody", new Class[]{String.class, int.class});
        //执行该方法
        mSomebody.invoke(person2, new Object[]{"lily", 8});
        //打印该方法的所有注解
        iteratorAnnotations(mSomebody);


        //获取somebody()方法的Method实例
        Method mEmpty = person2Class.getMethod("empty", new Class[]{});
        //执行该方法
        mEmpty.invoke(person2,new Object[]{});
        iteratorAnnotations(mEmpty);
    }

    private static void iteratorAnnotations(Method mSomebody) {
        //判断method()方法是否包含MyAnnotation注解
        if (mSomebody.isAnnotationPresent(MyAnnotation.class)) {
            ///获取该方法的MyAnnotation注解实例
            MyAnnotation myAnnotation = mSomebody.getAnnotation(MyAnnotation.class);
            //获取myAnnotation的值，并且打印出来
            String[] value = myAnnotation.value();
            for (String str : value) {
                System.out.println(str + ",");
                System.out.println();
            }
        }

        //获取方法上的所有注解，并且打印出来
        Annotation[] annotations = mSomebody.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}

class Person2{
    @MyAnnotation
    @Deprecated
    public void empty() {
        System.out.println("\nempty");
    }

    @MyAnnotation(value = {"girl","boy"})
    public void somebody(String name,int age) {
        System.out.println("\nsomebody:" + name + ","  +age);
    }
}



