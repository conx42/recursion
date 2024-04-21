/**
 * Problem-Statement
 * Print(N to 1) - By using BackTracking
 */
import java.util.*;
import static java.lang.System.out;
public class Task4{
    public static void f(int i, int N){
        if(i>N){
            return;
        }
        f(i+1,N);
        out.println("i: "+i);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        out.println("Running...");
        out.print("Enter n: ");
        int N=sc.nextInt();
        f(1,N);
    }
}
