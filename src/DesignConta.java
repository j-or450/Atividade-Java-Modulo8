import java.util.Scanner;

public class DesignConta {
    int opcao, varOpcoes, varSair, voltaMenuAnterior, escolha, crienteAdm;
    Scanner input = new Scanner(System.in);

    public void menuAdmPrimeiro() {
        System.out.println("=============================");
        System.out.println("         BANKTORAMA");
        System.out.println("-----------------------------");
        System.out.println("-------------------------");
        System.out.println("Login de Administrador:");
        System.out.println("Para continuar      [4]");
        System.out.println("Sair do aplicativo  [0]");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void menuAdmSegundo() {
        System.out.println("=============================");
        System.out.println("         BANKTORAMA");
        System.out.println("-----------------------------");
        System.out.println("-------------------------");

        System.out.println("Criar conta           [1]");
        System.out.println("Saldo total do banco  [2]");
        System.out.println("Contas cadastradas    [4]");
        System.out.println("-------------------------");
        System.out.println("Sair do acesso de Adm.[9]");
        System.out.println("-------------------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }


    public void menUm() {
        System.out.println("=============================");
        System.out.println("         BANKTORAMA");
        System.out.println("-----------------------------");
        System.out.println("---------------------------");
        System.out.println("Escolha o tipo de acesso:  ");
        System.out.println("Cliente do Banco        [1]");
        System.out.println("Administrador do Banco  [2]");
        System.out.println("---------------------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void primeiroMenu() {
        System.out.println("=============================");
        System.out.println("         BANKTORAMA");
        System.out.println("-----------------------------");
        System.out.println("----------------------");
        System.out.println("Escolha uma conta:");
        System.out.println("Conta corrente     [1]");
        System.out.println("Conta poupaça      [2]");
        System.out.println("Conta salario      [3]");
        System.out.println("----------------------");
        System.out.println("sair do acesso cliente [9]");
        System.out.println("----------------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void segundoMenu() {
        System.out.println("----------------------");
        System.out.println("Para saldo         [1]");
        System.out.println("Para saque         [2]");
        System.out.println("Para deposito      [3]");
        System.out.println("Para transferencia [4]");
        System.out.println("----------------------");
        System.out.println("Menu principal     [8]");
        System.out.println("Sair do acesso cliente [9]");
        System.out.println("----------------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    //É usado para sair do apicativo ou ir para o menu principal.
    public void sairDoAplicativo() {
        varOpcoes = input.nextInt();

        if(varOpcoes == 9) { //Sair do aplicativo
            opcao = varOpcoes;
        }else if(varOpcoes == 8){ //Retorna ao menu anterior
            opcao = varOpcoes;
        }
    }

    public void chamaMenuPricipal() {
        System.out.println("----------------------");
        System.out.println("Menu anterior      [7]");
        System.out.println("Menu principal     [8]");
        System.out.println("Sair do acesso cliente [9]");
        System.out.println("----------------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
        varSair = input.nextInt();
        //voltaMenuAnterior = varSair;
        if(varSair == 8){ //Vai para o menu pricipal.
            opcao = 8;
        }else if(varSair == 9){ //Sai do aplicativo.
            opcao = 9;
        }
    }
}
