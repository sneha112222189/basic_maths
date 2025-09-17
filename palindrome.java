class Palindrome {
    int rev=0;
    int n;
    void show(int n){
        int x=n;;
        while(x>0){
            int temp = x%10;
            rev = (rev*10)+temp;
            x=x/10;
        }
    if(n==rev){
        System.out.println("Number is palindrome");
    }
    else{
        System.out.println("Number is not palindrome");
    }
}
}


class Main{
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.show(121);
    }
}
