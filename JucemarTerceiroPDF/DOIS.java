import java.util.*;
public class DOIS {
    public static void main(String[] args) {
        //VARIAVEIS//
        int n1;
        double area;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite o raio de um circulo: ");
        n1 = ler.nextInt();
        area = 3.14 * (n1*n1);
        System.out.println("A área do circulo é: " + area );

    }
}
