package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ativo = true ;
        int numero ;
        String agencia ;
        String nomeDoCliente;
        Double saldo ;
        int escolha;
        while(ativo) {
            try {
                System.out.println("Insira o numero da Conta");
                 numero = scanner.nextInt();
                System.out.println("Insira o numero da Agencia");
                agencia =  scanner.next();
                System.out.println("Insira o nome do cliente");
                nomeDoCliente = scanner.next();
                System.out.println("Insira o Saldo");
                saldo = scanner.nextDouble();
                System.out.println("Ola "+nomeDoCliente+ ", obrigado por criar uma conta em nosso banco, sua agencia é "+agencia+" conta "+ numero
                        +" e seu saldo "+ saldo + " ja disponivel");
                System.out.println("Digite 1 para continuar");
                escolha = scanner.nextInt();
                ativo = escolha == 1 ? true : false ;
            } catch (InputMismatchException e) {
                System.out.println("Error :" + e.getMessage());
            } catch (Exception e){
                System.out.println("Error :" + e.getMessage());
            }finally {
                scanner.next();
            }
        }
    }
}