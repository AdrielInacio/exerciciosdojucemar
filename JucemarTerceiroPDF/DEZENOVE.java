import java.util.*;
public class DEZENOVE {
    public static void main(String[] args) {
        //VARIAVEIS//
        int id,calculo;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite sua idade: ");
        id = ler.nextInt();
        calculo = (id*12)*30;
        System.out.println("A quantidade aproximada de dias que você viveu foi: " + calculo);
    }
}
