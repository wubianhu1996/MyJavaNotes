package online.wubianhu.myjavanotes.studynotes.poly;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("Tom");
        Dog dog = new Dog("旺财");
        Bone bone = new Bone("桥头排骨");
        master.feed(dog,bone);


        Cat cat = new Cat("喵喵");
        Fish fish = new Fish("鲨鱼");
        master.feed(cat,fish);



    }
}
