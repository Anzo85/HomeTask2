
public class Task3 {

    public static void main(String[] args) {


        String operation = args[0];
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);


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



}
