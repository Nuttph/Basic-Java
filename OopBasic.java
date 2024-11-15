public class OopBasic {
    int x = 5;

    public static void main(String[] args) {
        OopBasic myObj1 = new OopBasic();
        OopBasic myObj2 = new OopBasic();
        System.out.println(myObj1); // OopBasic@4517d9a3
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

        myObj1.x = 10;
        System.out.println("after myObj1.x = 10 --> " + myObj1.x); // x is now 10
    }
}
