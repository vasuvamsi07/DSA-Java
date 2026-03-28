//Problem - Longest Repeating Character Replacement
//Pattern - SlidingWindow, HashMap
//Leetcode - 424.Longest Repeating Character Replacement
class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen=0,maxFreq=0,i,l=0;
        int freq[] = new int[26];
        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq,freq[ch - 'A']);
            while(r-l+1 - maxFreq > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;
        
    }
}
