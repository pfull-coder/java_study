package day14.api.lang.wrapper;

public class Basic {
    public static void main(String[] args) {

        int a = 100;
        double b = 5.5;
        char c = 'G';
        boolean d = false;

        // Boxing: 기본 데이터를 객체로 변환
        Integer v1 = new Integer(a);
        Double v2 = new Double(b);
        Character v3 = new Character(c);
//        String v4 = new String("hello");

        // AutoBoxing: new 연산자를 생략하고 객체변환
        Integer x1 = a;
        Double x2 = 3.14;

        Object[] arr = {v1, v2, 10, 404, 3.14};

        // 문자열을 기본 타입으로 변환 기능
        // Wrapper 클래스명.parse + 기본 타입명(변환할 문자열)

        String s1 = "10";
        String s2 = "3.141592";

        int x = Integer.parseInt(s1);
        double y = Double.parseDouble(s2);
        System.out.println(x + y);

        try {
            Integer.parseInt("안녕");
        } catch (NumberFormatException e) {
            System.out.println("변환 불가능한 문자열입니다.");
        }

    }
}
