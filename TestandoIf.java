import java.util.Scanner;

public class TestandoIf{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double n1, n2, media;
        

        //Recebendo a entrada
        System.out.println("Digite a nota da prova 1: ");
        n1 = teclado.nextDouble();
        System.out.println("Digite a nota da prova 2: ");
        n2 = teclado.nextDouble();

        //Calculando a media
        media = (n1 + n2) / 2;
        System.out.println("Sua media eh: " + media);

        //Verificando se foi aprovado

        if(media >= 6){
            System.out.println("Parabens voce foi aprovado!");
        }

        else{
            System.out.println("Voce foi reprovado.");
        }

    }   
}