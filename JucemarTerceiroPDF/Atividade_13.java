import java.util.*;
public class Atividade_13 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int quant;
        double valor;

        System.out.println("Quantos produtos você comprou:");
        quant = ler.nextInt();
        System.out.println("E quantos custa os Produtos");
        valor = ler.nextDouble();
        System.out.println(" Sendo assim o valor total dos produtos foi:" + (quant*valor));

    }
}
