// 6) Faça um algoritmo que calcule o IMC de uma pessoa, considerando IMC = PESO / ( ALTURA * ALTURA )

package atividade;

import java.util.Scanner;

public class imc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o seu peso? ");
        double peso = sc.nextDouble();

        System.out.print("Qual sua altura em cm? ");
        double altura = sc.nextDouble();

        double imc = (altura * altura) / peso;

        System.out.println("Seu IMC é de " + imc);
    }
}


