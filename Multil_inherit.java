import java.util.Scanner;

class A {

    int a , b , c , d , e , average;
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

class C extends B {

    void average() {
        average = ( a + b + c + d + e ) / 5;
    }
}

class Multil_inherit extends C {

    void result() {
        System.out.println("Average is:" + average);
    }

    public static void main(String args[]) {
        Multil_inherit obj = new Multil_inherit();
        obj.input();
        obj.average();
        obj.result();
    }
}