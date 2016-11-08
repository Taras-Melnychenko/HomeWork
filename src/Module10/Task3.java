package Module10;

public class Task3 {
    public static void main(String[] args) {
        Integer i = null;
        try {
            String s = i.toString();
        } catch (NullPointerException e){
            System.out.println("Exception");
        }
    }
}
