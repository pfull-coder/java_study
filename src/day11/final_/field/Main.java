package day11.final_.field;

public class Main {
    public static void main(String[] args) {

        Korean kim = new Korean("932324-235352");
        kim.name = "김철수";

//        kim.NATION = "중국";
//        kim.password = "324522-235235";
        System.out.println(Korean.NATION);
    }
}
