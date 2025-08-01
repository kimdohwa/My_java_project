package ch04_class;

public class food05 {
    private String name ;
    private String kind ;
    private int price ;
    private int cost ;
    private String area ;
    private int total ;
    private String delivery ;
    private String possiblearea ;


   food05(String name,String kind, int price, int cost, String area){
        this.name = name ;
        this.kind = kind ;
        this.price = price ;
        this.cost = cost ;
        this.area = area ;

        this.total = price+cost ;

        if (total>10000){
            delivery="배달가능";
        } else {
            delivery="배달불가";
        }

        switch (area){
            case "서울": case "경기":
                possiblearea = "가능지역";
                break;
            default:
                possiblearea = "불가능지역";
                break;

        }
   }

    public void output(){
        System.out.println("이름 : " + name);
        System.out.println("종류 : " + kind);
        System.out.println("가격 : " + price);
        System.out.println("지역 : " + area);
        System.out.println("총 합계 : " + total);
        System.out.println("배달가능여부 : " + delivery);
        System.out.println("가능지역여부 : " + possiblearea);

    };
}
