package day11.poly.overloading;

public class Basic {

    // 데이터를 전달하면 해당 데이터의 타입을 출력하는 메서드

    void alertType(String s) {
        System.out.println("문자열 1개가 전달됨.");
    }

    // alertType(String) 처럼 같은 구조가 나오면 안됨.
    // int alertType(String str) { return 0; }

    void alertType(int i) {
        System.out.println("정수 1개가 전달됨.");
    }

    void alertType(double d) {
        System.out.println("실수 1개가 전달됨.");
    }

    // 데이터 타입의 순서나 들어오는 방식에 따라 사용가능하다.

    //alertType(int, double)
    void alertType(int a, double b) {}

    //alertType(double, int)
    void alertType(double a, int b) {}

}
