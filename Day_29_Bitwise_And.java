/* Objective
Welcome to the last day! Today, we're discussing bitwise operations. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given set . Find two integers,  and  (where ), from set  such that the value of  is the maximum possible and also less than a given integer, . In this case,  represents the bitwise AND operator.

Function Description
Complete the bitwiseAnd function in the editor below.

bitwiseAnd has the following paramter(s):
- int N: the maximum integer to consider
- int K: the limit of the result, inclusive

Returns
- int: the maximum value of  within the limit.

Input Format

The first line contains an integer, , the number of test cases.
Each of the  subsequent lines defines a test case as  space-separated integers,  and , respectively.

Constraints

Sample Input

STDIN   Function
-----   --------
3       T = 3
5 2     N = 5, K = 2
8 5     N = 8, K = 5
2 2     N = 8, K = 5
Sample Output

1
4
0
Explanation

 

All possible values of  and  are:

The maximum possible value of  that is also  is , so we print  on a new line. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int res=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    int and=i&j;
                    if(and<k && and > res){
                        res=and;
                    }
                }
            }
           System.out.println(res);
            }  
             scanner.close(); 
          }
       
    }
