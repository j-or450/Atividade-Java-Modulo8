import java.util.Scanner;

public class MenuAdm {

    public void criarConta(Administrador administrador) {
        Scanner cliente = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Abrir uma nova conta");
        System.out.println("-------------------------");
        System.out.println("Nome do Cliente:");
        System.out.print("-> ");
        String nome = cliente.nextLine();
        administrador.criarContaAdm(nome);

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
                    administrador.criarContaPoupanca(nome);
                    break;
                case 3:
                    administrador.criarContaSalario(nome);
                    break;
            }
        }
        while (opcao != 4);
    }

    public void sacarContas(Administrador administrador) {
        int opc = 0;
        Scanner cliente = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = cliente.nextLine();

        do {
            System.out.println("-------------------------");
            System.out.println("Escolho o tipo de conta:");
            System.out.println("Conta Corrente   [1]");
            System.out.println("Conta Poupança   [2]");
            System.out.println("Conta Salário    [3]");
            System.out.println("--------------------");
            System.out.println("Digite uma opção:");
            System.out.print("-> ");

            opc = cliente.nextInt();

            switch (opc) {
                case 1:
                    administrador.sacarCorrente(nome);
                    break;
                case 2:
                    administrador.sacarPoupanca(nome);
                    break;
                case 3:
                    administrador.sacarSalario(nome);
                    break;

                default:
                    System.out.println("Opção invalida!");
            }
        } while (opc < 4);
    }

    public void depositarConta(Administrador administrador) {
        int opc = 0;
        Scanner cliente = new Scanner(System.in);
        System.out.print("Digite seu nome ##: ");
        String nome = cliente.nextLine();

        do {
            System.out.println("-------------------------");
            System.out.println("Escolho o tipo de conta:");
            System.out.println("Conta Corrente   [1]");
            System.out.println("Conta Poupança   [2]");
            System.out.println("Conta Salário    [3]");
            System.out.println("--------------------");
            System.out.println("Digite uma opção:");
            System.out.print("-> ");


            opc = cliente.nextInt();

            switch (opc) {
                case 1:
                    administrador.depositarPoupanca(nome);
                    break;
                case 2:
                    administrador.depositarCorrente(nome);
                    break;
                case 3:
                    administrador.depositarSalario(nome);
                    break;
            }

        } while (opc < 4);
    }

    public void saldoDasConstas(){
        int opc = 0;
        Administrador administrador = new Administrador();
        Scanner cliente = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = cliente.nextLine();

        do {
            System.out.println("-------------------------");
            System.out.println("Escolho o tipo de conta:");
            System.out.println("Conta Corrente   [1]");
            System.out.println("Conta Poupança   [2]");
            System.out.println("Conta Salário    [3]");
            System.out.println("--------------------");
            System.out.println("Digite uma opção:");
            System.out.print("-> ");

            opc = cliente.nextInt();

            switch (opc) {
                case 1:
                    administrador.saldoContaCorrente();
                    break;
                case 2:
                    administrador.saldoContaPoupanca();
                    break;
                case 3:
                    administrador.saldoContaSalario();
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        }while (opc < 4);

    }




}





