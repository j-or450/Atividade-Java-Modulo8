import java.util.Scanner;

public class Banco {
    protected String NomeCliente;
    protected ContaPoupanca ContaPoupanca;
    protected ContaCorrente ContaCorrente;
    protected ContaSalario  ContaSalario;
    protected Conta transferir;

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public void criarContaCorrente(int numero, int agencia, double saldo, double chequeEspecial){
        this.ContaCorrente = new ContaCorrente(numero,agencia,saldo,chequeEspecial);
    }

    public void criarContaPoupanca(int numero, int agencia, double saldo, int diaAniversario, double taxaDeJuros){
        this.ContaPoupanca=new ContaPoupanca(numero, agencia, saldo, diaAniversario, taxaDeJuros);
    }

    public void criarContaSalario(int numero, int agencia, double saldo, int limite){
        this.ContaSalario=new ContaSalario(numero, agencia, saldo, limite);
    }

    public Double saldo(){
        Double saldo = 0.0;

        if(ContaPoupanca != null ){
            saldo += ContaPoupanca.getSaldo();
        }

        if(ContaCorrente != null ){
            saldo += ContaCorrente.getSaldo();
        }

        if(ContaSalario != null ){
            saldo += ContaSalario.getSaldo();
        }

        return saldo;
    }

    public int numeroDeConta(){
        int numero = 0;

        if(ContaPoupanca != null ){
            numero += ContaPoupanca.getNumero();

        }

        if(ContaCorrente != null ){
            numero += ContaCorrente.getNumero();

        }

        if(ContaSalario != null ){
            numero += ContaSalario.getNumero();

        }
        return numero;
    }

}
