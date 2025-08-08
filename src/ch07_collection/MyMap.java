package ch07_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class MyMap {
    public static void main(String[] args) {
        Map<String,Integer> teamMap = new HashMap<String,Integer>();

        teamMap.put("LG",1);
        teamMap.put("SSG",2);
        teamMap.put("두산",3);
        teamMap.put("kt",4);

        String findItem = "nc";

        boolean bool = teamMap.containsKey(findItem);

        System.out.println(bool);

        //nc팀이 존재하는지 체크하고 없으며 순위 5위로 추가해주세요

        if (bool == false){
            teamMap.put(findItem,5);
        }
        System.out.println(teamMap.containsKey(findItem));

        //순위가 6위인 팀이 존재하는지 체크하고, 존재하지않으면 "kia"를 추가해주세요
        // 그리고, 존재여부를 적절한 문구로 출력해주세요

        findItem = "kia";
        int pos = 6;
        bool = teamMap.containsValue(pos);

        if (bool == false){
            teamMap.put(findItem,pos);
        }

        System.out.println(teamMap.containsValue(6));
        
        String[] teams ={"롯데", "한화", "키움","삼성"};
        for (int i = 0; i <teams.length ; i++) {
            teamMap.put(teams[i],i+7);
        }

        System.out.println(teamMap);//>>to.strig이 숨어있음

        findItem = "두산";
        Integer rank =teamMap.get(findItem);

        System.out.println(rank);

        if (rank == null){
            System.out.println(findItem+"팀은 존재하지않습니다.");
        } else {
            String msg = "팀명 : "+ findItem + "순위 : "+rank;
            System.out.println(msg);
        }

        System.out.println("다음 팀들의 순위 정보를 출력 해 주세요.");
        String[] findTeams = {"두산", "kt", "빙그레"};

        System.out.println(teamMap);

        for (int i = 0; i < findTeams.length; i++) {

            if (teamMap.containsKey(findTeams[i])){
                System.out.println(findTeams[i]+"의 순위는 "+teamMap.get(findTeams[i])+"위 입니다.");
            } else {
                System.out.println(findTeams[i]+"는 존재하지않는 팀 입니다.");
            }
        }


        for (String one:findTeams){
            rank= teamMap.get(one);

            if (rank == null){
                System.out.println(one +"(은)는 존재하지않는 팀 입니다.");
            } else {
                System.out.println(one+"의 순위는 "+rank+"위 입니다.");
            }
        }

        teamMap.put("빙그레",11);

        System.out.println(teamMap);

        Set<String> items = teamMap.keySet();

        for (String key:items){
            String msg = key + "팀은 순위가 "+ teamMap.get(key) + "입니다.";
            System.out.println(msg);
        }

        teamMap.clear();

        if (teamMap.isEmpty()){
            System.out.println("teamMap is empty");
        }else {
            System.out.println("teamMap is not empty");
        }
    }
}
