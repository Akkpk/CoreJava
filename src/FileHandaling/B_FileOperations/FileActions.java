package FileHandaling.B_FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {

    //Creating file
    public static void createFile(String filePath) throws IOException {
        File myObj = new File(filePath);

        if(myObj.createNewFile()){
            System.out.println("File Created: "+myObj.getName());
        }else {
            System.out.println("File Already Exists");
        }
    }

    //writing data into file
    public static void writeFile(String filePath, String text) throws IOException {
        FileWriter myWriter = new FileWriter(filePath);
        myWriter.write(text);
        myWriter.close();
        System.out.println("Successful");
    }

    //Reading data from the file
    public static void readFile(String filePath) throws FileNotFoundException {
        File obj = new File(filePath);

        Scanner reader = new Scanner(obj);

        while (reader.hasNextLine()){
            String data=reader.nextLine();
            System.out.println(data);
        }

        reader.close();
    }

    //rename file
    public static void renameFile(String oldFilePath,String newFilePath){
        File oldFile = new File(oldFilePath);
        File newFile = new File(newFilePath);

        if(oldFile.renameTo(newFile)){
            System.out.println("File Renamed");
        }else {
            System.out.println("Some error occur.");
        }
    }

    //delete file
    public static void deleteFile(String filePath){
        File obj = new File(filePath);

        if(obj.delete()){
            System.out.println("File Deleted: "+obj.getName());
        }else{
            System.out.println("Some error occur.");
        }
    }

    public static void main(String[] args) throws IOException {
//        String filePath = "C:\\MyFiles\\myFile.txt";

//        createFile("C:\\MyFiles\\myFile.txt");

//        writeFile(filePath,"Welcome to Java FileHandling.");

//        readFile(filePath);

//        String newFilePath = "C:\\MyFiles\\MyFile.txt";
//        renameFile(filePath,newFilePath);

        String filePath = "C:\\MyFiles\\myFile1.txt";
        deleteFile(filePath);
    }
}
