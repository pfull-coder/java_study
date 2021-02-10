package day09.encap.good;

public class Main {
    public static void main(String[] args) {

        Cat navi = new Cat();

//        navi.weight = 30;
//        navi.setWeight(-1000); 5.0kg로 확인할 수 있다.
        navi.setWeight(11);

        double naviWeightForPound = navi.getWeight(true);
        double naviWeightForKg = navi.getWeight(false);

        System.out.println("naviWeightForPound = " + naviWeightForPound);
        System.out.println("naviWeightForKg = " + naviWeightForKg);

        navi.printWeight();


    }
}
