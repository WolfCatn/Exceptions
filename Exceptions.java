//Project done by Naomi "Nigh" Johnson
//for CTE Software Development Class 2024
//Instructor: Kim Gross

public class Exceptions {
    //setting up variables:
    public static void main(String[] args) {
        try {
            //setting up the range
            int[] numbers = {1, 2, 3};
            //Getting the ArrayIndexOutOfBoundsException to get thrown.
            System.out.println(numbers[5]);
        //Setting up the catch code to fix the error.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index that is out of bounds.");
        }
        try {
            // Getting the ArithmeticException code to get thrown.
            int result= 10 / 0; 
            System.out.println(result);
        //The catch for the error.
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
