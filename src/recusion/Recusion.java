/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recusion;

import java.util.Scanner;

/**
 *
 * @author tituo4996
 */
public class Recusion {

    /**
     * @param args the command line arguments
     */
    //    using recusion
    static long fib(int n)
    {
        if (n==0 || n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);    
    }
    //Tn=Tn-1+Tn-2
    public static void main(String[] args) 
    {
        
        System.out.println(fib(100));    
        
    }

    
    
    
//    using loops    
//    static int fib(int n)
//    {
//        int[] nums = new int[n+1];
//        nums[0]=1;
//        nums[1]=1;
//        for (int i = 2; i < n; i++)
//        {
//            nums[i] = nums[i-1] +nums[i-2];
//        }
//        return n;
//    }
}
