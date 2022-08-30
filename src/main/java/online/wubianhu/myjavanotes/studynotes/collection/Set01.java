package online.wubianhu.myjavanotes.studynotes.collection;

import java.util.HashSet;
import java.util.LinkedHashMap;

/**
 * @Author Poker
 * @Date 2022/1/6
 */
public class Set01 {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        System.out.println(set.add("poka"));
        System.out.println(set.add("poka"));
        System.out.println(set.add(new Tiaozi()));
    }
}
class Tiaozi{

}
