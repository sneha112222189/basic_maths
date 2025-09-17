//program to count the number of digits

class Digit1 {
    void show(int n){
        int x=0;
        while(n>0){
            n=n/10;
            x++;
        }
        System.out.println("number of digits are:"+x);
    }
    //Time complexity = O(log10(n))  [no. of times the loops gets divided by 10]

}

class Main{
    public static void main(String []args){
        Digit1 d = new Digit1();
        d.show(1122);
    }
}
