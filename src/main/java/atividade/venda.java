// 5) um programa que peça ao usuário para digitar um valor da venda, o valor do imposto, e o valor do desconto.
// O programa deverá calcular o valor final da venda considerando a fórmula: valor final = valor da venda + valor do imposto - valor do desconto

package atividade;

import java.util.Scanner;

public class venda {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da venda: ");
        double valor = sc.nextDouble();

        System.out.print("Valor do imposto: ");
        double imposto = sc.nextDouble();

        System.out.print("Valor do desconto: ");
        double desconto = sc.nextDouble();

        valor = valor + imposto - desconto;
        System.out.print("O valor final da venda fica em R$" + valor);

    }
}
