package Module8;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        DataBase <String> dbS = new DataBase<>();
        List<String> list = new ArrayList<>();
        list.add("S4");
        list.add("S5");
        list.add("S6");

        dbS.save("S1");
        dbS.save("S2");
        dbS.save("S3");
        System.out.println(dbS.getList());

        dbS.delete("S3");
        System.out.println(dbS.getList());

        dbS.saveAll(list);
        System.out.println(dbS.getList());

        dbS.deleteAll(list);
        System.out.println(dbS.getList());
    }
}