package ge.edu.btu.finder.threads;

import ge.edu.btu.finder.FilesClass;

public class Counter extends Thread{
    @Override
    public void run(){
        FilesClass filesClass = new FilesClass();

        while(true){
            System.out.println(filesClass.GetFilesCount());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
