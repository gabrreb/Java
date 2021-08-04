public class Continhas{
    public static void main(String args[]){

        int a, b, c;

        a = 23;
        b = 4;

        c = a + b;

        System.out.println("Valor da soma = " + c);

        c = a - b;
        System.out.println("Valor da subtracao = " + c);

        c  = a * b;
        System.out.println("Valor da mult = " + c);

        c = a / b;
        System.out.println("Valor da div = " + c);

        c = a % b;
        System.out.println("Valor do resto = " + c);

        System.out.println("************* Contas quebradas **************");


        float x, y, z;

        x = 23.3f;
        y = 4.3f;
        z = x / y;
        System.out.println("Valor da divisão quebrada = " + z);
        System.out.printf("Valor com 4 casas decimais %.4f\n", z);
        System.out.printf("Valor com 3 casas decimais %.3f\n", z);
    }
}