package Offline10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Taras on 31.10.2016.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://google.com");

        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));


        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while((line = br.readLine()) != null){
            stringBuilder.append(line+System.lineSeparator());
        }
        br.close();

    }
}
