package online.wubianhu.myjavanotes.studynotes.object;

public class Finalize_ {
    public static void main(String[] args) {
        Car benz = new Car("benz");
        benz =null;
//        System.gc();//主动调用垃圾回收器
        System.out.println("程序退出了");
    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁了汽车：" + name);
        System.out.println("回收了资源 ");
    }
}
