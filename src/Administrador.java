import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {

    protected ArrayList<Banco> contas = new ArrayList<>();

    public void criarConta(String nome){
        Banco banco = new Banco();
        banco.setNomeCliente(nome);
        contas.add(banco);
        System.out.println(contas.size());
    }

    public void criarContaCorrente(String nome){
        for(Banco conta : this.contas){
            if(conta.getNomeCliente().equals(nome)){
                Scanner novaConta = new Scanner(System.in);
                System.out.println("Dig. o numero da Conta:");
                System.out.print("-> ");
                int numeroConta = novaConta.nextInt();
                conta.criarContaCorrente(numeroConta, 45, 600, 500);
                System.out.println("===========================");
                System.out.println("Conta corrente criada:");
                System.out.println("---------------------------");
                System.out.println("Nome:......" + conta.getNomeCliente());
                System.out.println("Ag.:......." + conta.ContaCorrente.getAgencia());
                System.out.println("Conta:....." + numeroConta);
                System.out.println("Saldo:....." + conta.ContaCorrente.getSaldo());
                System.out.println("Ch.Esp.:..." + conta.ContaCorrente.getChequeEspecial());
                System.out.println("----------------------");
                System.out.println("Menu principal     [4]");
                System.out.println("Digite uma opção:");
                System.out.print("-> ");
            }
        }
    }
}
