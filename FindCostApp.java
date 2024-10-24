import java.util.*;

public class FindCostApp
{
    public static void main(String[ ] args )
    {
        Scanner kbd= new Scanner(System.in);
        double price, tax; // declaring variables

        displayTitle(); // calling method that displays title

        System.out.print("Enter initial price: ");// obtaining price input
        price = kbd.nextDouble();

        System.out.print("Enter tax rate: "); // obtaining tax input
        tax = kbd.nextDouble();

        price = calculateFinalPrice(price, tax ); // variable receiving the return value from calculateFinalPrice method

        displayPrice(price); //calling the method which displays the final cost

        System.out.println("END OF PROGRAM "); // indicating program termination
    }
    static void displayTitle() //method to display the title of program
    {
        System.out.println("*** Product Price Check ***");
     }
     static void displayPrice(double priceIn) //method to display final cost of product
     {
         System.out.println("Cost after tax = " + priceIn);
     }
     static double calculateFinalPrice(double priceIn , double taxIn)
     {
         return priceIn * (1 + taxIn/100); // returns value back to main method after calculation
     }
}