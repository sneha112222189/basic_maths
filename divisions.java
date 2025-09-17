import java.lang.Math;
import java.util.TreeSet;

class Divisions1 {
   
    void show(int n){
        int temp=0;
        System.out.print("Total divisors of "+n+" are : ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                temp++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("total divisions = "+temp);
    }
}

class Division2{
    TreeSet<Integer> nums = new TreeSet<>();
    void show(int n){
        System.out.println("divisors of "+n+" are:");
        for(int i=1;i<=Math.sqrt(n);i++){   //or condition can be i*i<=n
            if(n%i==0){ 
                nums.add(i);
                if((n/i)!=i){ 
                    nums.add(n/i);
                }
            }
        }
       
        System.out.println(nums);
    }
}
class Main{
    public static void main(String[] args) {
        Divisions1 d1 = new Divisions1();
        Division2 d2 = new Division2();
        d1.show(22);
        d2.show(36);
    }
}
