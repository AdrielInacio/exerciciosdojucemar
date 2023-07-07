//importar
import java.util.*;
public class Atividade1
{
    public static void main(String[] args)
    {
        //variaveis
        Scanner ler = new Scanner(System.in);
        double parte1, parte2, x1, x2, y1, y2;
        //lógica
        System.out.println("Digite o valor do X1: ");
        x1 = ler.nextDouble();
        System.out.println("Digite o valor do X2: ");
        x2 = ler.nextDouble();
        System.out.println("Digite o valor do y1: ");
        y1 = ler.nextDouble();
        System.out.println("Digite o valor do y2: ");
        y2 = ler.nextDouble();
        parte1 = Math.pow(x1-x2, 2);
        parte2 = Math.pow(y1-y2, 2);
        System.out.println("A distancia entre os dois pontos é igual a: " + Math.sqrt(parte1+parte2));
    }
}
