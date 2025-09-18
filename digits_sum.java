#sum of digits repeatedly until result has only one digit

  class Solution {
    public int addDigits(int num) {
        int sum=0;
        if(num<10){
            return num;
        }
        else{
        while(num>=10){
          sum=0;
        while(num>0){
            sum += num % 10;
            num /= 10; 
          }
          num = sum;
        }
      }
      return sum;
    }
}

class Main{
  public static void main(String[] args){
    Solution s = new Solution();
    s.addDigits(5342);
  }
}
