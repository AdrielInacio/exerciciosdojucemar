import java.util.*;
public class DEZOITO {
    public static void main(String[] args) {
        //VARIAVEIS//
        int Id, ano,calculo;
        Scanner ler = new Scanner(System.in);
        //LOGICA//
        System.out.println("Digite sua idade: ");
        Id = ler.nextInt();
        System.out.println("Digite em que ano estamos: ");
        ano = ler.nextInt();
        calculo = ano - Id;
        System.out.println("Sua idade é " + Id + " e você nasceu no ano de " + calculo);
    }
}