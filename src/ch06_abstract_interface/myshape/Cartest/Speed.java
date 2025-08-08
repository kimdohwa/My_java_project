package ch06_abstract_interface.myshape.Cartest;

public interface Speed {
    public static final int ALLOWED_MAX_SPEED = 50;

    public abstract void speedUP(int speed); // 가속기
    public abstract void speedDOWN(int speed); // 감속기


}
