import javafx.beans.binding.When;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task1 {

    public static void main(String[] args) throws IOException {

        BufferedReader set = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("######################################################################################");
        System.out.println("---=====  Для запуска калькулятора введите start для остановки stop  =====---");
        System.out.println("                " + " --=== Для запуска справки введите : help ===--- ");


        while (true) {
            System.out.print("# :");
            String input = set.readLine();


            if (input.equals("help")) {
                System.out.println(" sum - сложение ");
                System.out.println(" minus - вычитание ");
                System.out.println(" dev - деление ");
                System.out.println(" mult - умножение ");
                System.out.println(" rest - остаток от деления ");
                System.out.println(" modul - модуль числа ");

            } else if (input.equals("stop")) {
                return;
            } else {
                try {
                    while (input.equals("start")) {


                        System.out.print(" Введите число: ");
                        String a = set.readLine();
                        int x = Integer.parseInt(a);


                        System.out.print("Введите операцию: ");
                        String operation = set.readLine();

                        if (operation.equals("stop")) {
                            return;
                        } else if (operation.equals("modul")) {
                            System.out.println("Ответ : " + modul(x));
                            break;
                        }

                        System.out.print(" Введите второе число: ");
                        String b = set.readLine();
                        int y = Integer.parseInt(b);


                        if (operation.equals("sum")) {
                            System.out.println("Ответ : " + sum(x, y));
                        } else if (operation.equals("minus")) {
                            System.out.println("Ответ : " + minus(x, y));
                        } else if (operation.equals("dev")) {
                            System.out.println("Ответ : " + dev(x, y));
                        } else if (operation.equals("mult")) {
                            System.out.println("Ответ : " + mult(x, y));
                        } else if (operation.equals("rest")) {
                            System.out.println("Ответ : " + rest(x, y));
                        } else {
                            System.out.println(" не верная операция ");
                        }

                    }
                } catch (NumberFormatException e) {
                    System.out.println(" Нужно ввести число ");

                }

            }
        }
    }
    // Реализация функций

    public static int sum(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int minus(int x, int y) {
        int result = x - y;
        return result;
    }

    public static int dev(int x, int y) {
        int result = x / y;
        return result;
    }

    public static int mult(int x, int y) {
        int result = x * y;
        return result;
    }

    public static int rest(int x, int y) {
        int result = x % y;
        return result;
    }

    public static int modul(int x) {
        int result = Math.abs(x);
        return result;
    }


}
