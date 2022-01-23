
//Toda vez que escolher a opção saque em qualquer uma das contas sera debidato um valor de 350.00 da contanta mas respeitando as regras de negocio da conta e o saldo.

//Se escolher a opção deposito na conta corrente e na conta poupança sera depositado um valor 250.00 reias, não tem limete para quantidade de deposito.

//Conta salario o limite e de 2 saque e nao pode fazer deposito.

import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DesignConta menu = new DesignConta();

        //Construtor da conta corrente.
        ContaCorrente contCorrente = new ContaCorrente(11111, 41, 100, 500);

        //Construtor da conta poupaça.
        ContaPoupanca contPoupanca = new ContaPoupanca(33333, 41, 500, 10,  0.05);

        //Construtor da conta salario.
        ContaSalario contSalario = new ContaSalario(55555, 41, 1500, 2);

        menu.menUm();
        menu.crienteAdm = input.nextInt();
        if(menu.crienteAdm == 1){
            menu.primeiroMenu();
        }
        else if(menu.crienteAdm == 2){
            menu.menuAdm();
        }

        //Mostra o primeiro menu.
        //menu.primeiroMenu();

        //Capitura a opção digitada.

        menu.opcao = input.nextInt();
        for (;;) {

            //Inico do switch 1.
            switch (menu.opcao) {
                //Esse case entra na conta corrente.
                case 1:
                    System.out.println("=============================");
                    System.out.println("       CONTA CORRENTE");
                    System.out.println(contCorrente);
                    System.out.println("-----------------------------");

                    menu.segundoMenu(); //Mostra o menu sado, sacar e etc.

                    menu.sairDoAplicativo();//Captura a opção escolhida.

                    //Esse switch entra nas funcões conta corrente
                    switch (menu.varOpcoes) {
                        //Entra na fução saldo da conta corrente
                        case 1:
                            System.out.println("======================");
                            System.out.println("SALDO CONTA CORRENTE");
                            System.out.println("Saldo: " + contCorrente.getSaldo());
                            //System.out.println("----------------------");
                            menu.chamaMenuPricipal();
                            break;

                        //Entre na fução saque da conta corrente
                        case 2:
                            System.out.println("======================");
                            System.out.println("SAQUE CONTA CORRENTE");
                            System.out.println("----------------------");
                            System.out.println("Qual o valor do saque?");
                            double saque = input.nextDouble();
                            contCorrente.sacar(saque);
                            System.out.println("----------------------");
                            //menu.chamaMenuPricipal();
                            break;

                        //Entra na funcao de deposito da conta corrente.
                        case 3:
                            System.out.println("=======================");
                            System.out.println("DEPOSITO CONTA CORRENTE");
                            System.out.println("-----------------------");
                            System.out.println("Qual o valor do deposito?");
                            double deposito = input.nextDouble();
                            contCorrente.depositar(deposito);
                            //System.out.println("-----------------------");
                            menu.chamaMenuPricipal();
                            break;

                        //Entra na funcao de transferencia da conta corrente.
                        case 4:
                            System.out.println("===================================");
                            System.out.println("TRANSFERENCIA ELETRONICA");
                            System.out.println("-----------------------------------");
                            System.out.println("Escolha a conta para transfereicna.");
                            System.out.println("----------------------");
                            System.out.println("Conta corrente     [1]");
                            System.out.println("Conta poupaça      [2]");
                            System.out.println("Menu principal     [5]");
                            System.out.println("Sair do apricativo [9]");
                            //fazer logica para passar o conteudo do inpute escolha pa o de ocoes
                            System.out.println("-----------------");
                            System.out.println("Digite uma opção:");
                            System.out.print("-> ");
                            menu.escolha = input.nextInt();

                            if(menu.escolha == 1){
                                System.out.println("Contata corrente");
                                menu.chamaMenuPricipal();

                            }
                            else if(menu.escolha == 2){
                                System.out.println("Conta poupança");
                                menu.chamaMenuPricipal();
                            }
                            else{
                                menu.chamaMenuPricipal();
                            }
                            break;

                    }//Fim do switch da conta corrente
                    break; //Do switch 1.


                //Case do switch 1.
                //Esse case entra na conta poupaça.
                case 2:
                    System.out.println("=============================");
                    System.out.println("        CONTA POUPAÇA");
                    System.out.println(contPoupanca);
                    System.out.println("-----------------------------");

                    menu.segundoMenu(); //Mostra o menu sado, sacar e etc.

                    //Captura a opção escolhida.
                    menu.sairDoAplicativo();

                    //Esse switch entra nas fuções da conta poupaça
                    switch (menu.varOpcoes) {
                        //Entra na fução saldo da conta poupaça
                        case 1:
                            System.out.println("==============================");
                            System.out.println("SALDO CONTA POUPANÇA");
                            System.out.println("------------------------------");
                            System.out.println("Dia do aniversario da conta: "+contPoupanca.getDiaAniversario());
                            System.out.printf("Saldo: %.2f\n", contPoupanca.getSaldo());
                            System.out.println("------------------------------");
                            menu.chamaMenuPricipal();
                            break;

                        //Entre na fução saque da conta poupaça
                        case 2:
                            System.out.println("==============================");
                            System.out.println("SAQUE CONTA POUPANÇA");
                            System.out.println("------------------------------");
                            System.out.println("Qual o valor do saque?");
                            double saque = input.nextDouble();
                            contPoupanca.sacar(saque);
                            //System.out.println("------------------------------");
                            menu.chamaMenuPricipal();
                            break;

                        //Entra na funcao de deposito da conta poupaça.
                        case 3:
                            System.out.println("=======================");
                            System.out.println("DEPOSITO CONTA POUPANÇA");
                            System.out.println("-----------------------");
                            System.out.println("Qual o valor do deposito?");
                            double deposito = input.nextDouble();
                            contPoupanca.depositar(deposito);
                            System.out.println("-----------------------");
                            menu.chamaMenuPricipal();
                            break;
                    }//Fim do switch da conta poupaça
                    break; //Do switch 1


                //Case do switch 1.
                //Entra na conta salario
                case 3:
                    System.out.println("=============================");
                    System.out.println("         CONTA SALARIO");
                    System.out.println(contSalario);
                    System.out.println("-----------------------------");

                    menu.segundoMenu(); //Mostra o menu sado, sacar e etc.

                    //Captura a opção escolhida.
                    menu.sairDoAplicativo();

                    //Esse switch entra nas funcões conta salario
                    switch (menu.varOpcoes) {
                        //Entra na fução saldo da conta salario
                        case 1:
                            System.out.println("======================");
                            System.out.println("SALDO DA CONTA SALARIO");
                            System.out.println("Saldo: " + contSalario.getSaldo());
                            System.out.println("----------------------");
                            menu.chamaMenuPricipal();
                            break;

                        //Entre na fução saque da conta salario
                        case 2:
                            System.out.println("======================");
                            System.out.println("SAQUE CONTA SALARIO");
                            System.out.println("----------------------");
                            System.out.println("Qual o valor do saque?");
                            double saque = input.nextDouble();
                            //System.out.println("Valor do saque:");
                            contSalario.sacar(saque);
                            System.out.println("----------------------");
                            menu.chamaMenuPricipal();
                            break;

                        //Entra na funcao de deposito da conta salario.
                        case 3:
                            System.out.println("======================");
                            System.out.println("DEPOSITO CONTA SALARIO");
                            System.out.println("----------------------");
                            contSalario.depositar();
                            System.out.println("----------------------");
                            menu.chamaMenuPricipal();

                            break;
                    }
                    //Fim do switch 4.

                    break; //Do switch 1.

                //Case do switch 1.
                case 8: //Cai no menu pricipal que é o primeiro menu.
                    menu.primeiroMenu(); //Menu principal.
                    menu.opcao = input.nextInt();
                    break; //Do suitch 1.

            }// Fim do switch 1.

            if(menu.opcao == 9)break; //Finaliza o loop do for.
        }
        System.out.println("------------------------------");
        System.out.println("==============================");
        System.out.println("Obrigado por usar nosso banco!");
        System.out.println("==============================");
    }
}
