package online.wubianhu.myjavanotes.studynotes.designPattern.singleton;

//单例模式(饿汉模式）
public class Singleton {
    //创建一个实例对象
    private Singleton instance = new Singleton();

    /*
    私有化构造方法，防止被实例化
     */
    private Singleton() {

    }

    //提供一个get方法获取实例
    public Singleton getInstance() {
        return instance;
    }
}