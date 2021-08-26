// 2) Com base no ano de nascimento e o ano atual digitados, calcule a idade de uma pessoa

package atividade;

import java.util.Scanner;

public class media {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, n4;

        System.out.print("Digite a nota 1: ");
        n1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        n2 = sc.nextDouble();

        System.out.print("Digite a nota 3: ");
        n3 = sc.nextDouble();

        System.out.print("Digite a nota 4: ");
        n4 = sc.nextDouble();

        double res = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Sua média final é: " + res);

    }
}
