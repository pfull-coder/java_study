package day08.bank;

import day08.bank.Account;
import day08.bank.Banker;
import day08.bank.Paper;

public class User {

    String name;
    Account account;

    public User(String n) {
        name = n;
    }

    // 계좌생성 요청기능
    void requestMakeAccount(Banker banker, Paper paper) {
        Account myAccount = banker.makeAccount(paper);
        account = myAccount;
    }
}
