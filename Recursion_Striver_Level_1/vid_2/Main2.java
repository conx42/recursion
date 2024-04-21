/**
 * PROBLEM-STATEMENT
 * using f(i+1)[in recursion call] -> but this time using BACKTracking
 */
import java.util.*;
public class Main{
    public static void f(int i, int N){
        if(i>N){
            return;
        }
        f(i+1,N);
        System.out.println("i = "+i);
    }
    public static void main(String []args){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Program is Running...");
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        f(1,n);
    }
}

/**
* * //output                                                    
*                         f(1, 5)                            |           
*                        / -> check (1>5)? -> X (No)         |                               
*                       / -> print(1)                        |             
*                      f(2, 5)                               |      
*                     / -> check (2>5)? -> X (No)            |                           
*                    / -> print(2)                           |           
*                   f(3, 5)                                  |   
*                  / -> check (3>5)? -> X (No)               |                       
*                 / -> print(3)                              |       
*                f(4, 5)                                     |   
*               / -> check (4>5)? -> X (No)                  |                   
*              / -> print(4)                                 |       
*             f(5, 5)                                        |
*            / -> check (5>5)? -> X (No)                     |                   
*           / -> print(5)                                    |   
*          f(6, 5) --> X                                     |   Bottom
*         |-> check (5>5)? -> X (Yes)                        |   Up            
*         return - (back-From-Here)                          |   Tracking function calls      
*                                                               
*/