import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int par, impar, positivo, negativo, n;
        par = impar = positivo = negativo = 0; 
        

        //entrada
        //n = teclado.nextInt();

        for(int i=1; i<=5; i++){
            n = teclado.nextInt();
                if(n % 2 == 0){
                    par++;
                    if (n > 0){
                    positivo++;
                    }
                    else if (n == 0){

                    }
                    else{
                    negativo++;    
                    }
                }

                else {
                    impar++;
                    if (n > 0){
                    positivo++;
                    }
                    else{
                    negativo++;    
                    }

                }
                
        }


        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}