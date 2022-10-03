import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, media;
        System.out.println("Digite um número: ");
        n1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        n2 = sc.nextInt();
        System.out.println("Digite um número: ");
        n3 = sc.nextInt();
        System.out.println("Digite um número: ");
        n4 = sc.nextInt();
        sc.close();
        media= (n1 + n2 + n3 + n4)/4;
        System.out.println("A média das notas é " + media);
    }
}
