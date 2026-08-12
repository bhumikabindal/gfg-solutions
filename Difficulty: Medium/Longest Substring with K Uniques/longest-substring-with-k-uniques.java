class Solution {
 
    public int longestKSubstr(String s, int k) {
        // code here
                int distinct=0,maxlen=-1,l=0,r=0;
        int[] hash=new int[26];
        Arrays.fill(hash,0);
        while(r<s.length()){
            if(hash[s.charAt(r)-'a']==0){
                distinct++;
            }
            hash[s.charAt(r)-'a']++;
            while(distinct>k){
                hash[s.charAt(l)-'a']--;
                if(hash[s.charAt(l)-'a']==0){
                    distinct--;
                    
                }
                l=l+1;
            }
            if(distinct==k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
            
        }
        return maxlen;
        
    }
}