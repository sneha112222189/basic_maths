class Prime {
    void show(int n){
        int temp = 0;
        for(int i=2;i*i<=n;i++){   //condition is i<=sqrt(n)
            if(n%i==0){ 
                temp++;
                if((n/i)!=i){
                    temp++;
                }
                break;
            }
            else{
                continue;
            }
        }
        if(temp>0){
            System.out.println("The number "+n+" is not prime");
        }
        else{
            System.out.println("The number "+n+" is prime");
        }
    }
}

class Main{
public static void main(String []args){
    Prime p = new Prime();
    p.show(111);
}
}