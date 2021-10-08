package online.wubianhu.myjavanotes.studynotes.object;

public class Object01 {

    public static void main(String[] args) {
        int a = 10;
        double b = 10.0;
        System.out.println(a == b);


        String s1 = new String("123");
        String s2 = new String("123");
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3 == s4);
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        //hashcode相同，但是地址不同
    }
}
