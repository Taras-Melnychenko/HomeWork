package Module10;


class ExIndex extends IndexOutOfBoundsException {
}
class ExNull extends NullPointerException {
}
class ExClassCast extends ClassCastException {
}

public class Task5 {

//    after read many forums I understand that one method can't contain few throw
//    I wrote first try (comments code) in task don't tell about test ("will catch all three types of exceptions")
//    method can throw 3 tips exception, and in main() case try-catch can catch all exception.

    static void badMethod(int i) throws ExClassCast,ExNull,ExIndex{
/*
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
            int i = (Integer) s;
        } catch (ClassCastException e) {
            throw new ExClassCast();}
*/
        switch (i){
            case 1:throw new ExIndex();
            case 2:throw new ExNull();
            case 3:throw new ExClassCast();
        }
    }

    public static void main(String[] args) {
/*
        try {
            badMethod();
        } catch (ExIndex | ExNull | ExClassCast e) {
            System.out.println("All exception cached");
        }
*/
        try {
            badMethod(1);
        } catch (ExIndex | ExNull | ExClassCast e) {
            System.out.println(e.getClass().getName()+" Exception");
        }
        try {
            badMethod(2);
        } catch (ExIndex | ExNull | ExClassCast e) {
            System.out.println(e.getClass().getName()+" Exception");
        }
        try {
            badMethod(3);
        } catch (ExIndex | ExNull | ExClassCast e) {
            System.out.println(e.getClass().getName()+" Exception");
        }
    }
}
