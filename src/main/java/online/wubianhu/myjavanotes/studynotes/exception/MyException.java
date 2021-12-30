package online.wubianhu.myjavanotes.studynotes.exception;

/**
 * @Author Poker
 * @Date 2021/12/22
 */
//自定义异常
public class MyException {
    public static void main(String[] args) {
        int age = 80;
        if(!(age >= 18 && age <120)){
            throw new DIYExecption("年龄需要在18到120之间");
        }
        System.out.println("年龄输入无误");
    }
}

class DIYExecption extends RuntimeException{
    public DIYExecption(String message) {
        super(message);
    }
}

