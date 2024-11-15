public class OopFinal {
    final int a = 15;

    public static void main(String[] args) {
        OopFinal myObj = new OopFinal();
        // myObj.a = 5; // will generate an error: cannot assign a value to a final
        // variable
        System.out.println(myObj.a);
    }
}
