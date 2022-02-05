import java.util.Scanner;

public class MenuAdm {

    Administrador administrador = new Administrador();

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
                System.out.println("Cancelar         [4]");
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
            System.out.println("Cancelar         [4]");
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
        System.out.print("Digite seu nome: ");
        String nome = cliente.nextLine();

        do {
            System.out.println("-------------------------");
            System.out.println("Escolho o tipo de conta:");
            System.out.println("Conta Corrente   [1]");
            System.out.println("Conta Poupança   [2]");
            System.out.println("Conta Salário    [3]");
            System.out.println("--------------------");
            System.out.println("Cancelar         [4]");
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

    public void saldoDasConstas(Administrador administrador){
        int opc = 0;
        Scanner cliente = new Scanner(System.in);
        System.out.println("Digite seu nome para ver o saldo: ");
        System.out.print("->");
        String nome = cliente.nextLine();

        do {
            System.out.println("-------------------------");
            System.out.println("Escolho o tipo de conta:");
            System.out.println("Conta Corrente   [1]");
            System.out.println("Conta Poupança   [2]");
            System.out.println("Conta Salário    [3]");
            System.out.println("--------------------");
            System.out.println("Cancelar         [4]");
            System.out.println("--------------------");
            System.out.println("Digite uma opção:");
            System.out.print("-> ");

            opc = cliente.nextInt();

            switch (opc) {
                case 1:
                    administrador.saldoContaCorrente(nome);
                    break;

                case 2:
                    administrador.saldoContaPoupanca(nome);
                    break;

                case 3:
                    administrador.saldoContaSalario(nome);
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        }while (opc < 4);

    }

    public void entraNoADM() {
        int opc = 0;

        Scanner clit = new Scanner(System.in);

        do {
            System.out.println("=============================");
            System.out.println("         BANKTORAMA");
            System.out.println("-----------------------------");
            System.out.println("-------------------------");
            System.out.println("Criar conta           [1]");
            System.out.println("Saldo total do banco  [2]");
            System.out.println("Contas cadastradas    [3]");
            System.out.println("-------------------------");
            System.out.println("Sair do acesso de Adm.[4]");
            System.out.println("-------------------------");
            System.out.println("Digite uma opção:");
            System.out.print("-> ");

            opc = clit.nextInt();

            switch (opc) {
                case 1:
                    criarConta(administrador);
                    break;
                case 2:
                    administrador.saldoTotal();
                    break;

                case 3:
                    administrador.contasCadastradas();
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        } while (opc < 4);
    }

    public void entraNaConta() {
        int opc = 0;
        Scanner clit = new Scanner(System.in);
        System.out.println("Digite o nome do titular \nPara ter acessar a conta:");
        System.out.print("->");
        String cliente = clit.nextLine();
        System.out.println("=================================");
        for (Banco conta : administrador.contas) {
            if (conta.getNomeCliente().equals(cliente)) {
                System.out.println("Ola, " + conta.getNomeCliente() + " é bom te ver de novo!");
                do {
                    System.out.println("--------------------------");
                    System.out.println("Para saldo         [1]");
                    System.out.println("Para saque         [2]");
                    System.out.println("Para deposito      [3]");
                    System.out.println("Para transferencia [4]");
                    System.out.println("--------------------------");
                    System.out.println("Sair do acesso cliente [8]");
                    System.out.println("--------------------------");
                    System.out.println("Digite uma opção:");
                    System.out.print("-> ");

                    opc = clit.nextInt();

                    switch (opc) {
                        case 1:
                            saldoDasConstas(administrador);
                            break;
                        case 2:
                            sacarContas(administrador);
                            break;

                        case 3:
                            depositarConta(administrador);
                            break;

                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }

                }while (opc < 4);
            }
        }
    }


}





