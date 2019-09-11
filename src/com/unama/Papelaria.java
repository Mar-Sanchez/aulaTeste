package com.unama;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class Papelaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Informe a quantidade de copia: ");
        int copias = sc.nextInt();
        Double totalpago;

        if( copias <= 100) {
            totalpago = copias * 0.25;
        } else{
            totalpago = copias * 0.20;
        }
            System.out.println( " O valor pago é R$ :" + totalpago);


    }
}