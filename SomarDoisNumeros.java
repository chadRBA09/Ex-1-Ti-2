import java.util.Scanner;
public class SomarDoisNumeros 
{
    public static void main(String[] args) 
    {
        System.out.println("Digite o primeiro número: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        System.out.println(" Soma de : " + n1 + " + " + n2 + " é = a " + soma);
        sc.close();
    }

}
