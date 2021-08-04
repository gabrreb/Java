import java.util.Scanner;

public class exercicio_2_e{
    public static void main(String args []){
        Scanner teclado;

        teclado = new Scanner(System.in);
        double baseMaior, baseMenor, altura, area;

        System.out.println("Vamos calcular a area do trapezio!");
        System.out.println("Valor da Base Maior: ");
        baseMaior = teclado.nextDouble();

        System.out.println("Valor da Base Menor: ");
        baseMenor = teclado.nextDouble();

        System.out.println("Valor da altura: ");
        altura = teclado.nextDouble();

        area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("Valor da area do trapezio: " + area);
        


    }
}