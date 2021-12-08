package online.wubianhu.myjavanotes.studynotes.designPattern.singleton;
//单例模式
//所谓单例，就是采取一定的方法保证在整个软件系统中，对某个类只存在一个对象实例，并且该类只提供一个取得其对象实例的方法




public class Singleton {
    public static void main(String[] args) {
        HungerySingleton hungerySingleton1 = HungerySingleton.getInstance();
        HungerySingleton hungerySingleton2 = HungerySingleton.getInstance();
        System.out.println(hungerySingleton1 == hungerySingleton2);//true --指向同一个对象

    }
}

//单例模式(饿汉模式）
//1。构造器私有化----防止用户直接new对象
//2。类的内部创建对象
//3。向外暴露一个静态的公共方法。getinstance
//4。代码实现
class HungerySingleton{
    //创建一个实例对象
    private static HungerySingleton instance = new HungerySingleton();

    /*
    私有化构造方法，防止被实例化
     */
    private HungerySingleton() {

    }

    //提供一个get方法获取实例
    public static HungerySingleton getInstance() {
        return instance;
    }
}

//单例模式（懒汉式）
//1。构造器私有化
//2。定义一个static静态属性对象
//3。提供一个public的static方法，可以返回一个对象
class LazySingleton{

    private String name;
    public static int n1 = 999;
    private static LazySingleton lazySingleton;

    //构造器私有化，在需要调用对象时才会实例化一个对象
    private LazySingleton() {
        System.out.println("构造器被调用");
    }

    //提供一个公共的实例化方法，可以返回一个对象
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            return new LazySingleton();
        }
        return lazySingleton;
    }

}
//总结：饿汉式和懒汉式区别：
//1。二者最主要的区别在于创建对象的时机不同：饿汉式是在类加载就创建了对象实例，而懒汉式是在使用时才创建
//2。饿汉式不存在线程安全问题，懒汉式存在线程安全问题
//3。饿汉式存在浪费资源的可能。因为程序员一个对象实例都没有使用，那么饿汉式创建的对象就浪费了，懒汉式是使用时才创建，就不存在这个问题
//4。在我们使用javase标准类时，java.lang.Runtime就是经典的单例模式