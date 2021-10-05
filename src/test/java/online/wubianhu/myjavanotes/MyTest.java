package online.wubianhu.myjavanotes;

import online.wubianhu.myjavanotes.studynotes.poly.polyParameter.CommonEmployee;
import online.wubianhu.myjavanotes.studynotes.poly.polyParameter.Employee;
import online.wubianhu.myjavanotes.studynotes.poly.polyParameter.Manager;

public class MyTest {

    public static void main(String[] args) {
        CommonEmployee tom = new CommonEmployee("tom",new Double(3000));
        tom.work();
        System.out.println(tom.getName() + "的年薪是" + tom.getAnnual());
        Manager jack = new Manager("jack", new Double(30000),new Double(100000));
        jack.manager();
        System.out.println(jack.getName() + "的年薪是" + jack.getAnnual());

    }


    public double showEmpAnnual(Employee e){
        if (e instanceof CommonEmployee) {
            return ((CommonEmployee) e).getAnnual();
        } else if (e instanceof Manager) {
            return ((Manager) e).getAnnual();
        }else {
            return 0;
        }
    }

    public void testWork(Employee e) {
        if (e instanceof CommonEmployee) {
            ((CommonEmployee) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manager();
        }
    }
}
