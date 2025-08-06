package ch06_abstract_interface.myshape;

public class Triangle extends Shape {//> 빨간줄이뜨면 커서를 올려서 오버라이딩하기
    private double width; //너비
    private double height ; //높이

    public Triangle(String linecolor, String fillcolor, double width, double height) {
        super(linecolor,fillcolor);
        this.width = width;
        this.height = height;
    }

    @Override//부모클래스의 추상 메소드를 오버라이딩 했습니다.
    public double calcArea() {//각 클래스는 각자의 맡은 역할을 여기에 구현하면 됩니다.

        return width*height/2.0;
    }

    @Override
    public double calcPerimeter() {
        return 20;
    }

    @Override
    public void display() {
        super.area =this.calcArea();
        super.perimeter = calcPerimeter();
        System.out.println("삼각형 정보");
        System.out.println("면적 : "+ super.area);
        System.out.println("둘레 : "+ super.perimeter);
    }
}
