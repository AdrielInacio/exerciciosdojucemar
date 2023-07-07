import java.util.*;
public class VINTEETRES {
    public static void main(String[] args) {
        //VARIAVEIS//
        int N, P;
        double R;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite um numero: ");
        N = ler.nextInt();
        System.out.println("Digite a potência: ");
        P = ler.nextInt();
        R = Math.pow(N, P);
        System.out.println("O " + N + " elevado a " + P + " é " + R);

        int n;
        double r;
        System.out.println("----------------------------------------------------------");
        System.out.println("Digite a raiz: ");
        n = ler.nextInt();
        r = Math.sqrt(n);
        System.out.println("A raiz quadrada de " + n + " é " + r);
    }
}

