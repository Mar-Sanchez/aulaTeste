package com.unama;

import java.util.Scanner;

public class LetraA {

    public static void main(String[] args) {
	    int idade;
	    String nome;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Informe o seu Nome: ");
		nome = sc.nextLine();
		System.out.print("informe a sua idade: ");
		idade = sc.nextInt();
		System.out.println("Seu nome é " + nome + " e sua idade é " + idade );




    }
}
