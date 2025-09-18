# square root of any number

  class Solution{
    public int mySqrt(int x){
        if (x == 0 || x == 1) return x;
 
        long y = x, start = 1, end = x, ans = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;

            if ((long)mid * mid == x) return (int)(mid);
            else if ((long)mid * mid < x) {
                ans = mid;
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return (int)(ans);
    }
}
class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    s.mySqrt(10000);
  }
}
