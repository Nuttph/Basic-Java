class DataType {
    public static void main(String[] args) {
        String name = "Nuttaphon";
        System.out.println(name);

        int myNum = 15;
        float myFloat = 20.5f;
        char myLetter = 'D';
        boolean myBool = false;
        System.out.println(myNum + myFloat);
        System.out.println(myLetter);
        System.out.println(myBool);
        myNum = 50;
        System.out.println("This is my num = " + myNum);
        // final is count(Java Script)
        final int onlyNum = 15;
        System.err.println(onlyNum);
    }
}
