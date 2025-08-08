package ch07_collection;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();

        set.add("아메리카노");
        set.add("아메리카노");
        set.add(123);
        set.add(false);

        set.clear();

        set.add("아메리카노");
        set.add("에스프레소");
        set.add("믹스커피");
        set.add("카페라테");

        String findData = "카푸치노";
        System.out.println(findData + "존재여부 : "+set.contains(findData));

        findData = "마키아또";

        if (set.contains(findData)){
            System.out.println("있음");
        }else {
            set.add(findData);
            System.out.println("없어서 추가함");
        }

        //믹스커피가 존재하면 삭제하고 삭제성공이라는 문구를 출력해주세요

        String removeData = "스무디";

        if (set.remove(removeData)){
            System.out.println("삭제성공");
        }else {
            System.out.println("존재하지않음");
        }

        System.out.println(removeData + "존재여부 : "+set.contains(removeData));

        System.out.println("확장 for 구문을 이용한 요소 출력");
        // for(타입 단수이름:복수이름){...}

        for (Object item:set){
            System.out.println(item);
        }

        System.out.println("요소크기 : "+set.size());

        System.out.println(set);
    }
}
