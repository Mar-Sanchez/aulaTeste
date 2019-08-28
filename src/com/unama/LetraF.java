package com.unama;

import java.util.Scanner;

public class LetraF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco;
        double total;
        int quantidade;
        System.out.println(" Quantos produtos você deseja?: ");
        quantidade = sc.nextInt();
        System.out.println(" Qual é valor do produto?: " );
        preco = sc.nextDouble();
        total = quantidade * preco;
        System.out.println("Total a pagar ... " + total);






    }
}