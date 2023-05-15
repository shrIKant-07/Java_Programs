//Swapping using instance variable without using third variable
class  Swap_2varinstance{
	int a=5, b=7;
	public static void main(String[] args) {
     
	  Swap_2varinstance obj = new Swap_2varinstance();
      System.out.println("Before swapping : a = "+obj.a+" b = "+ obj.b);
		obj.a = obj.a + obj.b;
		obj.b = obj.a - obj.b;
		obj.a = obj.a - obj.b;
	  System.out.println("After swapping : a = "+obj.a+" b = "+ obj.b);
 }
 
}
