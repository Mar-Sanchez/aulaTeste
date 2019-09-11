package com.unama;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();
        if(idade<=10){
            System.out.println("bebezao");
        }if (idade>10 && idade<=17) {
            System.out.println("Quase jovem");
        }
        if (idade>17){
            System.out.println("velho");



        }
    }
}
