import java.util.*;
public class TREES {
    public static void main(String[] args) {
        //VARIAVEIS//
        int base,altura,calculo;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite a base do triangulo: ");
        base = ler.nextInt();
        System.out.println("Digite a altura do triangulo: ");
        altura = ler.nextInt();
        calculo = (base*altura)/2;
        System.out.println("A area do triangulo é: " + calculo);

    }
}
