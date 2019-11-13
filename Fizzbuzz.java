
/**
 * 
 *
 * @author Trey Morris -> updated by Dan
 * 
 */
public class Fizzbuzz
{ //class scope: start
  public static void main(String[]args)
  { //method scope: start
    int numberToReach = 100;
    for(int i = 1; i<=numberToReach; i++)
    { //for loop scope: start
      boolean DivisiblebyThree = i % 3==0;
      boolean DivisiblebyFive = i % 5 == 0;
      boolean NotDivisiblebyThree = i % 3 != 0;  
      if (DivisiblebyThree) 
      { //if scope (3): start
        System.out.print("Fizz");
      } //if scope (3): end
      if(DivisiblebyFive)
      { //if scope (5): start
        System.out.print("Buzz");
      } //if scope (5): end
      else if (NotDivisiblebyThree) 
      { //else if scope: start
        System.out.print(i);
      } //else if scope: end
      System.out.println();
    } //for loop scope: end
  } //method scope: end
} //class scope: end 

 
   
        


