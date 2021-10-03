package online.wubianhu.myjavanotes.studynotes.poly.detail;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof AA);
        System.out.println(bb instanceof BB);


        AA aa = new AA();
        System.out.println(aa instanceof BB);
    }
}

class AA{
}
class BB extends AA{

}
