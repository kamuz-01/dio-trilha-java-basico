package org.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia = "Fraiburgo";
        String nomeCliente;
        float saldo;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, digite o número da agência: ");
        numero = entrada.nextInt();
        
        // Consumir a nova linha pendente
        entrada.nextLine();
        
        System.out.print("Por favor, digite o nome do titular: ");
        nomeCliente = entrada.nextLine();
        
        System.out.print("Por favor, digite o saldo inicial com o qual deseja abrir sua conta: ");
        saldo = entrada.nextFloat();
        
        System.out.println("");
        System.out.print("Olá, " + nomeCliente + ".\nObrigado por criar uma conta em nosso "
                + "banco.\nSua agência é: " + agencia + ".\nNúmero de conta: " + numero + ".\nSeu "
                + "saldo inicial é de " + "R$" + saldo + " e já está disponível para saque.");
        entrada.close();
    }
}
