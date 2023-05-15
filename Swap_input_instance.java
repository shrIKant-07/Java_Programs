//Swapping using instance variable using third variable and input from user
import java.util.Scanner;
class Swap_input_instance {
 int x, y;
 public static void main(String[] args) {
   Swap_input_instance obj = new Swap_input_instance();
   Scanner in = new Scanner(System.in);

   System.out.println("Input the first number: ");
   obj.x = in.nextInt();
   System.out.println("Input the second number: ");
   obj.y = in.nextInt();

   int temp = obj.x;
   obj.x = obj.y;
   obj.y = temp;

   System.out.println("Swapped values are :" + obj.x + " and " + obj.y);
  }
}