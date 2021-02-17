package day11.poly.car;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.frontLeft = new NexenTire();
        myCar.frontRight = new KumhoTire();

        Car s1 = new Sonata();
        Car s2 = new Sonata();
        Car s3 = new Sonata();

        Car k1 = new K5();
        Car k2 = new K5();
        Car k3 = new K5();

        Car m1 = new Malibu();
        Car m2 = new Malibu();
        Car m3 = new Malibu();
        Car m4 = new Malibu();

        Car[] cars = {s1, s2, s3, k1, k2, k3, m1, m2, m3, m4};

        for (Car c : cars) {
            c.run();
        }

        Object[] oArr = {100, "44", 2.5, true, new Car(), new K5(), cars};

        System.out.println("================================");

        Driver kim = new Driver();
        kim.drive(s2);

        System.out.println("================================");

        Car newCar = kim.buyCar("소나타");
//        Sonata newCar = (Sonata)kim.buyCar("소나타")   -> 다운캐스팅
        kim.drive(newCar);
//        ((Sonata)newCar).joinMembership();  -> 자식타입으로 강제 타입변환

        System.out.println("================================");
        CarShop shop = new CarShop();
        int money = shop.sellCar(new Sonata());
        System.out.println("차 판매 수령액: " + money);



    }
}
