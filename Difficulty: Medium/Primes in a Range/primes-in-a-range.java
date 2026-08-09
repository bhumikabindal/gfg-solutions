class Solution {
    public int[] getSieve(int n){
        int[] arr=new int[n];
        for(int i=2;i<n;i++){
            arr[i]=1;
            
        }
        for(int i=2;i*i<n;i++){
            if(arr[i]==1){
                for(int j=i*i;j<n;j=j+i){
                    arr[j]=0;
                    
                }
            }
        }
        return arr;
    }
    public List<Integer> primeRange(int l, int r) {
        // code here
        ArrayList <Integer> list=new ArrayList<>();
        int[] prime=new int[r+1];
        prime=getSieve(r+1);
        // prefix sum
        // int count=0;
        // for(int i=2;i<r+1;i++){
        //     count=count+prime[i];
        //     prime[i]=count;
        // }
        for(int i=l;i<=r;i++){
            if(prime[i]==1)list.add(i);
        }
   return list;
    }
}