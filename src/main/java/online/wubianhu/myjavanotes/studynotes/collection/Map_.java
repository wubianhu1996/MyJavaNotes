package online.wubianhu.myjavanotes.studynotes.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author Poker
 * @Date 2022/1/22
 */
@SuppressWarnings("all")
public class Map_ {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("no1", "poka");
        hashMap.put("no2","kkk");

        Set set = hashMap.entrySet();
        System.out.println(set.getClass());
        for (Object obj : set) {
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
