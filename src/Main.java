import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuAdm menuAdm = new MenuAdm();
        MostraCliente mostraCliente = new MostraCliente();
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("#############################");
            System.out.println("         BANKTORAMA");
            System.out.println("*****************************");
            System.out.println("-----------------------------");
            System.out.println("Escolha o tipo de acesso:  ");
            System.out.println("Fazer compras           [1]");
            System.out.println("Acessar a conta         [2]");
            System.out.println("Acessoa Administrador   [3]");
            System.out.println("---------------------------");
            System.out.println("Sair do aplicativo      [4]");
            System.out.println("---------------------------");
            System.out.println("Digite uma opção:");
            System.out.print("-> ");

            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    mostraCliente.clienteComprado();
                    break;

                case 2:
                    menuAdm.entraNaConta();
                    break;

                case 3:
                    menuAdm.entraNoADM();
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        }while(opcao < 4);

        System.out.println("------------------------------");
        System.out.println("==============================");
        System.out.println("Obrigado por usar nosso banco!");
        System.out.println("==============================");
    }
}
