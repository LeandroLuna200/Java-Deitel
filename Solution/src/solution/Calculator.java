/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author leand
 */
class Calculator{
    public static int power( int n, int p ) throws Exception
    {
        int res = 1;
        if( n <= 0 || p < 0 )
            throw new Exception("n and p should be non-negative");
        if( p == 0 )
            return 1;    
        for(int i = 1; i <= p; i++)
            res *= n;
        return res;
    } 
}
