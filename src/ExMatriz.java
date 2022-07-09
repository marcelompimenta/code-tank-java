import java.lang.Math;

public class ExMatriz {
    public static void main(String[] args) throws InterruptedException {

        double[][] matriz_1 = new double[2][3];
        double[][] matriz_2 = new double[2][3];
        double[][] matriz_3 = new double[2][3];
        double[][] matriz_4 = new double[2][3];

        /* primeiro bloco atribuição de valores */

        System.out.println("\t\t Atribuição de valores. \n");

        for (int i = 0; i < matriz_1.length; i++) {
            System.out.println("Primeira Matriz");
            for (int j = 0; j < matriz_1[i].length; j++) {
                matriz_1[i][j] = Math.round(Math.random() * 100);
                System.out.println("Linha: " + i + " - Coluna: " + j + " : " + matriz_1[i][j]);
            }
                System.out.println();
                Thread.sleep(1000);
        }

        for (int i = 0; i < matriz_2.length; i++) {
            System.out.println("Segunda Matriz");
            for (int j = 0; j < matriz_2[i].length; j++) {
                matriz_2[i][j] = Math.round(Math.random() * 100);
                System.out.println("Linha: " + i + " - Coluna: " + j + " : " + matriz_2[i][j]);
            }
            System.out.println();
            Thread.sleep(1000);
        }
        /* Segundo bloco calculos  */

        System.out.println("\t\t\t Calculos Primeira Matriz Soma \n");

        for (int i = 0; i < matriz_3.length; i++) {
            for (int j = 0; j < matriz_3[i].length; j++) {
                matriz_3[i][j] = matriz_1[i][j] + matriz_2[i][j];
                System.out.println("Resultado da Soma - Linha: " + i + " - Coluna: " + j + " : " + matriz_3[i][j]);
            }
            System.out.println();
            Thread.sleep(1000);
        }

        System.out.println("\t\t\t Calculos Segunda Matriz Diferença \n");

        for (int i = 0; i < matriz_4.length; i++) {
            for (int j = 0; j < matriz_4[i].length; j++) {
                matriz_4[i][j]
                        = (matriz_1[i][j] - matriz_2[i][j]) < 0
                        ? (matriz_1[i][j] - matriz_2[i][j]) * -1
                        : (matriz_1[i][j] - matriz_2[i][j]);

                System.out.println("Resultado da Diferença - Linha: " + i + " - Coluna: " + j + " : " + matriz_4[i][j]);
            }
            System.out.println();
            Thread.sleep(1000);
        }
    }
}

/*
* 3. Escreve um programa que lê duas matrizes N1 (2,3) e N2(2,3) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

4. Crie um programa que receba valores do usuário para preacher uma matriz 3X3, e em seguida, exiba a
*  soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
*
* */
