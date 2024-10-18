import java.util.Scanner;

public class pattern {
    public static void SwapNum(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

    }
    public static int calcFact(int a){
        int fact = 1;
        if(a==0 || a==1){
            return 1;
        }
        else{
            for(int i = 2 ;i<=a;i++){
                fact = fact*i;
            }
        }
        return fact;
    }
    public static int binomialCalc(int n,int r){
        int n_fact = calcFact(n);
        int r_fact = calcFact(r);
        int n_r_fact = calcFact(n-r);
        int res = n_fact/(r_fact*n_r_fact);
        return res;
    }
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int a = sc.nextInt();
       int b = sc.nextInt();
     System.out.println( binomialCalc(a, b));

    }
    
}
