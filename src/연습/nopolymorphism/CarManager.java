package 연습.nopolymorphism;

public class CarManager extends Car{

    String[] names = {"김철수","박영희","최민수"};
    String name ;


    public String namesInfo(){

        for (int i = 0; i < names.length; i++) {
            this.name = names[i];
        }
        return this.name;
    }


    /*private String name ;

    public String name(){
        for (int i = 0; i < names.length ; i++) {
            this.name=names[i];
        }
        return this.name;
    }

    public void showInpo(){
        System.out.println(this.name);
    }*/
}
