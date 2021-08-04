import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int n;

        n = teclado.nextInt();

        for(int i = 1; i<= n; i+=2){
            System.out.println(i);
        }
    }
}