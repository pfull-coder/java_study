package com.oop.myapp.company;

import com.oop.myapp.idol.GirlGroup;

public class Manager {

    private GirlGroup[] idol;
    private int number; //관리하고 있는 걸그룹 수

    public Manager() {

    }

    //관리걸그룹 추가기능
    public void addGroup(GirlGroup idol) {

    }

    //관리 걸그룹명 전체 출력기능
    public void showAllGroupName() {

    }

    /* setter - getter */

    public GirlGroup[] getIdol() {
        return idol;
    }

    public void setIdol(GirlGroup[] idol) {
        this.idol = idol;
    }

    public int getNumber() {
        return number;
    }

    //매니저가 관리하는 인원의 수가 0명이상 10명 이하가
    // 되도록 setter에 제한조건을 걸어보세요. 조건이외의 값은 0으로 설정

    public void setNumber(int number) {
        if (number > 10 && number < 0) {
            this.number = 0;
            return;
        }
        this.number = number;
    }
}
