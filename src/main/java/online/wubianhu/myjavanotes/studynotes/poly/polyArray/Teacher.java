package online.wubianhu.myjavanotes.studynotes.poly.polyArray;

public class Teacher extends Person{


    private double salary;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + "salary = " + salary;
    }

    public void teach() {
        System.out.println("老师" + getName() + "正在授课");
    }
}
