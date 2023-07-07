import java.util.*;
public class QUATRO {
    public static void main(String[] args) {
        //VARIAVEIS//
        double C,fah;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite os graus em celsius: ");
        C = ler.nextDouble();
        fah = (C*9/5)+32;
        System.out.println("A conversão para Fahrenheint deu: " + fah);

    }
}
