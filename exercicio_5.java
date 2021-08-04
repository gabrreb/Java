import java.util.Scanner;

public class exercicio_5{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);

        double tempo, velocidade, distancia, litrosGastos;

        System.out.println("Tempo gasto na viagem: ");
        tempo = teclado.nextDouble();

        System.out.println("Velocidade media: ");
        velocidade = teclado.nextDouble();

        //Quantidade de litros de combustível gasto numa viagem

        distancia = velocidade * tempo;
        litrosGastos = distancia / 12; 

        System.out.println("O valor de combustivel gasto na viagem eh de: " + litrosGastos + " L");

    }
}