/**
 *
 * @author ueder
 */

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Solicitando e lendo cada informação da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = terminal.nextInt();
        terminal.nextLine(); 

        System.out.print("Por favor, digite o número da Agência com o dígito. Exemplo 123-4: ");
        String agencia = terminal.nextLine();

        System.out.print("Por favor, digite seu nome completo: ");
        String nomeCliente = terminal.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = terminal.nextDouble();
        terminal.nextLine();

        // Criando objeto ContaBancaria
        ContaBancaria conta = new ContaBancaria(numero, agencia, nomeCliente, saldo);

        // Exibindo a mensagem final
        exibirMensagemFinal(conta);

        // Fechar o scanner para liberar recursos
        terminal.close();
    }

    private static void exibirMensagemFinal(ContaBancaria conta) {
        System.out.println("\nOlá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");
    } 
}
