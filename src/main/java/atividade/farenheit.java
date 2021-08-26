// 4) Um programa que receba graus farenheit e converta em graus celsius (lembrando que a fórmula para conversão é °C = (°F − 32) ÷ 1, 8

package atividade;

import java.util.Scanner;

public class farenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos graus em farenheit deseja converter: ");
        double fah = sc.nextDouble();

        double celcius = (fah - 32) / 1.8;

        System.out.println(fah + "°F em celcius equivalem a " + celcius + "°C");
    }
}
