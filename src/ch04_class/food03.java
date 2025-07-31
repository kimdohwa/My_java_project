package ch04_class;

public class food03 {
    private String 이름 ;
    private String 종류 ;
    private String 맛 ;
    private int 가격 ;
    private int 배달비 ;
    private int 배달비포함금액 ;
    private String 배달가능여부 ;
    private String Ar ;



    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public String get종류() {
        return 종류;
    }

    public void set종류(String 종류) {
        this.종류 = 종류;
    }

    public String get맛() {
        return 맛;
    }

    public void set맛(String 맛) {
        this.맛 = 맛;
    }

    public int get가격() {
        return 가격;
    }

    public void set가격(int 가격) {
        this.가격 = 가격;
    }

    public int get배달비() {
        return 배달비;
    }

    public void set배달비(int 배달비) {
        this.배달비 = 배달비;
    }

    public int get배달비포함금액(){
        배달비포함금액 = 가격+배달비;
        return 배달비포함금액;
    }

    public String get배달가능여부(){
        if (가격<6000){
            배달가능여부 = "배달불가";
        }else {
            배달가능여부 = "배달가능";
        }
        return 배달가능여부 ;
    }

    public void setAr(String Ar){
        this.Ar = Ar;
    }

    public String getAr(){
      switch (Ar){
          case "서울": case "경기": case "강원":
              Ar = "가능지역";
              break;
          default:
              Ar= "불가지역" ;
              break;
      }
      return Ar;
    }

}
