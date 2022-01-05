package online.wubianhu.myjavanotes.studynotes.stringbuffer;

/**
 * @Author Poker
 * @Date 2021/12/30
 */
public class StringBuffer_ {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello  ");
        System.out.println(stringBuffer.length());
        String s = new String(stringBuffer);
        System.out.println(s.length());
        System.out.println(new StringBuffer("null"));
    }
}
