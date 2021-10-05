package online.wubianhu.myjavanotes.studynotes.poly.polyParameter;

public class CommonEmployee extends Employee{

    public CommonEmployee(String name,double salary) {
        super(name,salary);
    }

    public void work() {
        System.out.println("工人正在工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
