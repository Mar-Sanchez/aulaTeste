package com.unama;

import java.util.Scanner;

    public class Nadador {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println( " Informe a idade do Nadador: ");
            int nadador = sc.nextInt();
            if(nadador < 5)
                    System.out.println("O pirralho nao pode participar, idade abaixo da minima permitida.");
            if(nadador > 7 && nadador <= 10)
                System.out.println("O atleta tem " + nadador + " anos,\nele esta na categoria INFANTIL ");
            if(nadador > 13 && nadador <= 17)
                System.out.println("O atleta tem " + nadador + " anos,\nele esta na categoria JUVENIL ");
            if(nadador > 17)
                System.out.println("O atleta tem " + nadador + " anos,\nele esta na categoria VELHO");

        }
    }


