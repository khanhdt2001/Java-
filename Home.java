import java.util.Scanner;

public class Home{
    public static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        int Arr[]= new int[100];
        int n = sc.nextInt();
        // System.out.print(n);
        Arr[0] =0;
        Arr[1] =1;
        Arr[2] =1;
        for(int i =3 ; i < n ; i ++) {
            Arr[i] = Arr[i-1] + Arr[i-2];
            System.out.println(Arr[i]);
        }
    }
}