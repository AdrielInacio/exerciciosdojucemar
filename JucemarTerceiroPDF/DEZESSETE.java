import java.util.*;
public class DEZESSETE {
    public static void main(String[] args) {
         //VARIAVEIS//
           double valor,parcel;
            Scanner ler = new Scanner(System.in);
            //LOGICA//
        System.out.println("Digite o valor do produto: ");
        valor = ler.nextDouble();
        System.out.println("Digite a quantia de parcelas: ");
        parcel = ler.nextDouble();
        System.out.println("A quantia de parcelas desejadas foram " + parcel + " seu produto ficou " + parcel + " vezes de " + valor/parcel);
    }
}
