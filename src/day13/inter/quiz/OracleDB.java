package day13.inter.quiz;

public class OracleDB implements DataBaseAccess {
    @Override
    public void select() {
        System.out.println("OracleDB에 데이터 조회!");
    }

    @Override
    public void insert() {
        System.out.println("OracleDB에 데이터 삽입!");
    }

    @Override
    public void update() {
        System.out.println("OracleDB에 데이터 수정!");
    }

    @Override
    public void delete() {
        System.out.println("OracleDB에 데이터 삭제!");
    }
}
