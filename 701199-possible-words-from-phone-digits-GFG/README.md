# [Possible Words From Phone Digits](https://www.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/1)
## Medium
Given an array arr[] containing digits, generate all possible words that can be formed by pressing these digits on a phone keypad, as shown in the figure. Digits 0 and 1 do not map to any letters, so they do not contribute to the generated combinations.
Note: Return the combinations in any order. The driver code will print them in sorted order.

Examples :
Input: arr[] = [2, 3]
Output: [ad, ae, af, bd, be, bf, cd, ce, cf]
Explanation: When we press 2 and 3 total 3 x 3 = 9 possible words formed.
Input: arr[] = [2]
Output: [a, b, c]Explanation: When we press 2 total 3 possible words formed.
Constraints:1 ≤ arr.size() ≤ 90 ≤ arr[i] ≤ 9