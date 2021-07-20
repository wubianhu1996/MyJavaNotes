package online.wubianhu.myjavanotes.studynotes.reflaction;

public class ReflactionTest {
    public static void main(String[] args) {
        try {
            //这里的类名必须是全类名，or ：java.lang.ClassNotFoundException: Student
            Class<?> student = Class.forName("online.wubianhu.myjavanotes.studynotes.reflaction.Student");
            //调用的类必须有无参构造方法，or ：java.lang.InstantiationException
            Object newInstance = student.newInstance();
            System.out.println("newInstance" + newInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Student {
    String name;
    int age;
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
}
