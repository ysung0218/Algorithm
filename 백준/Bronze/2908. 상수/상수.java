import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int result1 = 0;
        int result2 = 0;
        
        while(A != 0) {
        	result1 = result1 * 10 + A % 10;
        	A /= 10;
        }
        
        while(B != 0) {
        	result2 = result2 * 10 + B % 10;
        	B /= 10;
        }
        
        if(result1 > result2) {
        	System.out.println(result1);
        } else {
        	System.out.println(result2);
        }
        
        sc.close();
    }
}