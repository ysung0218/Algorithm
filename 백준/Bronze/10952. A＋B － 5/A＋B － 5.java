import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        while(true){
            int A = sc.nextInt();
            int B = sc. nextInt();
            
            if(A > 0){
                System.out.println(A+B);
            } else {
                break;
            }
        }

	    sc.close();
        
    }
}