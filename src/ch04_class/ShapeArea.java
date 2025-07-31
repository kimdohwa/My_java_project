package ch04_class;

public class ShapeArea {

    void area(double x) {
        final double PI = 3.14;
        double area = x * x * PI;

        System.out.println(area);
    }

    void area(double x, double y){
        double area = x * y ;
        System.out.println(area);
    }

    void area(double x, double y, double z){
        final int aa = 2 ;
        double area = (x + y)*z/aa ;

        System.out.println(area);
    }


}
