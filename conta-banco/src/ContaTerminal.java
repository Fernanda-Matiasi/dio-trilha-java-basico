import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem vindo(a)! Vamos começar a acessar sua conta eletrônica!");

        System.out.println("Por favor, digite o número da sua Conta: ");
        int conta = scanne.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanne.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanne.nextDouble();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanne.next();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }

}
