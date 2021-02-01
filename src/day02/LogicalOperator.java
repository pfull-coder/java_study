package day02;

public class LogicalOperator {
    public static void main(String[] args) {

        int x = 10, y = 20;
        // 왼쪽에서 논리값이 결정되면 오른쪽 값을 실행하지 않아 y값이 반영되지 않음.
        System.out.println((x != 10) && (++y == 21));
        System.out.println((x == 10) || (++y == 21));
        System.out.println("x: " + x + ", y: " + y);

        System.out.println((x != 10) & (++y == 21));
        System.out.println((x == 10) | (++y == 21));
        System.out.println("x: " + x + ", y: " + y);


    }
}
