import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n;
        int pares = 0;

        n = teclado.nextInt();
        for(int i=1; i<5; i++){
            n = teclado.nextInt();
                if(n % 2 == 0){
                    pares++;
                }
        }

        System.out.println(pares + " valores pares");
    }
}