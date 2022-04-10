/*
Números em ponto flutuante podem ser bastante extensos para mostrar.
Nesses casos, é conveniente usar a notação científica.
Você deve escrever um programa que, dado um número em ponto flutuante, mostre este número na notação científica:
sempre mostre o sinal da mantissa; sempre mostre 4 casas decimais na mantissa;
use o caractere 'E' para separar a mantissa do expoente; sempre mostre o sinal do expoente;
e mostre o expoente com pelo menos 2 dígitos.
 */
package Exercicios_Java;

import java.util.Scanner;

public class Notacao_Cientifica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] aux = new String[entrada.length()];//cria um vetor com a quantidade de caracteres da entrada
        aux = entrada.split("");//separa cada caractere para uma posição no vetor
        double x;
//vai validar em qual situação a posição [0] se encontra
//%.4E determinar que a notação começa após a 4 casa
        if (aux[0].equals("+")) {
            entrada = entrada.substring(1);
            x = Double.parseDouble(entrada);
            System.out.printf("+%.4E\n", x);
        } else if (aux[0].equals("-")) {
            entrada = entrada.substring(1);
            x = Double.parseDouble(entrada);
            System.out.printf("-%4.E\n", x);
        } else {
            x = Double.parseDouble(entrada);
            if (x > 0) {
                System.out.printf("+%.4E\n", x);
            } else if (x < 0) {
                System.out.printf("-%.4E\n", x);
            } else {
                System.out.printf("+%.4E\n", x);
            }
            sc.close();
        }
    }
}