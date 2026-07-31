public class NonStatic {
    public static void main(String[] args) {
        System.out.println("CAR driver starts");
        NonStatic ns=new NonStatic();
    //if a block is directly inside a class block and declared without using static keywords then it is called non static block
    //a non static block is executed every time whenever an object of the class is created .
    //we can initialise a non static variable inside a non static block so it is also called non static initializer block.
    //
    }
    {
        System.out.println("non static block starts :");
    }
}
