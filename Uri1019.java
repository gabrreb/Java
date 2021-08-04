import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, formato, horas, minutos, resthoras, restminutos;

        N = teclado.nextInt();

        horas = N / 3600;
        resthoras = N % 3600;
        minutos = resthoras / 60;
        restminutos = resthoras % 60;
        
        System.out.println(horas + ":" + minutos + ":" + restminutos);


    }
}