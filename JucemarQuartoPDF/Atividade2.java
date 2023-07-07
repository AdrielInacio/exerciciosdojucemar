//importar
import java.util.*;
public class Atividade2
{
    public static void main(String[] args)
    {
        //variaveis
        Scanner ler = new Scanner(System.in);
        double n1, n2, n3, n51, n52, n61, n62, n7, n8;
        int n4;
        //lógica
        System.out.println("----------Letra-A----------");
        System.out.println("Digite um número: ");
        n1 = ler.nextDouble();
        System.out.println(Math.ceil(n1));
        System.out.println("----------Letra-B----------");
        System.out.println("Digite um número: ");
        n2 = ler.nextDouble();
        System.out.println(Math.floor(n2));
        System.out.println("----------Letra-C----------");
        System.out.println(Math.random());
        System.out.println("----------Letra-D----------");
        System.out.println("Digite um número: ");
        n4 = ler.nextInt();
        System.out.println(Math.abs(n4));
        System.out.println("----------Letra-E----------");
        System.out.println("Digite um número: ");
        n51 = ler.nextDouble();
        System.out.println("Digite um número: ");
        n52 = ler.nextDouble();
        System.out.println(Math.max(n51, n52));
        System.out.println("----------Letra-F----------");
        System.out.println("Digite um número: ");
        n61 = ler.nextDouble();
        System.out.println("Digite um número: ");
        n62 = ler.nextDouble();
        System.out.println(Math.min(n61, n62));
        System.out.println("----------Letra-G----------");
        System.out.println("Digite um número: ");
        n7 = ler.nextDouble();
        System.out.println(Math.asin(Math.toRadians(n7)));
        System.out.println("----------Letra-H----------");
        System.out.println("Digite um número: ");
        n8 = ler.nextDouble();
        System.out.println(Math.acos(Math.toRadians(n8)));
    }
}
