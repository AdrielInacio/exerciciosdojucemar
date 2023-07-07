import java.util.*;
public class atividade_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner((System.in));
        double hora, salario;
        System.out.println("Quantas horas você trabalha por dia ?");
        hora = ler.nextDouble();
        System.out.println(" E Quantos você ganha por hora? ");
        salario = ler.nextDouble();

        System.out.println(" você ganha :" + salario * hora);
    }
}