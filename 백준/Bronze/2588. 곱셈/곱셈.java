import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int e = b % 10; 
        int d = ((b % 100) - e)/10;
        int c = (b - d*10 - e) / 100;
       
        
        
        System.out.println(a * e);
        System.out.println(a * d);
        System.out.println(a * c);
        System.out.println(a * b);

	    sc.close();
        
    }
}