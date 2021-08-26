// 3) Com base na cotação do dólar digitado pelo usuário,  e na quantidade de dólares, calcule e exiba o valor em reais.

package atividade;

import java.util.Scanner;

public class dolar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double dolar = sc.nextDouble();

        System.out.print("Deseja converter quantos dólares para reais? ");
        double wallet = sc.nextDouble();

        double reais = wallet * dolar;

        System.out.println("A conversão de $" + wallet + " em reais é R$" + reais);
    }
}
