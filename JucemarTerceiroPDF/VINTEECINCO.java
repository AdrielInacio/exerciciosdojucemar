import java.util.*;
public class VINTEECINCO {
    public static void main(String[] args) {
        //VARIAVEIS//
        double dolar,calculo;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite a quantidade em dolar: ");
        dolar = ler.nextDouble();
        calculo = (dolar * 4.847);
        System.out.println("A quantia em dolar é " + dolar + ".Convertido para real fica" + calculo);

    }
}
