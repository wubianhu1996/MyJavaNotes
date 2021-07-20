package online.wubianhu.myjavanotes.studynotes.annotations;

import java.lang.annotation.*;

@Documented//定义 Annotation 时，@Documented 可有可无；若没有定义，则 Annotation 不会出现在 javadoc 中。
//@Target(ElementType.TYPE)//定义 Annotation 时，@Target 可有可无。若有 @Target，则该 Annotation
                                    // 只能用于它所指定的地方；若没有 @Target，则该 Annotation 可以用于任何地方。
@Retention(RetentionPolicy.RUNTIME)//定义 Annotation 时，@Retention 可有可无。若没有 @Retention，则默认是 RetentionPolicy.CLASS
public @interface MyAnnotation{
    //@interface : 用来表示实现了 java.lang.annotation接口
    //注意：通过@interface定义注解后，该注解不能继承其他的接口或注解
    String[] value() default "unknown";

    //多变量使用枚举
    MyEnum value2() default MyEnum.Sunny;

}
//枚举类型
enum MyEnum {
    Sunny,Rainy
}