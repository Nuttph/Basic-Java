public class Function {
    public static void main(String[] args) {
        add(10, 12);
        fullname("Nuttaphon", "Popardit");
        System.out.println(logicAnd(true, false)); // false
        System.out.println(logicOr(true, false)); // true
        System.out.println(logicNot(true)); // false
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void fullname(String n, String s) {
        System.out.println(n + " " + s);
    }

    public static boolean logicAnd(boolean x, boolean y) {
        return x && y;
    }

    public static boolean logicOr(boolean x, boolean y) {
        return x || y;
    }

    public static boolean logicNot(boolean x) {
        return !x;
    }
}
