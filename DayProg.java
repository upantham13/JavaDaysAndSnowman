
/**
 * Made a new class with objects today and stPatsDay, used methods to print the dates
 * and the asked results from the rubric.
 *
 * @author Umasathvik Pantham
 * @version 02/13/21
 */
public class DayProg
{
   public static void main(String[] args)
    {
        //Step 1: Create a Day object for today
        Day today = new Day(2021, 2, 13);
        
        //Step 2: Display the date
        System.out.println("Today is " + today.toString() + ".");
        
        //Step 3: Create another Day object for the St. Patrick’s Day on March 17, 2021
        Day stPatsDay = new Day(2021, 3, 17);
        
        //Step 4: Display the date for the St. Patrick’s Day
        System.out.println("The St. Patrick's Day is " + stPatsDay.toString() + ".");
        
        //Step 5: Call a method on the object for today to find out the number of days to
        //the St. Patrick’s Day and store it in a variable
        int daysToStPatsDay = stPatsDay.daysFrom(today);
        
        //Step 6: Display the number of days
        System.out.println("There are " + daysToStPatsDay + " days until the St. Patrick's Day.");
        
        //Step 7: Call another method on the object for today to change it to the date 23 days ago
        today.addDays(-23);
        
        //Step 8: Call methods on the object for today to display the year, month, and day of the
        //date 23 days ago
        System.out.println("The date of 23 days ago is:");
        System.out.println("   Year : " + today.getYear());
        System.out.println("   Month: " + today.getMonth());
        System.out.println("   Day  : " + today.getDayOfMonth());
    }
}
