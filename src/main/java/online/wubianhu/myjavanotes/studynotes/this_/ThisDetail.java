package online.wubianhu.myjavanotes.studynotes.this_;

public class ThisDetail {
    public static void main(String[] args) {
        Person person1 = new Person("小明", 20);
        System.out.println("person1的hashcode是：" + person1.hashCode());
        Person person2 = new Person("小红", 22);
        System.out.println("person1的hashcode是：" + person2.hashCode());
    }
}

class Person {
    String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name + "\t" + this.age + "\t" + "当前对象的hashcode是：" +this.hashCode());

    }

    public void info() {
        System.out.println(this.name + "\t" + this.age + "\t" + "当前对象的hashcode是：" +this.hashCode());
    }
}
