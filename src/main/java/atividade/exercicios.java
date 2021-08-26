package atividade;

import java.util.Scanner;

public class exercicios {
    public static void main(String[] args){
        System.out.println("""
                ======== Exercícios de Java 25/08/2021 ========
                1) Que receba 4 notas de provas, calcule e exiba a média
                2) Com base no ano de nascimento e o ano atual digitados, calcule a idade de uma pessoa
                3) Com base na cotação do dólar digitado pelo usuário,  e na quantidade de dólares, calcule e exiba o valor em reais.
                4) Um programa que receba graus farenheit e converta em graus celsius (lembrando que a fórmula para conversão é °C = (°F − 32) ÷ 1, 8
                5) Um programa que peça ao usuário para digitar um valor da venda, o valor do imposto, e o valor do desconto.
                O programa deverá calcular o valor final da venda considerando a fórmula: valor final = valor da venda + valor do imposto - valor do desconto
                """);
        op();
    }

    public static void op(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja acessar qual exercício? ");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> idade();
            case 2 -> media();
            case 3 -> dolar();
            case 4 -> farenheit();
            case 5 -> venda();
            default -> {
                System.out.println("ERRO: Exercício inexistente");
                op();
            }
        }
    }

    public static void idade(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Em que ano estamos? ");
        int ano = sc.nextInt();

        System.out.print("Em que ano você nasceu? ");
        int nasc = sc.nextInt();

        int idade = ano - nasc;
        System.out.println("Você tem " + idade + " anos");

        voltar();
    }

    public static void media(){
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

        voltar();
    }

    public static void dolar(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double dolar = sc.nextDouble();

        System.out.print("Deseja converter quantos dólares para reais? ");
        double wallet = sc.nextDouble();

        double reais = wallet * dolar;

        System.out.println("A conversão de $" + wallet + " em reais é R$" + reais);

        voltar();
    }

    public static void farenheit(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos graus em farenheit deseja converter: ");
        double fah = sc.nextDouble();

        double celcius = (fah - 32) / 1.8;

        System.out.println(fah + "°F em celcius equivalem a " + celcius + "°C");

        voltar();
    }

    public static void venda(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da venda: ");
        double valor = sc.nextDouble();

        System.out.print("Valor do imposto: ");
        double imposto = sc.nextDouble();

        System.out.print("Valor do desconto: ");
        double desconto = sc.nextDouble();

        valor = (valor + imposto) - desconto;
        System.out.print("O valor final da venda fica em R$" + valor);

        voltar();
    }

    public static void voltar(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja retornar ao menu de seleção de exercícios?");
        String confirma = sc.next();

        switch (confirma) {
            case "sim":
            case "Sim":
            case "s":
                op(); break;
            case "Não":
            case "não":
            case "n":
                break;
            default: System.out.println("Digite sim ou não.");
        }
    }
}
