package day11.poly.car;

public class CarShop {

    // 차량 판매시 차량 금액을 리턴하는 메서드
    public int sellCar(Car car) {
        if (car instanceof Sonata) {
            System.out.println("소나타는 1200만원입니다.");
            return 1200;
        } else if (car instanceof K5) {
            System.out.println("K5는 1150만원입니다.");
            return 1150;
        } else if (car instanceof Malibu) {
            System.out.println("말리부는 1300만원입니다.");
            return 1300;
        } else {
            System.out.println("알 수 없는 차량정보입니다.");
            return 0;
        }
    }
}
