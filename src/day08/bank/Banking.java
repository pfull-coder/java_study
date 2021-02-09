package day08.bank;

public class Banking {
    public static void main(String[] args) {
        // 은행원 생성
        Banker star = new Banker("스타");
        Banker uri = new Banker("우리");

        // 사용자 생성
        User kkun = new User("쿤");

        //사용자의 계좌 생성 요청
        kkun.requestMakeAccount(star, new Paper(kkun.name, "1234"));

        System.out.println("쿤 통장 비밀번호: " + kkun.account.password);


    }
}
