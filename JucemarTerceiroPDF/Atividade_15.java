import java.util.*;
public class Atividade_15 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double peso,alt;

        System.out.println("Quaal sua altura:");
        alt = ler.nextDouble();
        System.out.println("E quantos você pesa:");
        peso = ler.nextDouble();
        System.out.println(" Sendo assim o seu indice de IMC é: " + peso/(alt*alt));

    }
}
