package online.wubianhu.myjavanotes.studynotes.reflaction;


//四种获取Class对象的方法
public class GetClass {
    public static void main(String[] args) {
        try {
            //方法1：Class.forName("类名字符串")（注意：类名字符串必须是全称，包名+类名
            Class<?> forName = Class.forName("online.wubianhu.myjavanotes.studynotes.reflaction.Dog");
            System.out.println("method1:" + forName);
            //方法2：类名.class
            Class dog = Dog.class;
            System.out.println("method2:" + dog);
            //方法3：实例对象.getClass()
            Dog dog1 = new Dog();
            Class<? extends Dog> dog1Class = dog1.getClass();
            System.out.println("method3:" + dog1Class);
            //方法4："类名字符串".getClass()
            Class<? extends String> aClass = "com.wubianhu.studynotes.reflaction.Dog".getClass();
            Class<? extends Class> aClass1 = aClass.getClass();
            System.out.println("method4:" + aClass1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Dog {
    Dog() {
        System.out.println("i am a cat");
    }
}
