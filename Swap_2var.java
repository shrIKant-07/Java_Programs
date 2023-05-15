//Swapping using local variable without using third variable
class  Swap_2var{
  public static void main(String[] args) {
     
   int a, b;
   a = 15;
   b = 27;
      System.out.println("Before swapping : a = "+a+" b = "+ b);
   a = a + b;
   b = a - b;
   a = a - b;
	  System.out.println("After swapping : a = "+a+" b = "+ b);
 }
 
}
