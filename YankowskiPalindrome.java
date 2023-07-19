/* Tom Yankowski
 * Exercise 2-7
 * This program loops through an array of strings and determine if its a palindrome
 * It uses two methods to determine if it is a palindrome
 * This program uses string methods, StringBuffer, and StringTokenizer to manipulate the strings in the array
 * One method will break up the string, put the string back together, then return it to main
 * The other method  will test to see if the string is the same forwards and backwords
 *  */
import java.io.*;
import java.util.StringTokenizer;
  public class YankowskiPalindrome
  {
    public static void main(String[] args) throws IOException
    {
  
      String[] sarray =  {"mom", " Yankees are number one ", "A Santa at NASA.", "Java programming;", "Did Hannah see bees? Hannah did!"};
      
      int i;
          for(i =0; i<sarray.length; i++) 
          {
            sarray[i] = Fix(sarray[i]); //returns the string to the array after being sent to the method]
            if(palindromeTest(sarray[i]))
            {
              System.out.println("This is a palindrome " + sarray[i]);
            }
            else
              System.out.println("This is not a palindrome " + sarray[i]);
            
             
          }
            
    }
    public static String Fix(String sarray)
    {
      
     
      StringTokenizer st = new StringTokenizer(sarray, " ,!;.?");//removes spaces and punctuation 
   StringBuffer nopunc = new StringBuffer();
     while(st.hasMoreTokens())//loops through the string to see if it has more tokens
     {
       
       nopunc.append(st.nextToken());//append the tokens to the StringTokenizer
     }
    String  str =  nopunc.toString();
     
      return str.toLowerCase();
    }
    public static boolean palindromeTest(String test)
    {

      boolean strcompare = false;
     StringBuffer palindrome = new StringBuffer(test); 
      palindrome.reverse();
      String x = palindrome.toString();
      if(test.equals(x)) //test whether the orignal string is equal to the reverse string
      strcompare = true;
       else
         strcompare = false;
      
      return strcompare;
    }
    
  }