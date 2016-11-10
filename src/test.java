import java.util.*;

/**
 * Created by Taras on 17.10.2016.
 */
class Title extends Exception{}

public class test {
    public static void main(String[] args) {
        try{
            throw new Title();
        }catch (Title t){
            System.out.println("Got the Titile Exception");
        }finally {
            System.out.println("Inside finally block");
        }
    }
}
