import java.util.Scanner;

public class ExMatriz2First {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int[][] ArrayNumbers = new int[3][3];
        int sum = 0;
        int diagonalSum = 0;

        for (int i = 0; i < ArrayNumbers.length; i++) {
            for (int j = 0; j < ArrayNumbers[i].length; j++) {
                System.out.print("Linha - " + (i + 1) + " | Coluna - " + ( j + 1) + " : ");
                ArrayNumbers[i][j] = inputData.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < ArrayNumbers.length; i++) {
            for (int j = 0; j < ArrayNumbers[i].length; j++) {
                if (i == j) {
                    diagonalSum += ArrayNumbers[i][j];
                }
            }
        }

        for ( int[] ArrayNumber : ArrayNumbers) {
            for (int Array : ArrayNumber) {
                sum += Array;
            }
        }
        System.out.println("Soma diagonal : " + diagonalSum);
        System.out.println("Soma de todos os valores : " + sum);
    }
}
