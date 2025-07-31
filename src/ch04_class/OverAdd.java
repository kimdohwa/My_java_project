package ch04_class;

public class OverAdd {

    int Add(int a, int b, int c){
        int result =0 ;
        result = a+b+c;
        return result;
    }

    public void Add(int a, int b) {
        System.out.println("정수 덧셈 : "+(a+b));
    }

    public void Add(double x, double y) {
        System.out.println("실수 덧셈 : "+(x+y));
    }

    public void Add(int x, double y) {
        System.out.println("혼합형 : "+ (int)(x+y));
    }
    }

