package online.wubianhu.myjavanotes.studynotes.exception;

/**
 * @Author Poker
 * @Date 2021/12/21
 */
public class TryCatchException {
    public static void main(String[] args) {
        //要求子类异常写在前面，父类异常写在后面
        try {
            Person person = new Person();
//            person = null;
            System.out.println(person.getName());//空指针异常
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2; //除0异常
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {

        }

    }
}
class Person{
    private String name = "poker";

    public String getName() {
        return name;
    }
}
