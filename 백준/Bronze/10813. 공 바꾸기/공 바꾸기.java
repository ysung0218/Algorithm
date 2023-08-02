import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);        
        int N = sc.nextInt();    // 바구니의 개수
        int M = sc.nextInt();    // 공을 바꾸는 횟수
        int[] basket = new int[N+1];    // N개의 바구니에 들어있는 공 번호의 배열
                                        // 0번째 바구니는 무시
        
        for(int q = 1; q <= N; q++) {
        	basket[q] = q;
        }
        
        
        for(int k = 1; k <= M; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            basket[0] = basket[i];
            basket[i] = basket[j];
            basket[j] = basket[0];
            }
    
        for(int p = 1; p <= N; p++){
            System.out.print(basket[p] + " ");
        }

	    sc.close();
        
    }
}