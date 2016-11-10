package Module10;


class ExIndex extends IndexOutOfBoundsException {
}
class ExNull extends NullPointerException {
}
class ExClassCast extends ClassCastException {
}

public class Task5 {



    static void badMethod(int i) throws ExClassCast,ExNull,ExIndex{

        try {
            int[] ints = {};
            System.out.println(ints[1]);
        } catch (IndexOutOfBoundsException e) {
            throw new ExIndex();}
        try {
            String s = null;
            s.getClass();
        } catch (NullPointerException e) {
            throw new ExNull();}
        try {
            Object s = "";
            int a = (Integer) s;
        } catch (ClassCastException e) {
            throw new ExClassCast();}

    }

    public static void main(String[] args) {

        try {
            badMethod(1);
        } catch (ExIndex | ExNull | ExClassCast e) {
            System.out.println("All exception cached");
        }


    }
}
