package ch05_package_inheritance.mybeverage;

public class Beverage04 {
    private String name;
    private double price;

    public  Beverage04(){}

   final void ShowInfo(){

        String msg ="\n이름 : "+ name +"\n단가 : "+ price;
       System.out.println(msg);
    }


    public Beverage04(String name, double price){
        this.name= name;
        this.price= price ;
    }


}
