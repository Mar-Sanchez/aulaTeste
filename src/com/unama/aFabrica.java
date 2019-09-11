package com.unama;

import java.util.Scanner;

public class aFabrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pecasProduzidas, pecasDefeituosas;
        System.out.println(" Informe a quantidade de peças produzidas: ");
        pecasProduzidas = sc.nextInt();
        System.out.println(" Informe a quantidade de peças defeituosas: ");
        pecasDefeituosas = sc.nextInt();
        if (pecasDefeituosas > (pecasProduzidas * 0.1)){
            System.out.println("Maquina precisa de uma puta revisao");
        }else{
            System.out.println("Maquina NAO PRECISA DE REVISAO FDP!!!!!");
        }
    }
}
