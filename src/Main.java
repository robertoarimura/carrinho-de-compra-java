import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        String produto;
        double valor;
        int quantidade;
        char moeda = '$';
        double total;

        System.out.print("Qual produto você vai comprar?: ");
        produto = scanner.nextLine();
        System.out.print("Qual o valor de cada: ");
        valor = scanner.nextDouble();
        System.out.print("Quantos você comprou?: ");
        quantidade = scanner.nextInt();
        total = valor * quantidade;
        System.out.println("O total da sua compra foi: "+ moeda + total);


        scanner.close();
    }
}
