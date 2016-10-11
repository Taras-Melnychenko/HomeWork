package Module6;




public final class ArrayUtils {

    public static int sum (int[] array){
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
    public static int max (int[] array){
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
    public static int min (int[] array){
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
    public static int maxPositive (int[] array){
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
    public static long multiplication (int[] array){
        long multiplication =1;
        int i = 0;
        while (i<array.length){
            multiplication *= array[i];
            i++;
        }
        return multiplication;
    }
    public static int modules (int[] array){
        int modules = array[0]/array[array.length-1];
        return modules;
    }
    public static int residue(int[] array){
        int residue = array[0]&array[array.length-1];
        return residue;
    }
    public static int secondMax (int[] array, int max){
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

    public static int[] reverse (int[] array){
        int[] reverse = new int[array.length];
        int i = 0;
        while (i<array.length){
            reverse[i] = array[array.length - 1 - i];
            i++;
        }
        return reverse;
    }

    public static int[] findEvenElements (int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            int result = array[i] % 2;
            if (result == 0) counter++;
        }
        int[] findEvenElements = new int[counter];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            int result = array[i] % 2;
            if (result == 0){
                findEvenElements[j] = array[i];
                j++;
            }
        }
        return findEvenElements;
    }
}