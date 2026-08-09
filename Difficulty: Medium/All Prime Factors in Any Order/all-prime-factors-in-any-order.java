class Solution {
    ArrayList<Integer> primeFactors(int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int m=n;
        for(int i=2;i<=Math.sqrt(m);i++){
         if(m%i==0){
            
             while(m%i==0){
                 m=m/i;
                  list.add(i);
             }
         }   
        }
        if(m!=1)list.add(m);
        return list;
        
    }
}
