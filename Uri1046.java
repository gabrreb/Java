import java.util.Scanner;

public class Uri1046{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        int inicio, fim, duracao;
        duracao =0;

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        if(inicio > fim){
            duracao = 24 - inicio;
            duracao = duracao + fim;
        }

        else if(inicio == fim){
            duracao =24;
        }

        else if(fim > inicio){
            duracao = fim - inicio;
        }


        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    }
}