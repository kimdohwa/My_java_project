package 연습.nopolymorphism;

public class Main {
    public static void main(String[] args) {

       Car name = new CarManager();
        CarManager names = (CarManager)name;



       Car[] car ={
           new Avante( 100, "아반떼", "가장 많은 판매"),
            new Sonata(200,"소나타","Hyundai"),
           new Grandeur(300,"그랜져",24.1)
        };



        for (int i = 0; i < car.length; i++) {

            car[i].showInpo();
            car[i].taxInpo();
        }
    }
}
