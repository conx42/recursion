/**
 * Using -> BackTracking
 * Printing (1 to N)
 * Not Using 'f(i+1)' - [Not possible]
 */
import java.util.*;
public class Main1{
    public static void f(int i, int N){
        if(i<1){
            return;
        }
        f(i-1, N);
        System.out.println(i);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Program is running....");
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        f(n,n);
    }
}
