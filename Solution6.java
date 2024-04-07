/*Kth Row of Pascal's Triangle
Problem Description

Given an index k, return the kth row of the Pascal's triangle.
Pascal's triangle: To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous row R - 1.

Example: ``` Input : k = 3

Return : [1,3,3,1] ``` Note: k is 0 based. k = 0, corresponds to the row [1].

Note: Could you optimize your algorithm to use only O(k) extra space?



User Code
*/
import java.util.*;
 public class Solution6{
    public int[] getRow(int A) {
        ArrayList<Integer> list = new ArrayList<>();
        int prev = 1;
        list.add(1);
        
        for(int i=1;i<A;i++){
            int curr = (prev * (A-i+1))/i;
            list.add(curr);
            prev = curr;
            
        }
        if(A > 0) list.add(1);
        int res[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
        
    }
}
