import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x;

        x = teclado.nextInt();

        if(x % 2 != 0){
            for(int i = 0; i<6; i++){
                System.out.println(x);
                x = x + 2;
            }
        }

        else{
            x = x +1;
            for(int i = 0; i<6; i++){
                System.out.println(x);
                x = x + 2;
            }

        }
        
        
    }
}