package day02;

public class StdOutput {
    public static void main(String[] args) {

        String dog = "멍멍이";
        String cat = "야옹이";
        System.out.print(dog);
        System.out.println(cat);

        int month = 3;
        int day = 1;
        String anniversary = "삼일절";
        // C언어 방법 사용
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anniversary);
        System.out.println("Hello");

        System.out.println("=================================");

        // %f는 기본적으로 소수점 6자리를 자동으로 맞춥니다.
        // %.2f >> 소수점 2자리까지 표현
        double saleRate = 0.2;
        System.out.printf("할인율은 %.2f%%입니다.\n", saleRate);
    }
}

