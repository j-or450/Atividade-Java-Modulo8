import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {

    protected ArrayList<Banco> contas = new ArrayList<>();

    public void criarContaAdm(String nome){
        Banco banco = new Banco();
        banco.setNomeCliente(nome);
        contas.add(banco);
    }

    public void criarContaCorrente(String nome ){
        for(Banco conta : this.contas){
            if(conta.getNomeCliente().equals(nome)){
                int tipoDeConta = 1;
                conta.setTipoDeConta(tipoDeConta);
                String stringConta = "Corrente";
                conta.setStringConta(stringConta);
                Scanner novaConta = new Scanner(System.in);
                System.out.println("Numero da Conta:");
                System.out.print("-> ");
                int numeroConta = novaConta.nextInt();
                conta.criarContaCorrente(numeroConta, 45,600, 500);
                System.out.println("======================");
                System.out.println("Conta corrente criada:");
                System.out.println("----------------------");
            }
        }
    }

    public void criarContaPoupanca(String nome){
        for(Banco conta : this.contas){
            if(conta.getNomeCliente().equals(nome)){
                Scanner novaConta = new Scanner(System.in);
                System.out.println("Numero da Conta:");
                System.out.print("-> ");
                int tipoDeConta = 2;
                conta.setTipoDeConta(tipoDeConta);
                String stringConta = "Poupança";
                conta.setStringConta(stringConta);
                int numeroConta = novaConta.nextInt();
                conta.criarContaPoupanca(numeroConta,45,1000, 25, 0.05);
                System.out.println("======================");
                System.out.println("Conta poupança criada:");
                System.out.println("----------------------");
            }
        }
    }

    public void criarContaSalario(String nome){
        for(Banco conta : this.contas){
            if(conta.getNomeCliente().equals(nome)){
                int tipoDeConta = 3;
                conta.setTipoDeConta(tipoDeConta);
                String stringConta = "Salario";
                conta.setStringConta(stringConta);
                Scanner novaConta = new Scanner(System.in);
                System.out.println("Numero da Conta:");
                System.out.print("-> ");
                int numeroConta = novaConta.nextInt();
                conta.criarContaSalario(numeroConta,45,1500,2);
                System.out.println("=====================");
                System.out.println("Conta salario criada:");
                System.out.println("---------------------");
            }
        }
    }

    public void contasCadastradas() {
        System.out.println("========================");
        System.out.println("***CONTAS CADASTRADAS***");
        System.out.println("------------------------");
        for (Banco banco : this.contas) {
            System.out.println("Criente:.." + banco.getNomeCliente());
            System.out.println("Conta:...." + banco.getStringConta());
            System.out.println("Numero:..." + banco.numeroDeConta());
            System.out.println("Saldo:...." + banco.saldo());
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
                System.out.println("===========================");
                System.out.println(conta.getNomeCliente() + ", seu saldo: R$" + conta.saldo());
                System.out.println("---------------------------");

            }
        }
    }

    public void saldoContaPoupanca(String nome){
        for(Banco conta : this.contas){
            if(conta.getNomeCliente().equals(nome)){
                System.out.println("===========================");
                System.out.println(conta.getNomeCliente() + ", seu saldo: R$" + conta.saldo());
                System.out.println("---------------------------");

            }
        }
    }

    public void saldoContaSalario(String nome){
        for(Banco conta : this.contas){
            if(conta.getNomeCliente().equals(nome)){
                System.out.println("===========================");
                System.out.println(conta.getNomeCliente() + ", seu saldo: R$" + conta.saldo());
                System.out.println("---------------------------");
            }
        }
    }

    public void sacarPoupanca(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                System.out.println(conta.getNomeCliente() + " - " + conta.ContaPoupanca.getSaldo());
                Scanner cliente = new Scanner(System.in);
                System.out.println("Digite o valor do saque:");
                System.out.print("->");
                double valor = cliente.nextDouble();
                conta.sacarContaPoupanca(valor);
                System.out.println("======================");
                System.out.println("Saque de: " + valor + " reais\nrealizado com sucesso.");
                System.out.println("----------------------");
            }
        }
    }

    public void sacarCorrente(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.println("Digite o valor do saque:");
                System.out.print("->");
                double valor = cliente.nextDouble();
                conta.sacarContaCorrente(valor);
                System.out.println("======================");
                System.out.println("Saque de: " + valor + " reais\nrealizado com sucesso.");
                System.out.println("----------------------");
            }
        }
    }

    public void sacarSalario(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.println("Digite o valor do saque:");
                System.out.print("->");
                double valor = cliente.nextDouble();
                conta.sacarContaSalario(valor);
                System.out.println("======================");
                System.out.println("Saque de: " + valor + " reais\nrealizado com sucesso.");
                System.out.println("----------------------");
            }
        }
    }

    public void depositarPoupanca(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.println("Digite o valor do deposito:");
                System.out.print("->");
                double valor = cliente.nextDouble();
                conta.depositarContaPoupanca(valor);
                System.out.println("==========================");
                System.out.println("****DADOS DO DEPOSITO*****");
                System.out.println("--------------------------");
                System.out.println("Deposito para:...." + conta.getNomeCliente());
                System.out.println("Tipo de conta:....Poupança");
                System.out.println("Numero da conta:.." + conta.numeroDeConta());
                System.out.println("Valor do Dep.:...." + valor);
            }
        }
    }

    public void depositarCorrente(String nome) {
        for (Banco conta : this.contas) {
            if (conta.getNomeCliente().equals(nome)) {
                Scanner cliente = new Scanner(System.in);
                System.out.println("Dig. o valor do deposito:");
                System.out.print("->");
               double valor = cliente.nextDouble();
                conta.depositarContaCorrente(valor);
                System.out.println("==========================");
                System.out.println("****DADOS DO DEPOSITO*****");
                System.out.println("--------------------------");
                System.out.println("Deposito para:...." + conta.getNomeCliente());
                System.out.println("Tipo de conta:....Corrente");
                System.out.println("Numero da conta:.." + conta.numeroDeConta());
                System.out.println("Valor do Dep.:...." + valor);
            }
        }
    }

    public void transferir(Integer tipoDeConta, Double valor, String nome, String destino) {
        for (Banco conta : contas) {
            if (conta.getNomeCliente().equals(nome)) {
                conta.transferir(valor, "sacar", destino, nome);
            }

            if (conta.getNomeCliente().equals(destino)) {
                conta.transferir(valor, "depositar", destino, nome);
                System.out.println("------------------------------");
                System.out.println("Transferencia:....R$" + valor);
                System.out.println("Para conta:......." + destino);
                System.out.println("Tipo de conta:...." + conta.getStringConta());
                System.out.println("Numero da conta:.." + conta.numeroDeConta());
            }
        }
    }

}
