/**
 * Call some string methods on different string objects.
 * 
 * @author Umasathvik Pantham
 * @version 02/13/2021
 */
public class SpringBreak
{
    public static void main(String[] args)
    {
        String word =  "St. Patrick's Day"; 
        int index = 0;                      
        int size = 5;                       
        // Do not change the lines above
        System.out.println("The given string: " + word);
        
        int numOfChar = word.length();
        System.out.println("The length: " + numOfChar);
        
        char ch = word.charAt(index);
        System.out.println("The character at index " + index + ": " + ch);
        
        String substring5 = word.substring(index, index + size);
        System.out.println("The size " + size + " substring starting at index " + index +": " + substring5);
        
        String uppercaseWord = word.toUpperCase();
        System.out.println("ALL UPPER CASE: " + uppercaseWord);
        
        String lowercaseWord = word.toLowerCase();
        System.out.println("all lower case: " + lowercaseWord);
        
        String noSpaceWordAndLowercase = word.replace(" ", "").toLowerCase();
        System.out.println("all lower case with space removed: " + noSpaceWordAndLowercase);
        
        String originalWordWithUnderscores = word.replace(" ", "_");
        System.out.println("The original word with ' ' replaced by '_': " + originalWordWithUnderscores);
        
    }
}