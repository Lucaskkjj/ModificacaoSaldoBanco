import java.util.Scanner;

public class BancoNP{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int Deposito = 1;
        int Saque = 2;
        int ExibirSaldo = 3;

        long ValorDeposito;
        long ValorSaque;
        long SaldoDeposito = 0;
        long SaldoSaque = 0;
        long Saldo = 0;




        System.out.println("\n Olá! Seja bem-vindo ao Banco NP.\n Favor insira o número da sua conta abaixo: \n");
        long Numero = scan.nextLong();
        scan.nextLine();
        System.out.println("Insira o nome do titular da conta abaixo: \n");
        String Titular = scan.nextLine();

        System.out.println("Olá " + Titular + "!" + "\n O que você deseja?");
        System.out.println("\n -Se deseja depositar, digite 1. \n -Se deseja sacar, digite 2. \n -Se deseja saber seu saldo, digite 3");


            int Acao = scan.nextInt();
            if (Acao == 1) {
                System.out.println("Quanto você quer depositar?");
                ValorDeposito = scan.nextLong();
                scan.nextLine();
                SaldoDeposito= ValorDeposito+Saldo;
                System.out.println("\n Você depositou:" + ValorDeposito + "\n Seu saldo agora é:" + SaldoDeposito);

            }

            if (Acao == 2) {
                System.out.println("\n Quanto você deseja sacar?");
                ValorSaque = scan.nextLong();
                scan.nextLine();
                Saldo = SaldoDeposito;
                SaldoSaque = Saldo-ValorSaque;
                System.out.println("Você sacou:" + ValorSaque + "\n Seu saldo é:" + SaldoSaque);
            }

            if (Acao == 3) {
                Saldo = SaldoDeposito;
                Saldo = SaldoSaque;
                System.out.println("\n Seu saldo é:" + Saldo);


            }

            if(Acao >= 4){
                System.out.println("Comando não identificado. Por favor tente novamente.");
            }


        }

    }



