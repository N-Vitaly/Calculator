import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    private double num1;
    private double num2;
    private char operation;
    private double result;
    public void osnova() {
        this.num1 = getDouble();
        this.num2 = getDouble();
        this.operation = getOperation();
        this.result = itog(num1,num2,operation);
        System.out.println("Результат операции: " + result);

        ArrayList<Double> chislo = new ArrayList<>();
        chislo.add(num1);
        chislo.add(num2);
        chislo.add(result);
        System.out.println("Список значений: " + chislo);

        HashSet<Double> myHashSet = new HashSet<Double>();
        myHashSet.add(num1);
        myHashSet.add(num2);
        myHashSet.add(result);
        System.out.println("Множество значений: " + myHashSet);


        PriorityQueue<Double> myPriorityQueue = new PriorityQueue<Double>();
        myPriorityQueue.add(num1);
        myPriorityQueue.add(num2);
        myPriorityQueue.add(result);
        System.out.println("Очередь: " + myPriorityQueue);
    }

    public static double getDouble() {
        System.out.println("Введите число:");
        double num;
        num = scanner.nextDouble();

        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        operation = scanner.next().charAt(0);

        return operation;
    }


    public static double itog(double num1, double num2, char operation) {
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
