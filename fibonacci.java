import java.util.Scanner;
/**
 *
 * @author Vidhikara
 */
public class fibonacci {

    public static void main(String[] args) {
            
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        for(int i=0;i<n;i++){
        res=fibonacci.fib(i);
        System.out.println("Fibonacci series "+res);
        sc.close();
    }
        
 }
    static int fib(int x){
        if(x<2)return x;
        else
            return(fib(x-1)+fib(x-2));
    }
    
}
