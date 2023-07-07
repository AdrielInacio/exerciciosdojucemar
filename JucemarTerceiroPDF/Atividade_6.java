import java.util.*;
public class Atividade_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dias, hora, minutos, segundos;

        System.out.println("Digite o numero de dias:");
        dias = ler.nextInt();
        System.out.println("Digite as horas:");
        hora = ler.nextInt();
        System.out.println("Digite os minutos:");
        minutos = ler.nextInt();
        System.out.println("Digite os segundos:");
        segundos = ler.nextInt();
        System.out.println("Dias " +dias +" " + hora + ":" + minutos + ":" + segundos);

    }

}
