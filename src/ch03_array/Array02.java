package ch03_array;

public class Array02 {
    public static void main(String[] args) {
        String[] bts = {"진","뷔","정국","RM","지민","슈가","제이홉"};

        for (int i = 0; i < bts.length; i++) {
            if (i<(bts.length - 1)){
                System.out.print(bts[i]+",");
            }else {
                System.out.print(bts[i]);
            }
        }
    }
}
