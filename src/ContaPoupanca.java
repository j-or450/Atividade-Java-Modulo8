import java.util.Calendar;

public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, double saldo, int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() +
                "     Agencia: " + getAgencia();
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getSaldo() {
        Calendar diaAtual = Calendar.getInstance();
        if(diaAtual.get(Calendar.DAY_OF_MONTH) >= this.diaAniversario) {
            return this.saldo + this.saldo * taxaDeJuros;
        }
        else {
            return this.saldo;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        double disponivel = this.saldo;
        if(valor > disponivel) {
            System.out.println("Saldo insuficiente para saque.\nConfira seu saldo.");
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public void comprar(double comparDebito) {
        double disponivel =  getSaldo();
        if(comparDebito > disponivel) {
            System.out.println("Compra no debito negada.\nConfira seu saldo.");

        } else {
            this.saldo -= comparDebito;

        }
    }
}


