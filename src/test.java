import java.util.*;

/**
 * Created by Taras on 17.10.2016.
 */
public class test {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(11);
        queue.add(-11);
        queue.add(0);
        int a = queue.element();
        System.out.println(a);


        Set<String> set = new HashSet<String>();
        set.add("test");
        set.add("test1");
        set.add("test");
        System.out.println(set.size());

        Set<String> set1 = new HashSet<>();
        set1.add("aaa");
        set1.add("ccc");
        set1.add("bbb");
        set1.add("aaa");
        set1.remove("ccc");

        List<String> list = new ArrayList<>(set1);
        list.add("bbb");

        System.out.println(list);
    }
}
