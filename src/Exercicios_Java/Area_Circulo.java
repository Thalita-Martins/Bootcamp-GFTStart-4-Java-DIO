package Exercicios_Java;

import java.util.Scanner;

public class Area_Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double area, raio, pi = (3.14159);
        System.out.print("Qual o raio do círculo : ");
        raio = sc.nextDouble();
        //A área do circulo é calculado nde pi x raio elevado ao quadrado( A = ⫪.r²)
        raio = Math.pow(raio,2.0);//Eleva o raio ao quadrado
        area = pi*raio;//faz o valor de pi x o valor de raio

        System.out.printf("Área é igual =%.4f\n", area);

        sc.close();
    }
}
