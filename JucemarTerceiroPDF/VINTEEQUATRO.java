import java.util.*;
public class VINTEEQUATRO {
    public static void main(String[] args) {
        //VARIAVEIS//
        int i, n;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite um numero: ");
        n = ler.nextInt();
        for (i = 0; i < 11; i++) {
            System.out.println(n + "x" + i + "=" + n * i);


        }
    }
}