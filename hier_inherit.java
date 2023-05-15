import java.util.Scanner;

class A {
    static int a , b , c , d , e , average;
    Scanner sc = new Scanner(System.in);
}

class B extends A {

    void input() {
        System.out.print("Enter five numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
    }
}

class hier_inherit extends A {

    void average() {
        average = ( a + b + c + d + e ) / 5;
    }

    void result() {
        System.out.println("Average is:" + average);
    }

    public static void main(String args[]) {
        B obj1 = new B();
        obj1.input();

        hier_inherit obj2 = new hier_inherit();
        obj2.average();
        obj2.result();
    }
}