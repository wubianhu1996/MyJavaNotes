package online.wubianhu.myjavanotes.studynotes.object;

import java.util.Objects;

public class EqualsExercise {
    public static void main(String[] args) {
        //判断两个person类对象是否相同
        //如果两个类的属性都相同，则认为相同
        Person person1 = new Person("小明", 10, "男");
        Person person2 = new Person("小红", 10, "男");
        System.out.println(person1.equals(person2));
    }

}
class Person{
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
