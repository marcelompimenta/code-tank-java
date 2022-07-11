import java.util.Scanner;

public class TestMetod {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num1 = inputValue.nextInt();

        System.out.print("Escolha a operação: \n < (+) (-) (*) (/) (% - Resto da Divisão) > ");
        char operator = inputValue.next().charAt(0);

        System.out.print("Digite outro valor: ");
        int num2 = inputValue.nextInt();

        String result =  calc(num1, num2, operator) == 0 ? " Entre com um operador válido! " : "";

        System.out.print("Valor da soma : " + calc(num1, num2, operator) + result);

    }

    public static int calc( int value1, int value2, char operator ){
        switch (operator){
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                return value1 / value2;
            case '%':
                return value1 % value2;
            default:
               return 0;
        }

    }
}

