package com.unama;

import java.util.Scanner;

public class Falta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int falta;
        double media;

        System.out.println("Qual a sua média?");
        media = sc.nextDouble();
        System.out.println("Quantas faltas você teve?");
        falta = sc.nextInt();

        if (falta > 40 && media >= 6) {
            System.out.println("Você foi REPROVADO seu otário");
        } else {
            if(falta <= 40 && media < 6){
                System.out.println("Você esta de recuperação seu trouxa");
            }
            else {System.out.println("Você foi APROVADO muleque!!!!!!!!!");
        }
    }
 }
}