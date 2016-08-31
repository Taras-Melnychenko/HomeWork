package Module2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaskInt1 {

    static int sum (int[] array){
        int sum = 0;
       /*for (int i = 0; i<array.length; i++){  //using for
            sum +=array[i];
        }*/
        int i = 0;
        while (i<array.length){                 //using while
            sum += array[i];
            i++;
        }
        return sum;
    }
    static int max (int[] array){
        int max = array[0];
        /*for (int i = 1; i<array.length; i++){ // using for
            if (max < array[i]) max = array[i];
        }*/
        int i = 1;
        while (i < array.length){                //using while
            if (max < array[i]) max = array[i];
            i++;
        }
        return max;
    }
    static int min (int[] array){
        int min = array[0];
        /*for (int i = 1; i<array.length; i++){ //using for
            if (min > array[i]) min = array[i];
        }*/
        int i = 1;
        while (i< array.length){                //using while
            if (min>array[i]) min = array[i];
            i++;
        }
        return min;
    }
    static int maxPositive (int[] array){
        int maxPositive = 0;
        /*for (int i = 0; i < array.length; i++){       //using for
            if (maxPositive < array[i]) {
                maxPositive = array[i];
                break;
            }
        }*/
        int i = 0;
        while (i < array.length) {
            if (maxPositive < array[i]) {
                maxPositive = array[i];
                break;
            }
            i++;
        }
        return maxPositive;
    }
    static long multiplication (int[] array){
        long multiplication =1;
        int i = 0;
        while (i<array.length){
            multiplication *= array[i];
            i++;
        }
        return multiplication;
    }
    static int modules (int[] array){
        int modules = array[0]/array[array.length-1];
        return modules;
    }
    static int residue(int[] array){
        int residue = array[0]&array[array.length-1];
        return residue;
    }
    static int secondMax (int[] array, int max){
        int secondMax =0;
        int i = 1;
        if  (array[0] == max) {
            secondMax = array[1];
            i++;
        }
        else secondMax = array[0];
        while ( i < array.length){
            if (secondMax < array[i]&&array[i]!=max) secondMax =array[i];
            i++;
        }
        return secondMax;
    }
    static double sum (double[] array){
        double sum = 0;
       /*for (int i = 0; i<array.length; i++){  //using for
            sum +=array[i];
        }*/
        int i = 0;
        while (i<array.length){                 //using while
            sum += array[i];
            i++;
        }
        return sum;
    }
    static double max (double[] array){
        double max = array[0];
        /*for (int i = 1; i<array.length; i++){ // using for
            if (max < array[i]) max = array[i];
        }*/
        int i = 1;
        while (i < array.length){                //using while
            if (max < array[i]) max = array[i];
            i++;
        }
        return max;
    }
    static double min (double[] array){
        double min = array[0];
        /*for (int i = 1; i<array.length; i++){ //using for
            if (min > array[i]) min = array[i];
        }*/
        int i = 1;
        while (i< array.length){                //using while
            if (min>array[i]) min = array[i];
            i++;
        }
        return min;
    }
    static double maxPositive (double[] array){
        double maxPositive = 0;
        /*for (int i = 0; i < array.length; i++){       //using for
            if (maxPositive < array[i]) {
                maxPositive = array[i];
                break;
            }
        }*/
        int i = 0;
        while (i < array.length) {
            if (maxPositive < array[i]) {
                maxPositive = array[i];
                break;
            }
            i++;
        }
        return maxPositive;
    }
    static double multiplication (double[] array){
        double multiplication =1;
        int i = 0;
        while (i<array.length){
            multiplication *= array[i];
            i++;
        }
        return multiplication;
    }
    static double modules (double[] array){
        double result = array[0]/array[array.length-1];
        double modules = (int)Math.floor(result);
        return modules;
    }
    static double residue(double[] array){
        double residue1 = array[0]- modules(array)*array[array.length-1];
        double residue = new BigDecimal(residue1).setScale(2, RoundingMode.UP).doubleValue();
        return residue;
    }
    static double secondMax (double[] array, double max){
        double secondMax =0.00000001;
        int i = 1;
        if  (array[0] == max) {
            secondMax = array[1];
            i++;
        }
        else secondMax = array[0];
        while ( i < array.length){
            if (secondMax < array[i]&&array[i]!=max) secondMax =array[i];
            i++;
        }
        return secondMax;
    }


    public static void main(String[] args) {
        int[] array = {289, -53, 15, -45, -75, -43, -86, 1, 1111, 121};
        System.out.println("//////Task 2.1 Sum///////");
        System.out.println(sum(array));
        System.out.println("//////Task 2.2 Max///////");
        System.out.println(max(array));
        System.out.println("//////Task 2.2 Min///////");
        System.out.println(min(array));
        System.out.println("//////Task 2.3 Max Positive///////");
        if (maxPositive(array) == 0) System.out.println("Positive Number not found");
        else System.out.println("We have at list one positive number"+"..."+maxPositive(array));
        System.out.println("//////Task 2.4 Multiplication///////");
        System.out.println(multiplication(array));
        System.out.println("//////Task 2.5 Modulus first nad last element///////");
        System.out.println("Intrger part..." + modules(array) + "Residue..." +residue(array));
        System.out.println("//////Task 2.6 Second max element///////");
        System.out.println(secondMax(array, max(array)));
        double[] array1 = {289.15, -53.1, 15.7, -45.56, -75.2, -43.2, -86.7, 1.09, 1111.75, 121.1};
        System.out.println("//////Task 2.1 Sum///////");
        System.out.println(sum(array1));
        System.out.println("//////Task 2.2 Max///////");
        System.out.println(max(array1));
        System.out.println("//////Task 2.2 Min///////");
        System.out.println(min(array1));
        System.out.println("//////Task 2.3 Max Positive///////");
        if (maxPositive(array1) == 0) System.out.println("Positive Number not found");
        else System.out.println("We have at list one positive number"+"..."+maxPositive(array1));
        System.out.println("//////Task 2.4 Multiplication///////");
        System.out.println(multiplication(array1));
        System.out.println("//////Task 2.5 Modulus first nad last element///////");
        System.out.println("Intrger part..." + modules(array1) + "Residue..." +residue(array1));
        System.out.println("//////Task 2.6 Second max element///////");
        System.out.println(secondMax(array1, max(array1)));
    }
}
