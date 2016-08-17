public class Task2 {

    private static final int cost = 100;

    public static void main(String[] args) {


        String service = "good";

        System.out.println("???? ??????: " + tips(cost, service));

    }

    public static int tips(int cost, String service) {
        int result;

        if (service.equals("poor")) {
            result = (int) (cost * 0.05);
            return result;
        } else if (service.equals("good")) {

            result = (int) (cost * 0.1);
            return result;
        } else if (service.equals("great")) {

            result = (int) (cost * 0.15);
            return result;
        } else if (service.equals("excellent")) {

            result = (int) (cost * 0.2);
            return result;
        } else return cost - cost;

    }
}
