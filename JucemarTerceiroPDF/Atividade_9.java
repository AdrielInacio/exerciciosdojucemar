import java.util.*;
public class Atividade_9 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double valor;
        int litro;
        System.out.println("quantos litros foi abastecido :");
        litro = ler.nextInt();
        System.out.println(" E quantos custa o litro :");
        valor = ler.nextDouble();
        System.out.println(" Você andou com " + litro + "L" + ", que deu o valor de:" + (valor*litro));

    }
}
