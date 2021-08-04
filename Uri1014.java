import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int distancia;
        double combustivel, consumo;

        distancia = teclado.nextInt();
        combustivel = teclado.nextDouble();

        consumo = distancia / combustivel;

        System.out.printf("%.3f km/l\n", consumo);

    }
}