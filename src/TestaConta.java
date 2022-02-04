
import java.util.Scanner;

public class TestaConta {

    MenuAdm menuAdm = new MenuAdm();

    public void entraNaConta() {
        Banco banco = new Banco();
        int opc = 0;
        Administrador administrador = new Administrador();
        Scanner clit = new Scanner(System.in);
        System.out.println("Digite seu nome p/ acessar a conta:");
        System.out.println("->");
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
                            menuAdm.saldoDasConstas();
                            break;
                        case 2:
                            menuAdm.sacarContas(administrador);
                            break;

                        case 3:
                            menuAdm.depositarConta(administrador);
                            break;

                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }

                } while (opc < 4);
            }
        }
    }

    public void entraNoADM() {
        int opc = 0;
        Administrador administrador = new Administrador();
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
                    menuAdm.criarConta(administrador);
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



}

