package online.wubianhu.myjavanotes.studynotes.poly;


//通过构建master类和其他6个类模拟多态
public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //主人给小狗喂骨头
    public void feed(Dog dog, Bone bone) {
        System.out.println("主人" + name + "给" +dog.getName()+ "喂" + bone.getName());
    }

    //主人给猫猫喂鲨鱼
    public void feed(Cat cat, Fish fish) {
        System.out.println("主人" + name + "给" +cat.getName()+ "喂" + fish.getName());
    }
}
