/* Smaller and Greater
You are given an Array A of size N.

Find for how many elements, there is a strictly smaller element and a strictly greater element.



Input Format

Given only argument A an Array of Integers.
Output Format

Return an Integer X, i.e number of elements.
Constraints

1 <= N <= 1e5
1 <= A[i] <= 1e6
For Example

Example Input:
    A = [1, 2, 3]
    
Example Output:
    1
   
Explanation:
    only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.
User Code
*/
import java.util.*;
 public class Solution2 {
    public int solve(int[] A) {
        int count = 0;
        int n = A.length;
        if(n <= 2) return 0;
        Arrays.sort(A);
        int first = A[0];
        int second = A[n-1];
        for(int i=1;i<n-1;i++){
            if(A[i] < second && A[i] > first){
                count++;
            }
        }
        return count;
    }
}
