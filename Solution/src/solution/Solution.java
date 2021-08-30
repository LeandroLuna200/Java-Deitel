/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.*;
//import java.io.*;

/**
 *
 * @author leand
 */
class Solution{

    public static void main(String[] args) {
    
        try (Scanner in = new Scanner(System.in)) {
            int t = in.nextInt();
            while (t-- > 0) {
                
                int n = in.nextInt();
                int p = in.nextInt();
                //Calculator myCalculator = new Calculator();
                try {
                    int ans = Calculator.power(n, p);
                    System.out.println(ans);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
