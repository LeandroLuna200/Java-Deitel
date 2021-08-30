/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia11.pkg2darray;

/**
 *
 * @author leand
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Dia112dArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );          
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int sum = 0,
            max = -100;
        
        for( int i = 0; i < 4; i++)
        {
            for( int j = 0; j < 4;  j++)
            {
                for( int k = 0; k < 3; k+=2)
                    for( int h = 0; h < 3; h++)
                        sum += arr.get(i+k).get(j+h); 
//                    System.out.println( sum );     
                sum += arr.get(i+1).get(j+1);
//                System.out.println( sum );
                if( sum > max )
                    max = sum;
                sum = 0;
            }  
        }
        
        System.out.println( max );

        bufferedReader.close();
    }
}
