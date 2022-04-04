import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cliente{
    private String nome;
    private Double valorDaCompra;

    MostraCliente mCliente = new MostraCliente();

    public Cliente(String nome, Double valorDaCompra) {
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(Double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }





    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Cliente cliente : mCliente.client) {
            sb.append("Cliente");
            sb.append(getNome());
            sb.append("Valor da compra");
            sb.append(getValorDaCompra());
        }
        return sb.toString();
    }


        //sb.append(sdf.format(moment) + "\n");

        //for(OrderItem item : items) {
            //sb.append(item + "\n");


        //sb.append(String.format("%.2f", total()));


}