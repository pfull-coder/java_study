package day11.poly.casting;

import day08.modi.cls.pac2.C;

public class Main {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.method1();
        p.method2();
//        p.method3(); 부모타입에서는 자식타입에서 정의된 내용을 호출할 수 없다.
        System.out.println("=======================");
/*
        Child c = new Child();
        c.method1();
        c.method2();
        c.method3();
*/
        Parent c = new Child();
        c.method1();
        c.method2();
        ((Child)c).method3();
    }
}
