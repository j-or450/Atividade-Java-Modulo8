public abstract class Conta {
     private int numero;
     private int agencia;
     protected double saldo;
    protected double comprarDebito;

    public double getComprarDebito() {
        return comprarDebito;
    }

    public void setComprarDebito(double comprarDebito) {
        this.comprarDebito = comprarDebito;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public abstract double getSaldo();

    public void depositar(double valor){
        saldo += valor;
    }

    public Conta(int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }
}
