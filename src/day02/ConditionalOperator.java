package day02;

public class ConditionalOperator {
    public static void main(String[] args) {

    int money = 6000;

        System.out.println("가진 돈 : " + money);
        String food = (money >= 5000) ? "육개장" : "라면";
        System.out.println("오늘 먹을 음식: " + food);

    }
}
