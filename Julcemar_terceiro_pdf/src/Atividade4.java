import java.util.Scanner;
public class Atividade4 {

    public static void main(String[] ags){
        double n1,fah;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os graus em Celsius: ");
        n1 = ler.nextDouble();
        fah = n1 * 9/5 + 32;
        System.out.println("Os graus em Fahrenheit é:  " + fah);

    }

}
