import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = in.nextInt();
    while (num-->=0){
      int i = 0;
      while(i <= num){
        System.out.print("*");
        i++;
      }
      System.out.println();
    }
    
  }
}
