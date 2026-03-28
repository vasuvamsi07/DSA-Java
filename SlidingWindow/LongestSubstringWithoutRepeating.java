//Problem - LongestSubstring without Repeating Chars
//Pattern - SlidingWindow
//Leetcode - 3.Longest Substring Without Repeating Characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0,r=0,n=s.length(),maxlen=0;
        while(r<n){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                maxlen = Math.max(maxlen,r-l);
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxlen;
    }
}
