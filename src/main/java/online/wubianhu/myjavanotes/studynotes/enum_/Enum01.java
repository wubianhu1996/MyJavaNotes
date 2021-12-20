package online.wubianhu.myjavanotes.studynotes.enum_;

/**
 * @Author Poker
 * @Date 2021/12/17
 */
public class Enum01 {
    public static void main(String[] args) {
        System.out.println(Season.FALL);
    }
}


//自定义一个枚举类
class Season{
    private String name;
    private String desc;

    //1.将构造器私有化，目的是防止直接 new
    //2.去掉set方法，防止属性被修改
    //3.在season内部创建固定的对象
    //4.优化，对于static会导致类的加载，所以加上final
    //因为final和static往往搭配使用，效率更高，**不会导致类加载，**底层编译器做了优化处理。

    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season FALL = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷");


    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}