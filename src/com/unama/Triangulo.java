package com.unama;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        System.out.println("Digite 3 números por vez");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        if ((n1 <= n2 + n3) && (n2 <= n1 + n3) && (n3 <= n1 + n2)) {
            System.out.println("Este pode ser um triangulo");
            if ((n1 == n2) && (n2 == n3)){
                System.out.println("Triangulo equilátero");
            } else {
                if (((n1 == n2) & (n1 != n3) || ((n2 == n3) & (n2 != n1)) || ((n3 == n1)) & (n3 != n2))){
                    System.out.println("Este é um triângulo isóceles");
                } else {
                    System.out.println("Este é um triangulo escaleno");
                }
            }
        }       else{
                    System.out.println("Não pode ser um triangulo");}





    }
}