package ch01_variable_operator;

public class PlusMinus01 {
    public static void main(String[] args) {
        int a = 10, b = 20, c ;

        c= ++a + b++ ;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);

        c= a++ + --b ;

        System.out.println("a: "+a);//(a+1)12
        System.out.println("b: "+b);//(b-1)20
        System.out.println("c: "+c);//31

        a = 15;
        b = 12;

        c= --a + --b ;//1.--a / 2. --b/ 3. + / 4. =

        System.out.println("a: "+a); //(a-1)14
        System.out.println("b: "+b); //(b-1)11
        System.out.println("c: "+c); //25

        a=10 ;
        b=20 ;

        ++a;//11
        b--;//19
        c = ++a + b-- ;

        System.out.println("a: "+a); //11 12
        System.out.println("b: "+b); //19 18
        System.out.println("c: "+c); //31 31
    }
}
