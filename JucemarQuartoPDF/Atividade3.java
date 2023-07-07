//importar
import java.util.*;
public class Atividade3
{
    public static void main(String[] args)
    {
        //variaveis
        Scanner ler = new Scanner(System.in);
        double n1, n2, n3, n4, n5;
        //lógica
        System.out.println("-----------Letra-A-----------");
        System.out.println("Digite um número: ");
        n1 = ler.nextDouble();
        System.out.println(Math.atan(Math.toRadians(n1)));
        System.out.println("-----------Letra-B-----------");
        System.out.println("Digite um número: ");
        n2 = ler.nextDouble();
        System.out.println(Math.asin(n2));
        System.out.println("------------Letra-C----------");
        System.out.println("Digite um número: ");
        n3 = ler.nextDouble();
        System.out.println(Math.acos(n3));
        System.out.println("-----------Letra-D-----------");
        System.out.println("Digite um núemro: ");
        n4 = ler.nextDouble();
        System.out.println(Math.atan(n4));
        System.out.println("----------Letra-E-------------");
        System.out.println("Digite um número: ");
        n5 = ler.nextDouble();
        System.out.println(Math.log(n5));
    }
}
