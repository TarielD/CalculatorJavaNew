import java.util.Scanner;
import java.util.InputMismatchException;


public class CalculatorJava {
    private static Scanner calc;
    public static void main (String[] args){

        try {
            calc = new Scanner(System.in);
            System.out.print("input: ");
            int first = calc.nextInt();
            String operation = calc.next();
            int second = calc.nextInt();

            if (second == 0){
                System.err.println("Правило!!!");
            }
            if ((first < 0 || first > 10) || (second < 0 || second > 10)) {
                throw new Exception("Числа должны быть в диапазоне от 1 до 10!");
            }
            if (operation.equals("*")){
                System.out.println("output: " + (first * second));
            }
            if (operation.equals("/")){
                System.out.println("output: " + (first / second));
            }
            if (operation.equals("+")){
                System.out.println("output: " + (first + second));
            }
            if (operation.equals("-")){
                System.out.println("output: " + (first - second));
            }
        } catch (InputMismatchException ex) {
            System.err.println("Не верные данные.., введите целое число!!!");
        } catch (ArithmeticException ex) {
            System.err.println("Делить на ноль нельзя!!!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена!!!");
    }
}

