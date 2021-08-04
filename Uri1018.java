import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, nota100, rest100, nota50, rest50, nota20, rest20, nota10, rest10, nota5, rest5, nota2, rest2;

        N = teclado.nextInt();

        nota100 = N / 100;
        rest100 = N % 100;
        nota50 = rest100 / 50;
        rest50 = rest100 % 50;
        nota20 = rest50 / 20;
        rest20 = rest50 % 20;
        nota10 = rest20 / 10;
        rest10 = rest20 % 10;
        nota5 = rest10 / 5;
        rest5 = rest10 % 5;
        nota2 = rest5 / 2;
        rest2 = rest5 % 2;
        
        System.out.println(N);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(rest2 + " nota(s) de R$ 1,00");


    }
}