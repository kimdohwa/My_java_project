package 연습;

public class Dohwa_1 {
    public static void main(String[] args) {
        Dohwa dohwa = new Dohwa("김도화");

        dohwa.number("폰","번호");

        Dohwa[] dohwas = new Dohwa[3];

        dohwas[0] = new Dohwa("김도화0");
        dohwas[0].number("null","dd");

        dohwas[1] = new Dohwa("김도화1");
        dohwas[2] = new Dohwa("김도화2");


    }
}
