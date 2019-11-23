package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Census {
    public static Map<String, Surname> loadCensusData(String fname) {
        Map<String, Surname> nameList = new HashMap<>();

        File file = new File(fname);
        try (Scanner input = new Scanner(file)) {
            input.nextLine(); // skip first line of spreadsheet
           while(input.hasNext()) {
               String s = input.nextLine();
               String[] data = s.split(",");
               int rank = Integer.parseInt(data[1]);
               int count = Integer.parseInt(data[2]);
               double prop = Double.parseDouble(data[3]);
               nameList.put(data[0], new Surname(data[0], rank, count, prop));
           }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot access file: " + fname + " - File not found");
            return null;
        } catch (NumberFormatException e) {
            System.err.println("Error processing file: Number Format Exception");
            return null;
        }
        return nameList;
    }
}