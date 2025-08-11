package ch07_collection.crudmember;

import java.util.List;

public class MemberMain {
    public static void main(String[] args) {

        MemberDao dao = new MemberDao();

        Member[] data ={
                new Member("kim","김철수",10,"남자"),
                new Member("lee","이수진",20,"여자"),
                new Member("park","박영희",30,"여자")

        };


        /*dao.inserData(new Member("kim","김만수",10,"남자"));
        dao.inserData(new Member("park","박영희",20,"여자"));
        dao.inserData(new Member("lee","이수진",30,"여자"));
        dao.inserData(new Member("choi","최윤식",40,"남자"));*/

        dao.inserData(new Member("kim","김철수",10,"남자"));
        dao.inserData(new Member("lee","이수진",20,"여자"));
        dao.inserData(new Member("park","박영희",30,"여자"));


        int size = dao.getSize();
        System.out.println("회원은 총 " + size + "명 입니다." );

        System.out.println("\n모든 회원 정보를 출력합니다.");
        List<Member> memberlist = dao.selectAll() ;

        for(Member bean:memberlist){
             String id = bean.getId();
             String name = bean.getName();
             int age = bean.getAge();
             String gender = bean.getGender();

             String msg = id+ "  " + name + "  "+ age + "  " + gender ;
            System.out.println(msg);
        }

        System.out.println("\n특정 아이디를 이용하여 특정 회원 정보를 조회합니다.");
        String findId = "lee";
        Member one = dao.getOne(findId);

        if (one == null){
            System.out.println(findId+"발견안됨");
        }else {String id = one.getId();
            String name = one.getName();
            int age = one.getAge();
            String gender = one.getGender();

            String msg = id+ "  " + name + "  "+ age + "  " + gender ;
            System.out.println(msg);


        System.out.println("\n특정 아이디를 이용하여 특정 회원 정보를 삭제합니다.");
        String deleteId = "park";

        int dell = dao.deleteData(deleteId);
        if (dell == 1){
            System.out.println("삭제완료");
        }else {
            System.out.println(deleteId+ " 가 없습니다.");
        }

        System.out.println("\n전체 회원정보를 삭제합니다.");
        dao.deleteAlldata();

        System.out.println("남은 회원수 : "+dao.getSize());



        }



    }
}
