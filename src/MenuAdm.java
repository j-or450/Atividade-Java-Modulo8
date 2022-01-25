import java.util.Scanner;

public class MenuAdm {

    Administrador administrador = new Administrador();
    Banco banco = new Banco();

    public void criarConta(Administrador administrador) {
        Scanner cliente = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Abrir um nova conta");
        System.out.println("-------------------------");
        System.out.println("Dig. o nome do Cliente:");
        System.out.print("-> ");
        String nome = cliente.nextLine();
        administrador.criarConta(nome);

        int opcao = 0;

        boolean n = true;
        do {

            if (n != false) {
                System.out.println("-------------------------");
                System.out.println("Escolho o tipo de conta:");
                System.out.println("Conta Corrente   [1]");
                System.out.println("Conta Poupança   [2]");
                System.out.println("Conta Salário    [3]");
                System.out.println("--------------------");
                System.out.println("Digite uma opção:");
                System.out.print("-> ");
                n = false;
            }
                opcao = cliente.nextInt();

            switch (opcao) {
                case 1:
                    administrador.criarContaCorrente(nome);
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
        while (opcao != 4);
    }
}



