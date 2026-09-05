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
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        boolean isVisited[]=new boolean[n];
        
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(isVisited[i]){
                continue;
            }
            List<String> temp=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(!isVisited[j]){
                    if(isAnagram(strs[i],strs[j])){
                        isVisited[j]=true;
                        temp.add(strs[j]);
                    }
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}