import java.util.*;
public class VINTEEUM {
    public static void main(String[] args) {
        //VARIAVEIS//
        double altura, peso, calculo;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite sua altura em metros:");
        altura = ler.nextDouble();
        System.out.println("Digite seu peso em quilogramas: ");
        peso = ler.nextDouble();
        calculo = peso / (altura * altura);
        System.out.println("seu IMC foi: " + calculo);
    }
}