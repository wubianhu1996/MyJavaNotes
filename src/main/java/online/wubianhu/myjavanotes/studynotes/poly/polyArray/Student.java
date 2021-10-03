package online.wubianhu.myjavanotes.studynotes.poly.polyArray;

public class Student extends Person{

    private double score;

    public Student(String name, int age) {
        super(name, age);
    }

    public double getscore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //重写父类say
    @Override
    public String say() {
        return super.say() + "socre = " + score;
    }

    public void study() {
        System.out.println("学生"  +getName() + "正在学习");
    }
}
