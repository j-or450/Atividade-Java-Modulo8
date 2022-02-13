
public class Banco {
    protected String stringConta;
    protected int tipoDeConta;
    protected String NomeCliente;
    protected ContaPoupanca ContaPoupanca;
    protected ContaCorrente ContaCorrente;
    protected ContaSalario  ContaSalario;

    public String getStringConta() {
        return stringConta;
    }

    public void setStringConta(String stringConta) {
        this.stringConta = stringConta;
    }

    public int getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(int tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public void criarContaCorrente(int numero, int agencia, double saldo, double chequeEspecial){
        this.ContaCorrente = new ContaCorrente(numero, agencia,saldo,chequeEspecial);
    }

    public void criarContaPoupanca(int numero, int agencia, double saldo, int diaAniversario, double taxaDeJuros){
        this.ContaPoupanca = new ContaPoupanca(numero, agencia, saldo, diaAniversario, taxaDeJuros);
    }

    public void criarContaSalario(int numero, int agencia, double saldo, int limite){
        this.ContaSalario = new ContaSalario(numero, agencia, saldo, limite);
    }

    public void sacarContaPoupanca(double valor){
        this.ContaPoupanca.sacar(valor);
    }

    public void sacarContaCorrente(double valor){
        this.ContaCorrente.sacar(valor);
    }

    public void sacarContaSalario(double valor){
        this.ContaSalario.sacar(valor);
    }

    public void depositarContaPoupanca(double valor){
        this.ContaPoupanca.depositar(valor);
    }

    public void depositarContaCorrente(double valor){
        this.ContaCorrente.depositar(valor);
    }

    public void transferir( Double valor, Integer tipoDeConta ,String operacao) {
        String sacar = "sacar";
        String depositar = "depositar";


        if (sacar.equals(operacao)) {
            switch (tipoDeConta) {
                case 1:
                    this.ContaCorrente.sacar(valor);
                    break;

                case 2:
                    this.ContaPoupanca.sacar(valor);
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }

        if (depositar.equals(operacao)) {
            switch (tipoDeConta) {
                case 1:
                    this.ContaCorrente.depositar(valor);
                    break;

                case 2:
                    this.ContaPoupanca.depositar(valor);
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }
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
