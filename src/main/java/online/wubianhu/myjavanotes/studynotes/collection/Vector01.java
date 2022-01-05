package online.wubianhu.myjavanotes.studynotes.collection;

import java.util.Vector;

/**
 * @Author Poker
 * @Date 2022/1/5
 */
public class Vector01 {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>();
        for (int i = 0; i < 11; i++) {
            vector.add(i);
        }
        System.out.println(vector.size());
    }
}
