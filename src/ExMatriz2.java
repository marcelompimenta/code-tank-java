import java.util.Scanner;

public class ExMatriz2 {

    public static void main(String[] args) {

        Scanner dataInput = new Scanner(System.in);

        int[][] arrayNumbers = new int[3][3];
        int sum = 0, diagonalSum = 0;

        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = 0; j < arrayNumbers[i].length; j++) {
                System.out.print("Linha - " + ( i + 1 ) +  " | Coluna - " + ( j + 1 ) + " : ");
                arrayNumbers[i][j] = dataInput.nextInt();
                diagonalSum += (i == j) ? arrayNumbers[i][j] : 0;
                sum += arrayNumbers[i][j];
            }
            System.out.println();
        }
        System.out.println("Soma diagonal : " + diagonalSum);
        System.out.println("Soma de todos os valores :  " + sum);
    }

}








/*
* 4. Crie um programa que receba valores do usuário para preacher uma matriz 3X3,
*  e em seguida, exiba a soma dos valores dela
*  e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
* */