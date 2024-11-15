public class Constructor {
    int n;

    public Constructor() {
        n = 10;
    }

    public static void main(String[] args) {
        Constructor myObj1 = new Constructor();
        System.out.println(myObj1.n);
    }
}
