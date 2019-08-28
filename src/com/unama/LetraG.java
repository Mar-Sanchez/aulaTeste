package com.unama;

import javafx.beans.binding.DoubleExpression;

import java.util.Scanner;

public class LetraG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largura;
        double comprimento;
        double area;
        System.out.println(" Vamos laaaa, vamos calcular a area da sala!!");
        System.out.println(" Quantos metros tem a largura?: ");
        largura = sc.nextDouble();
        System.out.println(" Quantos metros tem a comprimento?: ");
        comprimento = sc.nextDouble();
        area = comprimento * largura;
        System.out.println(" Sua linda sala tem em m² " + area);





    }
}