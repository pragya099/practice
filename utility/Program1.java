public class Program1{
      static int x=10;
      //the value of static variable can not be change  or reinitialize 
    public static void test(){
      System.out.println("test method starts");
      x=50;
    }
    static{
        System.out.println("static block-1 starts");
        x=21;
        System.out.println(x);
        //if want to execute some code before main mathod then we can use static block/
        //if it used on the application level then it
        //if a block is directly inside a class block and declared by using static keyword then it is called static block.
        //we can have multiple static block inside a class and they will be executed in the order in which they are defined in the class.
        //it will load inside metaspace in the sequence written inside the class and will execute at the same time .
        //we can initialize a static variable inside a static block
        //

    }
    public static void main(String []args){
System.out.println("main method starts");
       // System.out.println("x is :"+x);
  test();
   System.out.println("x is :"+x);
    }
}