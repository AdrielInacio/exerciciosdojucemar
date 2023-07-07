import java.util.*;
public class VINTEEDOIS {
    public static void main(String[] args) {
        //VARIAVEIS
        int Number1, Number2,MaiorNumero;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite o primeiro numero: ");
        Number1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        Number2 = ler.nextInt();
    if (Number1 > Number2) {
        MaiorNumero = Number1;
        System.out.println("O maior numero é: " + MaiorNumero);
        }if (Number1 < Number2) {
        MaiorNumero = Number2;
            System.out.println("O maior numero é: " + MaiorNumero);
        }
    }
}
