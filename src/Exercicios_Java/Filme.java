package Exercicios_Java;

import java.util.Scanner;

public class Filme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço anterior do cinema: ");
        double a = sc.nextDouble();
        System.out.print("Digite o preço atual: ");
        double b = sc.nextDouble();
        double res = ((b-a)*100)/a;
        System.out.printf("O ingresso teve um aumento de %.2f%%\n",res);

        sc.close();
    }
}
