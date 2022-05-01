/*
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar
os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias
foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos.
Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia
 utilizada e a quantidade de cobaias utilizadas em cada experimento.
 */
package Exercicios_Java;

import java.util.Scanner;

public class Experiencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, quantia, cont = 1, somaC = 0, somaR = 0, somaS = 0;
        double total, perC, perR, perS;
        String tipo;

        System.out.print("Quantos testes foram realizados: ");
        n = sc.nextInt();//Informar o número de experimentos realizados

        while (cont <= n) {//enquanto o numero de experimentos e menor que o contador, armazena as informações da qtd de animal utilizado e o tipo
            System.out.print("Qual a quantidade de animais utilizados no teste " + cont + ": ");
            quantia = sc.nextInt();
            System.out.print("Qual o tipo do animal: (C) Coelho, (S) Sapo, (R) Rato: ");
            tipo = sc.next();
            if (tipo.equalsIgnoreCase("C")) {
                somaC += quantia;
            } else if (tipo.equalsIgnoreCase("R")) {
                somaR += quantia;
            } else if (tipo.equalsIgnoreCase("S")) {
                somaS += quantia;
            }
            cont = cont + 1;
        }
        total = somaC + somaS + somaR;//Soma o valor de todas as variaveis para saber qtos animais foram utilizados
        perC = somaC * 100 / total;
        perR = somaR * 100 / total;
        perS = somaS * 100 / total;

        System.out.printf("Total: %.0f cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", somaC);
        System.out.printf("Total de ratos: %d\n", somaR);
        System.out.printf("Total de sapos: %d\n", somaS);
        System.out.printf("Percentual de coelhos: %.2f %%\n", perC);
        System.out.printf("Percentual de ratos: %.2f %%\n", perR);
        System.out.printf("Percentual de sapos: %.2f %%\n", perS);

        sc.close();
    }
}
