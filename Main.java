import java.util.Scanner;
/**
 * This program determines the correct order for 2 numbers
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user
    Scanner input = new Scanner(System.in);

    // ask user for the first integer
    System.out.println("Please enter an integer:");
    int integer1 = input.nextInt();

    // ask user for the second integer
    System.out.println("Please enter another integer:");
    int integer2 = input.nextInt();

    // determine which integer is bigger
    if(integer1 > integer2){
      System.out.println("Your numbers in ascending order are " + integer2 + "," + integer1);
    } else if(integer1 == integer2){
      System.out.println("Your numbers in ascending order are " + integer2 + "," + integer1);
    } else {
      System.out.println("Your numbers in ascending order are " + integer1 + "," + integer2);
    }
    
  }
}
