package Day3__12_11_21;

public class Reusable_Method {

    //create a void method that will add two numbers
    public static void add(int a,int b){
       System.out.println(" Result of addition is " +(a+b));
    }//end of add method


    //create a void method that will subtract two numbers
    public static void subtract (int c,int d){
        System.out.println(" Result of subtraction is " +(c-d));
    }//end of subtract method





//create a return method that will add two numbers and return the result of it
public static int addReturn(int a, int b) {


    //declare and define a new int variable to store a+b
    int result = a + b;
    System.out.println("Result of addition is " + result);

    //returning the variable result which is storing a+b values
    return result;

}//end of addReturn method
}//end of java class

