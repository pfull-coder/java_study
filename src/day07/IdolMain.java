package day07;

// 실행 클래스:main 메서드가 있는 곳
public class IdolMain {
    public static void main(String[] args) {
        // 아이돌 객체 생성
        Idol kara = new Idol();
        kara.teamName = "카라";
        kara.memberNumber = 5;
        kara.memberNames = new String[] {"Park", "Han", "Ni", "Gu", "Gang"};

        kara.introduce();

        System.out.println("================================");
        Idol tvxq = new Idol();
        tvxq.teamName = "동방신기";
        tvxq.memberNumber = 2;
        tvxq.memberNames = new String[] {"유노", "최강"};

        tvxq.introduce();

    }
}
