package online.wubianhu.myjavanotes.studynotes;

public class Test {

    public static void main(String[] args) {

        Person person = new Person("小明");
        String name = person.getname();
        System.out.println(name);

        String a = "adc";
        String b = "def";
        String c = a+b;
        String d = "abcdef";
        System.out.println(c == d);
        String intern = d.intern();
        System.out.println(intern);
    }

}

class Person{
    public static String name;

    public Person(String name) {
        this.name = name;
    }

    public String getname(){
        return Person.name;
    }

}
