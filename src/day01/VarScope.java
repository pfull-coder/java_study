package day01;

public class VarScope {
    public static void main(String[] args) {
        // 같은 타입의 변수를 선언할 때, 콤마로 나열 가능.
        int num1 = 10, num2 = 20;

        if (true) {
            int num3 = num1 + num2;
        }// end if
        int num3 = 100;
        System.out.println(num3);

    }
    // 블록을 넘어간 상태에서 num1과 num2를 사용할 수 없기 때문에 오류발생.
    // int num4 = num1 + num2;
} // end main
// end class
