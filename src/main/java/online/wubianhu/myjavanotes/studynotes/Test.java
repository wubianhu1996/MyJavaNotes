package online.wubianhu.myjavanotes.studynotes;

public class Test {

    public static void main(String[] args) {
        String s = "wubianhu";
        String str = "abc";
        String[] split = s.split(str + str, 2);
        for (String s1 : split) {
            System.out.print(s1);
        }
    }
}
