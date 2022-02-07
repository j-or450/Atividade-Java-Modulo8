import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {

    protected ArrayList<Banco> contas = new ArrayList<>();

    public void criarContaAdm(String nome){
        Banco banco = new Banco();
        banco.setNomeCliente(nome);
        contas.add(banco);
    }

    public void criarContaCorrente(String nome){
        for(Banco conta : this.contas){
            if(conta.getNomeCliente().equals(nome)){
                Scanner novaConta = new Scanner(System.in);
                System.out.println("Numero da Conta:");
                System.out.print("-> ");
                int numeroConta = novaConta.nextInt();
                conta.criarContaCorrente(numeroConta, 45, 600, 500);
                System.out.println("======================");
                System.out.println("Conta corrente criada:");
                System.out.println("----------------------");
                System.out.println("Menu principal     [4]");
                System.out.println("----------------------");
                System.out.println("Digite uma opção:");
                System.out.print("-> ");
            }
        }
    }

    public void criarContaPoupanca(String nome){
        for(Banco conta : this.contas){
            if(conta.getNomeCliente().equals(nome)){
                Scanner novaConta = new Scanner(System.in);
                System.out.println("Numero da Conta:");
                System.out.print("-> ");
                int numeroConta = novaConta.nextInt();
                conta.criarContaPoupanca(numeroConta, 45,1000, 25, 0.05);
                System.out.println("======================");
                System.out.println("Conta poupança criada:");
                System.out.println("----------------------");
                System.out.println("Menu principal     [4]");
                System.out.println("----------------------");
                System.out.println("Digite uma opção:");
                System.out.print("-> ");
            }
        }
    }

    public void criarContaSalario(String nome){
        for(Banco conta : this.contas){
            if(conta.getNomeCliente().equals(nome)){
                Scanner novaConta = new Scanner(System.in);
                System.out.println("Numero da Conta:");
                System.out.print("-> ");
                int numeroConta = novaConta.nextInt();
                conta.criarContaSalario(numeroConta, 45,1500,2);
                System.out.println("=====================");
                System.out.println("Conta salario criada:");
                System.out.println("---------------------");
                System.out.println("Menu principal    [4]");
                System.out.println("---------------------");
                System.out.println("Digite uma opção:");
                System.out.print("-> ");
            }
        }
    }

    public void contasCadastradas() {
        System.out.println("========================");
        System.out.println("  Contas cadastradas");
        System.out.println("------------------------");
        for (Banco banco : this.contas) {
            System.out.println("Criente:..." + banco.getNomeCliente() + "\n" + "Numero:...." + banco.numeroDeConta() + "\n" + "Saldo:....." + banco.saldo());
            System.out.println();
        }
    }

    public void saldoTotal(){
        double acumula = 0;
        System.out.println("=======================");
        System.out.println("Saldo total do banco:");
        for(Banco banco : this.contas){
            acumula += banco.saldo();
        }
        System.out.println("R$" + acumula);
        System.out.println("-----------------------");
    }

    public void saldoContaCorrente(String nome){
        for(Banco conta : this.contas){
            if(conta.getNomeCliente().equals(nome)){
                System.out.println("Titular:..." + conta.getNomeCliente());
                System.out.println("Saldo:....." + conta.saldo());
            }
        }
    }

    public void saldoContaPoupanca(String nome){
        for(Banco conta : this.contas){
            if(conta.getNomeCliente().equals(nome)){
                System.out.println("Titular:..." + conta.getNomeCliente());
                System.out.println("Saldo:....." + conta.saldo());
            }
        }
    }

    public void saldoContaSalario(String nome){
        for(Banco conta : this.contas){
            if(conta.getNomeCliente().equals(nome)){
                System.out.println("Titular:..." + conta.getNomeCliente());
                System.out.println("Saldo:....." + conta.saldo());
            }
        }
    }

    public void sacarPoupanca(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                System.out.println(conta.getNomeCliente() + " - " + conta.ContaPoupanca.getSaldo());
                Scanner cliente = new Scanner(System.in);
                System.out.print("Digite o valor do saque:");
                System.out.println("->");
                Double valor = cliente.nextDouble();
                conta.sacarContaPoupanca(valor);
            }
        }
    }

    public void sacarCorrente(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.print("Digite o valor do saque:");
                System.out.println("->");
                Double valor = cliente.nextDouble();
                conta.sacarContaCorrente(valor);
            }
        }
    }

    public void sacarSalario(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.print("Digite o valor do saque:");
                System.out.println("->");
                Double valor = cliente.nextDouble();
                conta.sacarContaSalario(valor);
            }
        }
    }

    public void depositarPoupanca(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.println("Digite o valor do deposito:");
                System.out.print("->");
                Double valor = cliente.nextDouble();
                conta.depositarContaPoupanca(valor);
            }
        }
    }

    public void depositarCorrente(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.println("Digite o valor do deposito:");
                System.out.print("->");
                Double valor = cliente.nextDouble();
                conta.depositarContaCorrente(valor);
            }
        }
    }

    public void transferir(Integer tipoDeConta, Integer tipoDeContaDestino, Double valor, String nome, String destino) {
        for (Banco conta : contas) {
            if (conta.getNomeCliente().equals(nome)) {
                conta.transferir(valor, tipoDeConta, "sacar");
            }

            if (conta.getNomeCliente().equals(destino)) {
                conta.transferir(valor, tipoDeContaDestino, "depositar");
            }
        }
    }

}
