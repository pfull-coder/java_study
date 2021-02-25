package day18.api.io.readwrite;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {

        FileReader fr = null;
        try {
            fr = new FileReader("D:\\developing_phc\\java_study" +
                    "\\iotest\\텍스트저장연습.txt");
            while(true) {
                int data = fr.read();
                if(data == -1) break;
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
