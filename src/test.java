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
        int[] arr = {1,21,3,0,5,2,9,4};
        bubbleSort(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }

        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("key", "value");
        String res = map.get("key");
        System.out.println(res);
        Map map1 = new HashMap<>();
        map1.put("key", "value");
        String res1 = map.get("key");
        System.out.println(res1);

        Map<String, String> map2 = new HashMap<>();
        map.put("key", "value");
        map.put("key", "value");
        map.put("key1", "value");
        System.out.println("integer"+" "+ "map");


        System.out.println(map2.keySet().size());

    }
    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
