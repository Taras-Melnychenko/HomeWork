package Offline10;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;

public class ReadFromConsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        List<Double> doubles = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        String line;
        while (!(line = reader.readLine()).equals("q")) {

            try {
                //double res = Double.valueOf(line);
                //doubles.add(res);

                doubles.add(Double.valueOf(line));
            } catch (NumberFormatException e) {

            }
            try {
                //double res = Double.valueOf(line);
                //doubles.add(res);

                integers.add(Integer.valueOf(line));
            } catch (NumberFormatException e) {

            }
            try {
                //double res = Double.valueOf(line);
                //doubles.add(res);

                strings.add(String.valueOf(line));
            } catch (NumberFormatException e) {

            }

        }
        reader.close();

        System.out.println(doubles);
        System.out.println(integers);
        System.out.println(strings);
        //codechef
    }
}
