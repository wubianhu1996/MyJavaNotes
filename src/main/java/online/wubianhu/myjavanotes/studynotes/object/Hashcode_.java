package online.wubianhu.myjavanotes.studynotes.object;

public class Hashcode_ {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa1 = new AA();
        System.out.println("aa.hashCode()=" + aa.hashCode());
        System.out.println("aa1.hashCode()=" + aa1.hashCode());
        AA aa2 = aa;
        System.out.println("aa2.hashCode()=" + aa2.hashCode());
    }
}
class AA{

}
