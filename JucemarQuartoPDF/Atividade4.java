//importar
import java.util.*;
public class Atividade4
{
    public static void main(String[] args)
    {
        //variaveis
        Scanner ler = new Scanner(System.in);
        double n1, n2, n31, n32, n41, n42, n51, n52;
        //lógica
        System.out.println("------------Letra-A-----------");
        System.out.println("Digite o raio: ");
        n1 = ler.nextDouble();
        System.out.println(3.14*Math.pow(n1, 2));
        System.out.println("------------Letra-B-----------");
        System.out.println("Digite o raio: ");
        n2 = ler.nextDouble();
        System.out.println(2*3.14*n2);
        System.out.println("------------Letra-C-----------");
        System.out.println("Digite o Cateto1: ");
        n31 = ler.nextDouble();
        System.out.println("Digite o Cateto2");
        n32 = ler.nextDouble();
        System.out.println(Math.sqrt(Math.pow(n31, 2) + Math.pow(n32, 2)));
        System.out.println("-----------Letra-D------------");
        System.out.println("Digite a base: ");
        n41 = ler.nextDouble();
        System.out.println("Digite a altura: ");
        n42 = ler.nextDouble();
        System.out.println(2*(n41 + n42));
        System.out.println("-----------Letra-E-----------");
        System.out.println("Digite a base: ");
        n51 = ler.nextDouble();
        System.out.println("Digite a altura: ");
        n52 = ler.nextDouble();
        System.out.println((n51*n52)/2);
    }
}
