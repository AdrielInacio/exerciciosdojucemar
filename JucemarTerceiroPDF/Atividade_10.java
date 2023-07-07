import  java.util.*;
public class Atividade_10 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int dia;
        double valor;

        System.out.println("Quantos dias foi alugado o carro:");
        dia = ler.nextInt();
        System.out.println("E quantos custa a diaria:");
        valor = ler.nextDouble();
        System.out.println(" Sendo assim o custo do alugueu foi:" + (dia*valor));

    }
}
