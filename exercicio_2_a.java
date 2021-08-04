import java.util.Scanner;

public class exercicio_2_a{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);
        
        double lado, area;
        
        System.out.println("Vamos calcular a area do quadrado, por favor insira o valor do lado: ");
        lado = teclado.nextDouble();

        area = lado * lado;
        System.out.println("A area do quadrado: " + area);
        
    }
}