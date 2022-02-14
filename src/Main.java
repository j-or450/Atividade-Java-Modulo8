import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuAdm menuAdm = new MenuAdm();
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("=============================");
            System.out.println("         BANKTORAMA");
            System.out.println("-----------------------------");
            System.out.println("---------------------------");
            System.out.println("Escolha o tipo de acesso:  ");
            System.out.println("Cliente do Banco        [1]");
            System.out.println("Administrador do Banco  [2]");
            System.out.println("---------------------------");
            System.out.println("Sair do aplicativo      [3]");
            System.out.println("---------------------------");
            System.out.println("Digite uma opção:");
            System.out.print("-> ");

            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    menuAdm.entraNaConta();
                    break;

                case 2:
                    menuAdm.entraNoADM();
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        }while(opcao < 3);

        System.out.println("------------------------------");
        System.out.println("==============================");
        System.out.println("Obrigado por usar nosso banco!");
        System.out.println("==============================");
    }
}
