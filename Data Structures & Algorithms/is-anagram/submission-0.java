class Solution {
    public boolean isAnagram(String s, String t) {
        int tempa[]=new int[26],tempb[]=new int[26];
        int n=s.length(),m=t.length();
        for(int i=0;i<n;i++){
            tempa[s.charAt(i)-'a']++;
        }
        for(int i=0;i<m;i++){
            tempb[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(tempa[i]!=tempb[i])  return false;
        }
        return true;
    }
}
