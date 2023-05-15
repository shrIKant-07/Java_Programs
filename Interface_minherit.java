import java.util.Scanner;

interface A {
    public void input() ;
}

interface B {

    public void average() ;
}

public class Interface_minherit implements A, B {
    float a,b,c,d,e;
    float average;
    Scanner sc = new Scanner(System.in);

   public void input() {
        System.out.print("Enter five numbers:");
         a = sc.nextFloat();
         b = sc.nextFloat();
         c = sc.nextFloat();
         d = sc.nextFloat();
         e = sc.nextFloat();
    }
        public void average() {
            average = ( a + b + c + d + e ) / 5;
     
     }

   void result() {
        System.out.println("Average is:" + average);
    }

    
    public static void main(String args[]) {
        Interface_minherit obj = new Interface_minherit();
        obj.input();
        obj.average();
        obj.result();
    }
}