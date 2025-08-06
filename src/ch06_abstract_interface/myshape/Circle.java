package ch06_abstract_interface.myshape;

public class Circle extends Shape {
    private double radius ; //반지름
    private double xpos; //x좌표
    private double ypos; //y좌표

    public Circle(String linecolor, String fillcolor, double radius, double xpos, double ypos) {
        super(linecolor,fillcolor);
        this.radius =radius;
        this.xpos =xpos;
        this.ypos =ypos;
    }

    @Override
    public double calcArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double calcPerimeter() {
        return 2.0*3.14*radius;
    }

    @Override
    public void display() {
        super.area = calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("원형 정보");
        System.out.println("면적 : "+super.area);
        String messege ="둘레 : "+ super.perimeter+ "\n원 중심 : ("+ xpos + ","+ ypos + ")";
        System.out.println(messege);
    }
}
