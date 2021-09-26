import java.util.Scanner;

public class Home{
    public static Scanner sc = new Scanner(System.in);
    public static long Fibonacy(long n){
        long after=1;
        long before=0;
        long tmp;
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        
        for(int i =0; i < n; i ++) {
            tmp = after;
            after = after+ before;
            before= tmp;
        }   
        return after;   
    }
    public static void main (String[] args) {
        long n = sc.nextLong();
        System.out.println(Fibonacy(n));
    }
}