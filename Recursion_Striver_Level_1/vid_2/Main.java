/**
 * printing -> (1 to N) - Linearly
 * Without -> BackTracking
 * i.e:- Print-line before recursion call.
 * [actual thing is printing before recursion call]
 * [
 * when "recursion call is returning" we should not doing anything
 * -> if we do something when "recursion call is returning" then that is known as "BACKTracking"
 * ]
 */
import java.util.*;
public class Main{
    public static void f(int i, int N){
        if(i>N){
            return;
        }
        System.out.println("i = "+i);
        f(i+1,N);
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
*                        / -> check (1>5)? -> X (No)         |      Top                         
*                       / -> print(1)                        |      Down       
*                      f(2, 5)                               |      Linearly
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
*          f(6, 5) --> X                                     |   
*         |-> check (5>5)? -> X (Yes)                        |               
*         return - (back-From-Here)                          |           
*                                                               
