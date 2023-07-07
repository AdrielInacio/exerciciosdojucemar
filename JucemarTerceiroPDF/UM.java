import java.util.*;
public class UM {
    public static void main(String[] args) {
        //VARIAVEIS//
        int n1,n2,calculo;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextInt();
        calculo = n1+n2;
        System.out.println("A soma dos dois numeros é: " + calculo);
    }
}
