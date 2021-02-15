package day10.inherit.calculator;

public class Computer extends Calculator{

    @Override
    double calcAreaCircle(double r) { // 겉모습을 똑같이 해주는 것 Override 꼭 기억하기!
        return  r * r * Math.PI;
    }
}
