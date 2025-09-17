 class Reverse_number {
    void show(int n){
        int rev=0;
        while(n>0){
            int temp = n%10;
            rev=(rev*10)+temp;
            n=n/10;
        }
         System.out.print(rev);
    }
}

class Main{
    public static void main(String[] args) {
        Reverse_number r = new Reverse_number();
        r.show(647365);
    }
}