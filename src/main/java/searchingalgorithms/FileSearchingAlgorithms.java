package searchingalgorithms;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FileSearchingAlgorithms {
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        searchFileRecurtion(new File("C:\\"), fileList);

        for(File file: fileList){
            System.out.println(file.getAbsolutePath());
        }
    }

    private static void searchFileRecurtion(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            System.out.println("Searching: " + rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFileRecurtion(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}
