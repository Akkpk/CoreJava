package FileHandaling.A_FolderOperation;

import java.io.File;

public class FolderActions {

    //create folder
    public static void createFolder(String folderPath) {
        File folder = new File(folderPath);
        if(!folder.exists()){
            folder.mkdir();
            System.out.println("Folder Created: "+folderPath);
        }
    }

    //Checking Folder Exists or not
//    public static boolean exists(String folderPath) {
//        File folder = new File(folderPath);
//        return folder.exists();
//    }

    //rename a folder
//    public static void rename(String oldPath, String newPath){
//        File oldFolder = new File(oldPath);
//        File newFolder = new File(newPath);
//
//        if(oldFolder.exists()){
//            oldFolder.renameTo(newFolder);
//            System.out.println("Folder Renamed to: "+newPath);
//        }
//    }

    //delete folder
//    public static void deleteFolder(String folderPath){
//        File folder = new File(folderPath);
//        if(folder.exists()){
////            folder.delete();// it will delete folder if folder is empty
//
////            to delete all the files from folder
//            for(File file: folder.listFiles()){
//                file.delete();
//            }
//            folder.delete();
//            System.out.println("Folder Deleted:"+folderPath);
//        }
//    }

    public static void main(String[] args) {
        String folderPath="C:\\MyFiles";
        createFolder(folderPath);
//        System.out.println("Folder Exists:"+exists(folderPath));//true

//        String newFolderName = "C://myFiles";
//        rename(folderPath, newFolderName);

//        deleteFolder(newFolderName);


    }
}
