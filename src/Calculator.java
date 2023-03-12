import java.util.ArrayList;
import java.util.Scanner;
public class Calculator {
    static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
        double num1 = getDouble();
        double num2 = getDouble();
        char operation = getOperation();
        double result = itog(num1,num2,operation);
        System.out.println("Результат операции: "+result);

        ArrayList<Double> chislo = new ArrayList<>();
        chislo.add(num1);
        chislo.add(num2);
        chislo.add(result);
        System.out.println("Массив значений: " + chislo);

    }


    private static double getDouble() {
        System.out.println("Введите число:");
        double num;
        num = scanner.nextDouble();

        return num;
    }

    private static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        operation = scanner.next().charAt(0);

        return operation;
    }


    private static double itog(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неправильное действие");
                result = itog(num1, num2, getOperation());
        }
        return result;
    }


}
