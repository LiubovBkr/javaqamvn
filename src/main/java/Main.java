public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 30;
        long actual = service.calculate(1000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        int expected1 = 500;
        long actual1 = service.calculate(1000000, true);
        System.out.println("2. " + expected1 + " == ? == " + actual1);
    }
}
