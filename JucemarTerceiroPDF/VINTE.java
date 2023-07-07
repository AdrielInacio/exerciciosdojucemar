import java.util.*;
public class VINTE {
    public static void main(String[] args) {
        //VARIAVEIS//
        int altura;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite o lado de um quadrado: ");
        altura = ler.nextInt();
        System.out.println("A área desse quadrado é: " + altura*altura);
    }
}