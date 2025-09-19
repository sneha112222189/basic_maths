class Solution {
    public boolean checkPerfectNumber(int num) {
        long n=num,sum=1;
        if(num<=1) return false;
        for(long i=2;i*i<=n;i++){
            if(n%i==0){ 
                sum=sum+i;
                if(n/i!=i) {
                  sum += n/i;
                }
            }
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
}
