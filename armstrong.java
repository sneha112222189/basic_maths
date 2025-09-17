class Armstrong {
    void show(int n){
        int num=n;
        int x=0;
        while(n>0){
            int temp = n%10;
            x = x+(temp*temp*temp);
            n=n/10;
        }
        System.out.println("cube of individual digits of "+num+" is: "+x);
        if(num==x){
            System.out.println("NUMBER IS ARMSTRONG");
        }
        else{
            System.out.println("NUMBER IS NOT ARMSTRONG");
        }
    }
}

class Main{
    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        a.show(15);
    }
}
