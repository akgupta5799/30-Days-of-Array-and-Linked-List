
/*Rain Water Trapped
Problem Description
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.



Problem Constraints
1 <= |A| <= 100000



Input Format
First and only argument is the vector A



Output Format
Return one integer, the answer to the question



Example Input
Input 1:

A = [0, 1, 0, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

1 unit is trapped on top of the 3rd element.
Explanation 2:

No water is trapped.


User Code
*/

 public class Solution9 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int l = 0, r = A.length - 1;
        int lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE;
        int ans = 0;
        while(l < r){
            lmax = Math.max(lmax, A[l]);
            rmax = Math.max(rmax, A[r]);
            if(lmax < rmax){
                ans += lmax - A[l];
                l++;
            }else{
                ans += rmax - A[r];
                r--;
            }
        }
        return ans;
    }
}
 