package Exercicios_Java;

import java.util.Scanner;

public class Dama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2,op;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

            while (true) {
                System.out.print("Digite a coluna atual da dama :  ");
                x1 = sc.nextInt();
                System.out.print("Digite a linha atual da dama : ");
                y1 = sc.nextInt();
                System.out.print("Digite a coluna de destino : ");
                x2 = sc.nextInt();
                System.out.print("Digite a linha de destino : ");
                y2 = sc.nextInt();
                if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
                    break;//condição de parada
                }
                if (x1 == x2 && y1 == y2) {
                    System.out.println("Fique na mesma posição");//mesma posição
                    break;
                } else if (x1 == x2 || y1 == y2) {
                    System.out.println("Ande 1 casa");//mesma linha
                    break;
                } else if ((x2 - x1) == -(y2 - y1) || (x2 - x1) == -(y2 - y1) || -(x2 - x1) == (y2 - y1) || (x2 - x1) == (y2 - y1)) {
                    System.out.println("Ande 1 casa");
                    break;
                } else {
                    System.out.println("Ande 2 casas");
                    break;
                }
            }
        sc.close();
    }
}
