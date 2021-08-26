// 1) Que receba 4 notas de provas, calcule e exiba a média

package atividade;

import java.util.Scanner;

public class idade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Em que ano estamos? ");
        int ano = sc.nextInt();

        System.out.print("Quando você nasceu? ");
        int nasc = sc.nextInt();

        int idade = ano - nasc;
        System.out.println("Você tem " + idade + "anos");

    }
}
