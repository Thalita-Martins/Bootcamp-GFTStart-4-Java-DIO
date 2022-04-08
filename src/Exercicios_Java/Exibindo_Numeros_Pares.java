package Exercicios_Java;

import java.util.Scanner;

public class Exibindo_Numeros_Pares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entrada;

        System.out.println("Digite um numero : ");
        entrada = sc.nextInt();

        for(int i = 1; i <= entrada; i++){

            if(i % 2 == 0){

                System.out.println(i + " ");

            }
        }

    }
}
