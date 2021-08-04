import java.util.Scanner;

public class exercicio_3{
    public static void main(String args []){
        Scanner teclado;

        teclado = new Scanner(System.in);
        double salarioMinimo, kw, reaisKw, valorPago, valorDesconto;

        System.out.println("Vamos calcular os gastos da sua residência!");
        System.out.println("Por favor, digite o valor do salario minimo: ");
        salarioMinimo = teclado.nextDouble();

        System.out.println("Por favor, digite o valor de kw gasto: ");
        kw = teclado.nextDouble();



        //Calculando o valor de reais para cada kw
        reaisKw = (salarioMinimo / 7) / 100;
        System.out.println("O valor em reais para cada kw eh de: " + reaisKw);

        //Valor a ser pago
        valorPago = reaisKw * kw;
        System.out.println("O valor em reais a ser pago eh de: " + valorPago);

        //Novo valor a ser pago com desconto de 10%
        valorDesconto = valorPago * 0.9;
        System.out.println("O novo valor a ser pago com desconto de 10% eh de: " + valorDesconto);


    }

}