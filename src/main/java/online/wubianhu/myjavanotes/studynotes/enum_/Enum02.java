package online.wubianhu.myjavanotes.studynotes.enum_;

/**
 * @Author Poker
 * @Date 2021/12/17
 */
public class Enum02 {
    public static void main(String[] args) {
        System.out.println(FourSeason.WINTER);
    }
}
enum FourSeason{


    //如果使用enum来实现枚举类
    //1。使用关键字enum来替代class
    //2。public final static Season SPRING = new Season("春天", "温暖");直接使用SPRING("春天", "温暖");
    //3。如果有多个常量（对象），使用，间隔即可
    //4.如果使用enum来实现枚举，要求将定义常量对象，写在前面
    SPRING("春天", "温暖"),
    WINTER("冬天","寒冷");
    private String name;
    private String desc;




    private FourSeason(String name, String desc) {
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