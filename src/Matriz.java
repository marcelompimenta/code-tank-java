import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        double[][] matriz = new double[3][3];

        Scanner num = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Linha : " + i + " -  Coluna " + j + " : ");
                matriz[i][j] = num.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Linha : " + i + " -  Coluna " + j + " : " + matriz[i][j]);
            }
            System.out.println();
        }
    }
}
