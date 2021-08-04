import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hinicial, duracao, minicial, hfinal, mfinal, duracaohoras, duracaominutos, periodo, periodoinicial, periodofinal;
        duracaohoras = 0;
        duracaominutos = 0;
        duracao = 0;
        periodo = 0;
        hinicial = teclado.nextInt();
        minicial = teclado.nextInt();
        hfinal = teclado.nextInt();
        mfinal = teclado.nextInt();
        
        hinicial = hinicial * 60;
        hfinal = hfinal * 60;

        periodoinicial = hinicial + minicial;
        periodofinal = hfinal + mfinal;
        
        if(periodoinicial < periodofinal){
            duracao = periodofinal - periodoinicial;
            duracaohoras = duracao / 60;
            duracaominutos = duracao % 60;
        }

        else if (periodoinicial > periodofinal){
            duracao = 1440 - periodoinicial;
            duracaohoras = (duracao + periodofinal) / 60;
            duracaominutos = (duracao + periodofinal) % 60; 

        }
        else if (periodoinicial == periodofinal){
            duracaohoras = 24;
            duracaominutos = 0;
        }

        
        System.out.println("O JOGO DUROU " + duracaohoras +" HORA(S) E " + duracaominutos + " MINUTO(S)"); 
    }
}