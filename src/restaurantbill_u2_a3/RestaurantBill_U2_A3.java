/* Hildana.M
 * RestaurantBill_U2_A3.java
 * This program displays your bill at a restaurant 
 * March/09/2018
 */

package restaurantbill_u2_a3;

import java.text.DecimalFormat;
public class RestaurantBill_U2_A3 {
    
    public static void main(String[] args) {
        
      double numberMeal, numberTax, numberTotal; //declaration of variables 
      
      //information on the bill 
      numberMeal = 35.34;
      numberTax = 0.13*35.34;
      numberTotal = 35.34 + (0.13*35.34);
      
      //Statement to round the numbers to tow decimal places 
      DecimalFormat round = new DecimalFormat ("##.##");
      
      System.out.println("Restaurant Bill" +"\n****************\n"); //title
      
      //Displays the result which are rounded 
      System.out.println ("Meal:\t" + round.format (numberMeal) + "$" );
      System.out.println ("Tax:\t" + round.format (numberTax) + "$" );
      System.out.println ("Total:\t" + round.format (numberTotal) + "$" );

    }
    
}
