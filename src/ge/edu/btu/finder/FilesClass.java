package ge.edu.btu.finder;

import java.io.File;
import java.io.FilenameFilter;

public class FilesClass {
    String filePath = "C:\\Users\\avtan\\Desktop\\JavaMidterm\\რესურსები\\BTU_DOCUMENT";

    public String[] GetFileNames(String word) {
        File file = new File(filePath);
        String[] fileNames = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                String searchKey = word;

                if (name.toLowerCase().contains(searchKey.toLowerCase())) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        return fileNames;
    }
    public int GetFilesCount(){
        File file = new File(filePath);
        return (int) file.list().length;
    }
}
