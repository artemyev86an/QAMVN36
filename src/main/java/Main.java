public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long actual1 = service.calculate( 1000, true);
        int expected1 = 30;
        System.out.println("OP:" + expected1 + "ФР:" + actual1);

        long actual2 = service.calculate( 10_000_000, true);
        int expected2 = 500;
        System.out.println("OP:" + expected2 + "ФР:" + actual2);
    }
}
