import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCompleto = "Matehus Silva Pinto";
        double saldoCompleto = 1000.00;
        Scanner capturaDados = new Scanner(System.in);

        System.out.println(String.format("""
                *************************************
                Dados iniciais do cliente:
                
                Nome:               %s
                Tipo da conta:      Corrente
                Saldo inicial:      R$ %.2f
                *************************************
                """,nomeCompleto,saldoCompleto));

        int opcaoDesejada;

        do {
            System.out.println("""
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    0 - Sair
                    
                    Digite uma opção:
                    """);
            opcaoDesejada = capturaDados.nextInt();

            switch (opcaoDesejada){
                case 0:
                    System.out.println("Até breve");
                    break;
                case 1:
                    System.out.println(String.format("""
                            Saldo atual é de: R$ %.2f
                            
                            """, saldoCompleto));
                    break;
                case 2:
                    System.out.println("Insira o valor a ser recebido");
                    double valorRecebido = capturaDados.nextDouble();
                    saldoCompleto += valorRecebido;
                    System.out.println(String.format("""
                            Saldo atualizado: R$ %.2f
                            
                            """, saldoCompleto));
                    break;
                case 3:
                    System.out.println("Insira o valor a ser transferido");
                    double valorTransferido = capturaDados.nextDouble();
                        if (valorTransferido > saldoCompleto){
                            System.out.println(String.format("""
                                    Valor da sua transferência é maior que seu saldo
                                    Saldo atual: R$ %.2f
                                    """,saldoCompleto));
                        }else {
                            saldoCompleto -= valorTransferido;
                            System.out.println(String.format("""
                                    Transferencia realizada com sucesso
                                    Saldo atual: R$ %.2f
                                    
                                    """, saldoCompleto));
                        }
                    break;
                default:
                    System.out.println("""
                            Opção invalida
                            
                            """);
                    break;

            }

        }while(opcaoDesejada != 0);

    }
}