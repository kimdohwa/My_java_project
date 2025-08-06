package ch06_abstract_interface.myshape;

public abstract class Shape {
    private String linecolor;//라인색상
    private String fillcolor;//채우기색상
    protected double area;//면적
    protected double perimeter;//둘레
    //일반화 : 모든 도형에서 사용하는 면적둘레라인색상 채우기생상등 슈퍼클래스에서 사용합니다.

    public Shape() {
    }
// 내용이 정의되지 않는 모델 개념으로, 불완전한 메소드입니다.
    public abstract double calcArea();
    public abstract double calcPerimeter();
    public abstract void display();

    public Shape(String linecolor, String fillcolor) {
        this.linecolor=linecolor;
        this.fillcolor=fillcolor;
    }

    protected final void draw(){
        System.out.println("라인색상 : "+linecolor);
        System.out.println("채우기색상 : "+fillcolor);
    }//final 메소드는 오버라이딩을 할수없습니다.


}
