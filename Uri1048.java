import java.util.Scanner;

public class Uri1048{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        double salario, reajuste, novosalario;
        String percentual;
        //entradas
        salario = teclado.nextDouble();

        //processamento

        if (salario <= 400){
            percentual = "15 %";
            novosalario = salario * 1.15;
            reajuste = novosalario - salario;
        }

        else if((salario >= 400.01) && (salario <= 800)){
            percentual = "12 %";
            novosalario = salario * 1.12;
            reajuste = novosalario - salario;
        }

        else if((salario >= 800.01) && (salario <= 1200)){
            percentual = "10 %";
            novosalario = salario * 1.10;
            reajuste = novosalario - salario;
        }

        else if((salario >= 1200.01) && (salario <= 2000)){
            percentual = "7 %";
            novosalario = salario * 1.07;
            reajuste = novosalario - salario;
        }

        else {
            percentual = "4 %";
            novosalario = salario * 1.04;
            reajuste = novosalario - salario;
        }


        System.out.printf("Novo salario: %.2f\n", novosalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentual);

    }
}