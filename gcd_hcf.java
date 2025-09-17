import java.lang.Math;
import java.util.TreeSet;

//USUAL METHOD
//TIME COMPLEXITY = O[min(n1,n2)]
class gcd {
    void show(int n1, int n2){
        TreeSet<Integer> t = new TreeSet<>();
        int gcd=1;
        int x = Math.min(n1,n2);
        for(int i=1;i<=x;i++){
            if(n1%i==0 && n2%i==0){
                t.add(i);
                gcd=i;
            }
        }
        System.out.println("Factors of the two numbers are: "+t);
        System.out.println("GCD of two numbers is: "+gcd);
    }
}

// EUCLIDEAN ALGORITHM : gcd(n1,n2) = gcd(n1-n2,n2)  [for n1>n2]
// EFFICIENT WAY : gcd(n1,n2) = gcd(n1%n2,n2)  [for n1>n2]
//TIME COMPLEXITY : O[log(base phi)(min(n1,n2))]      {:/phi because n1 and n2 are fluctuating frequently}
class Euclidean{         
    int gcd=1;           //
    void show(int n1,int n2){
        while(n1>0 && n2>0){
            if(n1>n2) n1=n1%n2;
            else n2=n2%n1;
        }
        if(n1==0) gcd=n2;
        else gcd=n1;
        System.out.println("GCD od two numbers is: "+gcd);
    }
}

class Main{
    public static void main(String[] args) {
        gcd g = new gcd();
        Euclidean e = new Euclidean();
        g.show(12,9);
        e.show(52,12);
    }
}
