package FileHandaling.D_CSVFiles;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFileWritter {
    public static void main(String[] args) throws IOException {

        String csvFilePth = "B:\\Java\\CoreJava\\src\\FileHandaling\\D_CSVFiles\\example.csv";
        FileWriter writer = new FileWriter(csvFilePth);

        writer.append("Name,Age,Email\n");//header
        writer.append("John,43,abc@gmail.com\n");
        writer.append("Johnny,13,abcd@gmail.com\n");
        writer.append("Jo,14,abce@gmail.com\n");
        writer.append("Joe,23,abcf@gmail.com\n");

        writer.close();

        System.out.println("CSV file created at:"+csvFilePth);

    }
}
