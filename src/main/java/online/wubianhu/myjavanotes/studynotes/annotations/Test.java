package online.wubianhu.myjavanotes.studynotes.annotations;

/**
 * @Author Poker
 * @Date 2021/12/20
 */
public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(100);
        System.out.println(car1);
        Car car = new Car();

        System.out.println(car);

    }
}

class Car{
    double price = 10;
    static String color = "white";

    public String toString() {
        return price + "\t" + color;
    }

    public Car() {
        this.price =9;
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }
}
