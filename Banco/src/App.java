import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Variáveis
        String nome = "Carlos Alberto";
        String tipoConta = "Corrente";
        double saldo = 2000.00;
        String asterisco = "*************************";
        int opcao = 0;
        Scanner leitor = new Scanner(System.in);
        double valorOperacao = 0;
        // -----------------------------------------------
        //Menu
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Saque
                3 - Depositar
                4 - Sair
                """;
        //---------------------------------------------------


        //Aplicação
        System.out.println(asterisco);
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("\n" + asterisco);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();
            if(opcao == 1) {
                System.out.println("O saldo atual é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja sacar ");
                valorOperacao = leitor.nextDouble();
                if (valorOperacao > saldo) {
                    System.out.println("Não há saldo suficiente para sacar esse valor");
                } else {
                    saldo -= valorOperacao;
                System.out.println("Seu saldo atual é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja depositar ");
                valorOperacao = leitor.nextDouble();
                saldo += valorOperacao;
                System.out.println("Seu saldo atual é: " + saldo);
            } else if (opcao >= 5) {
                System.out.println("Operação invalida, tente novamente");
            }
        }
    }
}
