import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    
    Scanner in = new Scanner(System.in);
    System.out.print("num of integers: "); 
    int numOfInt = in.nextInt(); // num of int that the user will enter
    ArrayList<Integer> intList = new ArrayList<>(); // array to store all integers from user
    while (numOfInt>0){ // loop user input numOfInt times
      int num = in.nextInt();
      intList.add(num);
      numOfInt--;
    }

    int mostCount = 0; // store the most no. of count
    int mode = 0; 
    for (int i : intList){
      int count = 0; // count the number of times the integer has occurred
      for (int j : intList){
        if (i == j){
          count++;
        }
      }
      if (count > mostCount){
        mostCount = count;
        mode = i;
      }
    }
    System.out.println("Mode: " + mode);
    
  }
}
