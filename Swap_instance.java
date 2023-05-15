//Swapping using instance variable using third variable

class Swap_instance {
	int a=5, b=7;
	
 public static void main(String args[]) {
     
   Swap_instance obj = new Swap_instance();
   System.out.println("Before swapping : a = "+obj.a+" b = "+ obj.b);
   int temp = obj.a;
   obj.a = obj.b;
   obj.b = temp;   
  System.out.println("After swapping : a = "+obj.a+" b = "+ obj.b);
 }
 }