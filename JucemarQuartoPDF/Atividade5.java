import java.util.*;
public class Atividade5
{
    public static void main(String[] args)
    {
        //variavel
        Scanner ler = new Scanner(System.in);
        double adjacente, hipotenusa, oposto;
        //lógica
        System.out.println("---------Achar-o-Adjacente-------");
        System.out.println("Digite a hipotenusa: ");
        hipotenusa = ler.nextDouble();
        System.out.println("Digite o Oposto: ");
        oposto = ler.nextDouble();
        System.out.println("Adjacente é: " + Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(oposto, 2)));
        System.out.println("---------Achar-o-Oposto---------");
        System.out.println("Digite a Hipotenusa: ");
        hipotenusa = ler.nextDouble();
        System.out.println("Digite o Adjacente: ");
        adjacente = ler.nextDouble();
        System.out.println("Oposto é: " + Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(adjacente, 2)));
    }
}
