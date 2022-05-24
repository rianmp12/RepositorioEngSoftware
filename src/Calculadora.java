import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite outro número:");
        int number2 = Integer.parseInt(sc.nextLine());
        System.out.println("A soma entre os 2 números é: " +number1+number2);
    }




}
