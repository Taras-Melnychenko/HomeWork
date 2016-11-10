package Module11;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

//C:\Users\Taras\IdeaProjects\HomeWork\src\Module11

public class FileUtills {
    private Path path = Paths.get("C:\\Users\\Taras\\IdeaProjects\\HomeWork\\src\\Module11\\File");
    private File file = path.toFile();

    //Task1
    public String replacer(Map<String, String> map) {

        if (map == null) return "Null input";
        StringBuilder stringBuilder = new StringBuilder();


        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String line = br.readLine();

                while (line != null) {
                    List<String> list = new ArrayList<>(Arrays.asList(line.split(" ")));
                    List<String> newLine = list.parallelStream().map(s ->
                            s.replaceAll(entry.getKey(), entry.getValue())).collect(Collectors.toList());

                    StringBuilder tempBuilder = new StringBuilder();
                    for (String s : newLine) {
                        tempBuilder.append(s + " ");
                    }
                    stringBuilder.append(tempBuilder.deleteCharAt(tempBuilder.length() - 1) + System.lineSeparator());
                    line = br.readLine();
                }

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
        return stringBuilder.toString();
    }

	//Task2

    public File fileContentReplacer(Map<String, String> map) {

        try {
            String text = replacer(map);
            BufferedWriter bw = new BufferedWriter(new FileWriter(path.toFile(), false));
            bw.write(text);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

	 //Task3

    public File fileContentMerger(Map<String, String> map) {

        try {
            String text = replacer(map);
            BufferedWriter bw = new BufferedWriter(new FileWriter(path.toFile(), true));
            bw.append(text);
            bw.close();
        } catch (IOException e) {
        }
        return file;
    }
     //Task4

    public int checkWord(String word) {

        try {
            int count = 0;
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                String[] words = line.split(" ");
                for (String w : words) {
                    if (w.equals(word))
                        count++;
                }
                line = br.readLine();
            }
            br.close();
            return count;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }

    }

    public static void main(String[] args) {
        FileUtills fu = new FileUtills();
        Map<String, String> m = new HashMap<>();
        m.put("java", "core");
        m.put("android", "vedro");
        System.out.println(fu.replacer(m));
        fu.fileContentReplacer(m);
        fu.fileContentMerger(m);
        System.out.println(fu.checkWord("vedro"));
    }
}