import java.util.*;
public class DEZESSEIS {
    public static void main(String[] args) {
        //VARIAVEIS//
        double valor_p,desc,calculo;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite o valor do produto: ");
        valor_p = ler.nextDouble();
        System.out.println("Digite a quantia de desconto: ");
        desc = ler.nextDouble();
        calculo = valor_p * desc/100;
        System.out.println("Seu produto recebeu um desconto de " + desc + " ficando: " + calculo);
    }
}
