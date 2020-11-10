package ge.edu.btu.finder.threads;

import ge.edu.btu.finder.FilesClass;

import java.util.Scanner;

public class Finder extends Thread{
    @Override
    public  void run() {
        Scanner myObj = new Scanner(System.in);
        FilesClass filesClass = new FilesClass();

        while(true) {
            System.out.println("Enter word");
            String word = myObj.nextLine();

            String[] fileNames = filesClass.GetFileNames(word);

            System.out.println("შემოტანილი სიტყვაა: " + word);
            for (String fileName : fileNames) {
                System.out.println("მოიძებნა: " + fileName);
            }
        }
    }
}
