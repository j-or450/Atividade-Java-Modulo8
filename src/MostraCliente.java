import java.util.*;
import java.util.stream.Collectors;

public class MostraCliente {
    protected Cliente Cliente;

    List<Cliente> client = new ArrayList<>();

    public void comprar() {
        Scanner comp = new Scanner(System.in);
        System.out.println("###############################");
        System.out.println("*******COMPRAS NO DEBITO*******");
        System.out.println("Digite seu nome para comprar");
        System.out.print("->");
        String nome = comp.nextLine();
        System.out.println("Digite o valor do compra");
        System.out.print("->");
        Double valorDaCompra = comp.nextDouble();

        Cliente cliente = new Cliente(nome, valorDaCompra);

        client.add(cliente);
    }

    public void mostrar() {
        System.out.println("###############################");
        System.out.println("Listas de todas as compras");
        System.out.println("...............................");
        for(Cliente cli : this.client){
            System.out.println("Nome do Comprador:.." + cli.getNome());
            System.out.println("Valor da compra:...." + cli.getValorDaCompra());
            System.out.println();
        }
    }

    public void menorValor(){
        Double menor = 0.0;
        String nome = "";

        for (Cliente t : client) {
            if (t.getValorDaCompra() < menor || menor == 0.0) {
                menor = t.getValorDaCompra();
                nome = t.getNome();
            }
        }
        System.out.println("################################");
        System.out.println("O cliente que fez a menor compra");
        System.out.println("Nome do cliente:" + nome);
        System.out.println("Valor da compra:R$" + menor);
        System.out.println("--------------------------------");
        }
    public void maiorValor() {
        Double maior = 0.0;
        String nome = "";
        for (Cliente t : client) {
            if (t.getValorDaCompra() > maior) {
                maior = t.getValorDaCompra();
                nome = t.getNome();
            }
        }
        System.out.println("################################");
        System.out.println("O cliente que fez a maior compra");
        System.out.println("Nome do cliente:" + nome);
        System.out.println("Valor da compra:R$" + maior);
        System.out.println("--------------------------------");
    }

    public void mediaCompras(){
        Double media = client.stream()
                .collect(Collectors.averagingDouble(n -> n.getValorDaCompra().intValue()));
        System.out.println("################################");
        System.out.println("A media de todas as compras");
        System.out.println("--------------------------------");
        System.out.println(String.format( "Valor medio das compras:R$" + "%.2f" + media));
        System.out.println("--------------------------------");
    }

    public void clienteComprado(){
        int opc = 0;
        Scanner comp = new Scanner(System.in);
        do {
            System.out.println("################################");
            System.out.println("Fazer uma mova compra........[1]");
            System.out.println("Total de compras.............[2]");
            System.out.println("Mostrar a menor compra.......[3]");
            System.out.println("Mostrar a maior compra.......[4]");
            System.out.println("Mostrar media das compras....[5]");
            System.out.println("................................");
            System.out.println("Para sair digite.............[6]");
            System.out.print("->");

            opc = comp.nextInt();

            switch (opc){
                case 1 :
                    comprar();
                    break;

                case 2 :
                    mostrar();
                    break;

                case 3 :
                    menorValor();
                    break;
                case 4:
                    maiorValor();
                    break;
                case 5:
                    mediaCompras();
                    break;
            }
        }while(opc < 6);
    }

}
