import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
         
        int N = sc.nextInt();    // 바구니의 개수
        int M = sc.nextInt();    // 공을 넣는 횟수
        int[] basket = new int[N];
        
        for(int p = 1; p <= M; p++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            for(int q = i-1; q < j; q++){
                basket[q] = k;
            }            
        }  
        
        for(int i = 0; i < N; i++){
            System.out.print(basket[i] + " ");
        }
        
        

	    sc.close();
        
    }
}