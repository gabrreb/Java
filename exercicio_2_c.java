import java.util.Scanner;

public class exercicio_2_c {
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Vamos calcular a area do triangulo!");
        System.out.println("Valor da base da triangulo: ");
        base = teclado.nextDouble();

        System.out.println("Valor da altura da triangulo: ");
        altura = teclado.nextDouble();

        area = (base * altura) / 2;


        System.out.println("Area do triangulo: " + area);





    }
}