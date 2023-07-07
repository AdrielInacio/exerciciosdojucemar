import java.util.*;
public class Atividade_8 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double n1;

        System.out.println("digite o numero:");
        n1 = ler.nextDouble();

        System.out.println(" O valor recebeu um desconto de 10%: " + ((n1*10)/100));
    }
}
