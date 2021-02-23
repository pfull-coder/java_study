package day15.api.util.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

//        String[] strs = new String[100];

        List<String> sList = new ArrayList<>();

        String str1 = "멍멍";
        String str2 = "야옹";

        // list 객체 추가: add(추가할 객체)
        sList.add(str1);
        sList.add(str2);
        sList.add("짹짹");
        sList.add("개굴");
        sList.add("멍멍"); // 중복가능
        sList.add("어흥");

        System.out.println("sList = " + sList);

        // list 저장된 객체 수 확인: size()
        int size = sList.size();
        System.out.println("저장된 객체 수: " + size);
        System.out.println("===========================");

        // list 객체 삽입: add(index, 객체);
        sList.add(2, "용용");
        System.out.println("sList = " + sList);

        // list 객체 수정: set(index, 수정객체)
        sList.set(3, "콩콩");
        System.out.println("sList = " + sList);
        System.out.println("===========================");

        // list 객체 삭제: remove(index), remove(객체)
        sList.remove(6);
        System.out.println("sList = " + sList);

        sList.remove("개굴");
        sList.remove(str1);
        System.out.println("sList = " + sList);

        // list 저장된 객체 참조하기: get(index)
        String data = sList.get(2);
        System.out.println("data = " + data);
        System.out.println("===========================");

        // list 반복문 처리
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }

        System.out.println("===========================");
        for (String s : sList) { // iter + tap
            System.out.println(s);
        }

        // list에 저장된 객체의 인덱스 얻기: indexOf(객체)
        int idx = sList.indexOf("어흥");
        System.out.println("어흥의 인덱스: " + idx);

        // list에 저장된 객체 유무 확인" contains(객체)
        System.out.println(sList.contains("콩콩"));
        System.out.println(sList.contains("뇽뇽"));
        System.out.println(!sList.contains("어흥"));

        // list 내부 객체 전체 삭제: clear()
        sList.clear();
        System.out.println("sList = " + sList);
        System.out.println("size = " + sList.size());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(50);
        numbers.add(70);
        System.out.println("numbers = " + numbers);

        List objList = new ArrayList(); //Object 리스트

        // 초기값들이 들어있는 리스트 생성법
//        List<Integer> numberList = Arrays.asList(50,60,30,120,80);
        List<Integer> numberList = new ArrayList<>(
                Arrays.asList(50,60,30,120,80)
        );
        System.out.println("========================================");

        numberList.add(100);
        System.out.println("numberList = " + numberList);

        // 오름차 정렬
        numberList.sort(Integer::compareTo);
        System.out.println("numberList = " + numberList);

        // 내림차 정렬
        numberList.sort(Comparator.reverseOrder());
        System.out.println("numberList = " + numberList);
    }
}