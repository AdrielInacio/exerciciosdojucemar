import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] ags){
        double base,altura, calculo;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a a base de um triangulo: ");
        base = ler.nextDouble();
        System.out.println("Agora digite a altura:");
        altura = ler.nextDouble();
        calculo = altura*2;

        System.out.println("A area do triangulo é:" + (calculo + base));
    }
}
