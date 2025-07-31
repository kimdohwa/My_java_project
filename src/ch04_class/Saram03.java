package ch04_class;

public class Saram03 {

    private String name;
    private String hobby;
    private String blood;
    private double height;
    private double weight;

    public void setName(String name){
        this.name = name;
    }
// 인스턴스변수값을 지역변수 name으로 설정
    public String getName(){
        return name;
    }
// 인스턴스 변수값을 반환


    public void setHeight(double height){
       this.height=height;
    }

    public double getHeight(){
        return height;
    }

    public void setHobby(String hobby){
        this.hobby=hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
