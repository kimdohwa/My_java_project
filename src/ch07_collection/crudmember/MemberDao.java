package ch07_collection.crudmember;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {

    private List<Member> memberList = new ArrayList<>(); // 회원 목록을 담을 컬렉션

    public MemberDao() {}

    public Member inserData(Member member){ //회원 1명 추가하기
        System.out.println("아이디가 "+ member.getId()+"인 회원이 가입합니다.");
        this.memberList.add(member);
        return member ;
    }


    public int getSize() {
        int size = memberList.size();
        return size;
    }

    public List<Member> selectAll(){
        return memberList ;
    }

    public Member getOne(String findId){
        //특정 아이디 findId를 사용하여 회원이 존재하는 지 검색합니다.
        Member who = null; //발견되면 여기에 값 할당
        for (Member bean:memberList){
            if (bean.getId() == findId){
                 who =bean ;
                 break;
            } else {

            }
        }
        return who ;
    }

    public int deleteData(String deleteId){//int인 이유는 삭제되었다는 안내를 1/-1로 표현하기위함
        int cnt = -1 ;
        for (Member del:memberList){
            if (deleteId.equals(del.getId())){
                memberList.remove(del);
                cnt = 1 ;
                break;
            }
        }
        return cnt ;
    }

    public void deleteAlldata() {
        this.memberList.clear();
        System.out.println("전체삭제완료");
    }
}
