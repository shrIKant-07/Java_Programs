//Swapping using local variable using third variable
class Swap {
 
 public static void main(String[] args) {
     
   int a, b, temp;
   a = 5;
   b = 7;
   System.out.println("Before swapping : a = "+a+" b = "+ b);
   temp = a;
   a = b;
   b = temp;   
  System.out.println("After swapping : a = "+a+" b = "+ b);
 }
 }