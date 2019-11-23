package edu.cscc;


import java.util.Map;
import java.util.Scanner;

public class Main {
    private final static String CENSUSDATAFNAME = "Surnames_2010Census.csv";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Surname> nameList = Census.loadCensusData(CENSUSDATAFNAME);

        if (nameList != null) {
            boolean quit = false;
            String input;

            while(!quit){
                System.out.println("Enter a surname (or 'quit' to end):");
                input = scanner.nextLine();
                if(input.equalsIgnoreCase("quit")){
                    quit = true;
                    System.out.println("Program closing....");
                } else if(nameList.containsKey(input.toUpperCase())) {
                    Surname surname = nameList.get(input.toUpperCase());
                    String name = surname.getName();
                    int rank = surname.getRank();
                    int count = surname.getCount();
                    double proportion = surname.getProportion();
                    System.out.printf(
                            "Surname: %s \n\tRank: %s \n\tCount: %s \n\tProportion: %s \n",
                            name, rank, count, proportion
                    );
                } else {
                    System.out.println("Surname " + input + " not found");
                }
            }
        }
    }
}

