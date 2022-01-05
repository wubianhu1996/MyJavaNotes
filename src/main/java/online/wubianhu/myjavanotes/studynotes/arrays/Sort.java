package online.wubianhu.myjavanotes.studynotes.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author Poker
 * @Date 2021/12/30
 */
public class Sort {
    public static void main(String[] args) {
        int[] a = {-1, 0, -2, 9, 3};
        System.out.println(a);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //自定义的排序，调用比较器Comparator
        //实现了Comparator接口的匿名内部类，要求实现compare方法
        //体现了接口编程的方式
//        Arrays.sort(a, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Integer i1 = (Integer) o1;
//                Integer i2 = (Integer) o2;
//                return i2 - i1;
//            }
//        });
        
    }
}
