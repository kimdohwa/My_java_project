package ch07_collection;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> coffeeList = new ArrayList<String>();

        coffeeList.add("아메리카노");
        coffeeList.add("카페라테");
        coffeeList.add("에스프레소");
        coffeeList.add("마키아또");
        coffeeList.add("카페라테");

        int idx  ;
        String findData = "카페라테";
        idx = coffeeList.indexOf(findData);
        System.out.println(idx);

        idx = coffeeList.lastIndexOf(findData);
        System.out.println(idx);

        findData = "카푸치노";
        idx = coffeeList.indexOf(findData);
        System.out.println(idx); // -1이 결과값인경우 존재하지않음

//카푸치노 항목이 존재하지 않으면, 추가해보세요

        findData = "카푸치노";

        System.out.println(coffeeList.contains(findData));

    if (coffeeList.indexOf(findData) == -1){
        coffeeList.add(findData);
    }

        System.out.println(coffeeList.contains(findData));

        // 스무디 항목이 존재하지않으면 2번째 위치에 추가 해보세요

        findData = "스무디";

        System.out.println(coffeeList.contains(findData));

    if (coffeeList.indexOf(findData)==-1){
        coffeeList.add(2,findData);
    }

        System.out.println(coffeeList.indexOf(findData));

        for (String colist:coffeeList){
            System.out.println(colist);
        }

        System.out.println("요소크기 : "+ coffeeList.size());

        findData = "콜드브루";
        coffeeList.set(5,findData);

        System.out.println("-----");

        for (int i = 0; i < coffeeList.size(); i++) {
            System.out.println(coffeeList.get(i)+"aa");
        }

        coffeeList.remove(coffeeList.get(0));

        System.out.println(coffeeList.get(0));

        System.out.println(coffeeList);
    }
}
