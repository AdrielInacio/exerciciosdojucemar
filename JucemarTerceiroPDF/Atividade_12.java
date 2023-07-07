import java.util.*;
public class Atividade_12 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
            double n1, cont;
            System.out.println("digite o valor do produto :");
            n1 = ler.nextDouble();
            cont = (n1*15)/100;
            System.out.println(" O pagamento recebeu um desconto de 15%: " + (cont+n1));
        }
    }
