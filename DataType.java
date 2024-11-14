class DataType {
    public static void main(String[] args) {
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

        final String name = "Nuttaphon";
        final String surname = "Popardit";
        System.err.println(name + surname);

        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
}
