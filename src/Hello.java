import day08.fruit.Apple;
//import day08.bank.Banker;
import day08.bank.*; // bank 패키지에 있는 모든 것을 import

public class Hello {
    /**
     * @param args
     * @author Mr.Park
     */

    /*
    메인 함수는 프로그램이 실행되는 영역입니다.
    모든 자바 프로그램은 메인 함수에서 시작됩니다.
     */
    public static void main(String[] args) {
        //이 코드는 콘솔에 데이터를 출력하는 코드입니다.
        System.out.println("안녕하세요!");
        System.out.println("안녕안녕");

        Apple apple1 = new Apple();
//        new day08.fruit.Apple();
//        new day08.juice.Apple();


        Banker kim = new Banker("이루다");
        Account acc = new Account();
        User park = new User("박영희");
    }
}
