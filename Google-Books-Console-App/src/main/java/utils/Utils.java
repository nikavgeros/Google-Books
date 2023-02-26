package utils;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class Utils {

    private static String defaultUserId = "102701940585560677579";
    private static String pathname = String.valueOf(Path.of("").toAbsolutePath());
    private static String filename = pathname + "\\searchHistory.txt";


    public static String getDefaultUserId() {
        return  defaultUserId;
    }


    public static void writeToFile(String newRecord) throws IOException {
        String[] recordsFromFile = readFile().split("\n");
        int limit = 5;
        ArrayList<String> records = new ArrayList<String>();
        records.add(newRecord);

        if (recordsFromFile.length>=limit) {
            String[] tempList = Arrays.copyOfRange(recordsFromFile, 0, 4);
            for (int i = 0; i <= 3; i++) {
                if (tempList[i].trim()!="") {
                    records.add(tempList[i]);
                }
            }
        } else if (recordsFromFile.length != 0) {
            for (int i = 0; i < recordsFromFile.length; i++) {
                if (recordsFromFile[i].trim()!="") {
                    records.add(recordsFromFile[i]);
                }
            }
        }
        FileWriter writer = new FileWriter(filename);
        for (String record : records) {
            writer.write(record + "\n");
        }
        writer.close();
    }


    public static String readFile() throws IOException {
        String line = "";
        StringBuilder records = new StringBuilder();

        try(BufferedReader bf = new BufferedReader(new FileReader(filename))){
            while ((line=bf.readLine())!=null) {
                records.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            File searchHistoryFile = new File(filename);
            searchHistoryFile.createNewFile();
            System.out.println("File " + searchHistoryFile +" has been created");
        } catch (IOException e) {
            System.out.println(e);
        }
        return records.toString();
    }

}
