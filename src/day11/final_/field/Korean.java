package day11.final_.field;

public class Korean {

    public String name; //이름


    // 'static final'이 붙으면 상수(유일하고 불변한 값)로 분류

    public static final String NATION = "대한민국"; // 국적
    public final String password; // 주민번호

    public Korean(String password) {
        this.password = password;
    }
}
