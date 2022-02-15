import java.util.Scanner;

public class MenuAdm {

    Administrador administrador = new Administrador();

    public void criarConta(Administrador administrador) {
        Scanner cliente = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=========================");
        System.out.println("Abrir uma nova conta");
        System.out.println("-------------------------");
        System.out.println("Nome do Cliente:");
        System.out.print("-> ");

        String nome = cliente.nextLine();
        administrador.criarContaAdm(nome);

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

    public void sacarContas(Administrador administrador, String nome) {
        for (Banco conta : administrador.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                int tipoDeConta = conta.getTipoDeConta();
                switch (tipoDeConta) {
                    case 1:
                        administrador.sacarCorrente(nome);
                        break;
                    case 2:
                        administrador.sacarPoupanca(nome);
                        break;
                    case 3:
                        administrador.sacarSalario(nome);
                        break;
                }
            }
        }
    }

    public void depositarConta(Administrador administrador, String nome) {
        for (Banco conta : administrador.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                int tipoDeConta = conta.getTipoDeConta();
                switch (tipoDeConta) {
                    case 1:
                        administrador.depositarCorrente(nome);

                        break;
                    case 2:
                        administrador.depositarPoupanca(nome);
                        break;
                }
            }
        }
    }

    public void saldoDasConstas(Administrador administrador, String nome){
        for (Banco conta : administrador.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                int tipoDeConta = conta.getTipoDeConta();
                switch (tipoDeConta) {
                    case 1:
                        administrador.saldoContaCorrente(nome);
                        break;

                    case 2:
                        administrador.saldoContaPoupanca(nome);
                        break;

                    case 3:
                        administrador.saldoContaSalario(nome);
                        break;
                }
            }
        }
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
            }
        } while (opc < 4);
    }

    public void entraNaConta() {
        int opc = 0;
        Scanner clit = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Dig. o nome do titular \nPara acessar a conta:");
        System.out.print("->");
        String cliente = clit.nextLine();
        System.out.println("===============================");
        for (Banco conta : administrador.contas) {
            if (conta.getNomeCliente().equals(cliente)) {
                String stringConta = conta.getStringConta();
                int tipoDeConta = conta.getTipoDeConta();

                System.out.println("Ola, " + conta.getNomeCliente() + " é bom te ver de novo!");
                System.out.println("Conta: " + stringConta + " | " + "Numero: " + conta.numeroDeConta());

                do {
                    System.out.println("--------------------------");
                    System.out.println("Para saldo         [1]");
                    System.out.println("Para saque         [2]");
                    System.out.println("Para deposito      [3]");
                    System.out.println("Para transferencia [4]");
                    System.out.println("--------------------------");
                    System.out.println("Sair do acesso cliente [5]");
                    System.out.println("--------------------------");
                    System.out.println("Digite uma opção:");
                    System.out.print("-> ");

                    opc = clit.nextInt();

                    switch (opc) {
                        case 1:
                            saldoDasConstas(administrador, conta.getNomeCliente());
                            break;
                        case 2:
                            sacarContas(administrador, conta.getNomeCliente());
                            break;

                        case 3:
                            depositarConta(administrador, conta.getNomeCliente());
                            break;

                        case 4:
                            transferencia(administrador, conta.getNomeCliente());
                            break;
                    }

                }while (opc < 5);
            }
        }
    }

    public void transferencia(Administrador administrador, String nome) {
        Scanner cliente = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Dados da conta de destino:");
        System.out.println("-----------------------");
        System.out.println("Digite o nome da conta:");
        System.out.print("->");
        String destino = cliente.nextLine();
        System.out.println("Dig. o valor da transferencia:");
        System.out.print("->");
        Double valor = cliente.nextDouble();
        administrador.transferir(valor, nome, destino);
    }
}





