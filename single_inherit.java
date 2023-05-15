// For single inheitence
import java.util.Scanner;

class A {

    int a, b, c,d,e, average;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter five numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
    }

    void average() {
        average = ( a + b + c + d + e ) / 5;
    }

}

class single_inherit extends A {

    
    void display() {
        System.out.println("Average is:" + average);
    }

    public static void main(String args[]) {
        single_inherit obj = new single_inherit();
        obj.input();
        obj.average();
        obj.display();
    }
}