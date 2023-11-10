package FileHandaling.D_CSVFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CSVFileReading {
    public static void main(String[] args) throws IOException {
        String csvFilePth = "B:\\Java\\CoreJava\\src\\FileHandaling\\D_CSVFiles\\example.csv";

        //Approach using Scanner
//        File file = new File(csvFilePth);
//
//        Scanner sc = new Scanner(file);
//
//        sc.useDelimiter(",");
//
//        while (sc.hasNext()){
//            System.out.print(sc.next()+"\t");
//        }
//
//        sc.close();

        //using Java Split() method
        FileReader reader = new FileReader(csvFilePth);

        BufferedReader br = new BufferedReader(reader);

        String line;

        while ((line=br.readLine()) != null){
            String[] data = line.split(",");
            for (String s:data) {
                System.out.print(s +"\t");
            }
            System.out.println();
        }


    }
}
