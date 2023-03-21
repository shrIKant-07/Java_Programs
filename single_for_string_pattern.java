//Program to print string pattern using single for loop.
public class pra1 {
    public static void main(String[] args) {
       
        for (char i = 'A', j = 'E'; i <= 'E' && j >= 'A'; i++, j--) {
            System.out.println(i + "  " + j + "  " + i );
        }
    }
}