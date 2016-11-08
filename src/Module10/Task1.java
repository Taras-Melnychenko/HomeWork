package Module10;


import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception(Arrays.toString(args));
        }catch (Exception e){
            System.out.println(Arrays.toString(args));
        }
    }
}