package day08.modi.member.pac1;

public class B {
    public B() {
        A a = new A();
        a.f1 = 1; //f1 : public
        a.f2 = 2; //f2 : default
//        a.f3 = 3; //f3 : private
        a.m1();
        a.m2();
//        a.m3();
    }
}
