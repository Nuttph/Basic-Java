public class OperatorAndLogic {
    public static void main(String[] args) {
        int a;
        a = 10;
        int b = 2;
        int c = 3;
        int d = 10;
        // Operator
        System.out.println("a / c :" + (a / d));
        System.out.println("a % c :" + (a % c)); // 10/3 เศษ 1
        System.out.println("a % c :" + (a % c));

        System.out.println("a < b :" + (a < b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a >= d :" + (a >= d));
        System.out.println("a == d :" + (a == d));
        System.out.println("a != d :" + (a != d));

        boolean t = true;
        boolean f = false;
        System.out.println("t && f :" + (t && f));
        System.out.println("t || f :" + (t || f));
        System.out.println("!f :" + (!f));

    }
}
