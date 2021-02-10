package day09.players;

import day09.player.Player;

public class Main {

    public static void main(String[] args) {

        //파티 생성
        Players party = new Players(5);


        System.out.println("====================================");
    // 파티원 추가
    party.addPlayer(new Player("wizard", 66, 190));
    party.addPlayer(new Player("ock"));
    party.addPlayer(new Player("archor"));
    party.addPlayer(new Player("knight"));
    party.addPlayer(new Player("slime"));
    party.addPlayer(new Player("elf"));

    // 파티원 정보 확인
        System.out.println("\n====================================");
        party.showPartyInfo();
    }


}
