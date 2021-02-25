package day18.api.io.readwrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\developing_phc\\java_study" +
                    "\\iotest\\텍스트저장연습.txt");
            String str = "java 수업중입니다. \r\n 집에 갈까?!";

            fw.write(str);
            System.out.println("파일을 정상 저장했습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
