public class ContaCorrente extends Conta implements Imposto {
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, double saldo, double chequeEspecial) {
        super(numero, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() +
                "     Agencia: " + getAgencia();
    }

    @Override
    public double impostoT(){
        return this.chequeEspecial * 0.05;

    }

    public double getSaldo() {
        return this.chequeEspecial + this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        double disponivel = this.chequeEspecial + this.saldo;
        if (valor > disponivel) {
            System.out.println("Saldo insuficiente para saque.\nConfira seu saldo.");
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public void comprar(double comprarDebito) {
        double disponivel =  getSaldo();
        if(comprarDebito > disponivel) {
            System.out.println("Compra no debito negada.\nConfira seu saldo.");

        } else {
            this.saldo -= comprarDebito;

        }
    }
}
