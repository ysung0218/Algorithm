import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[][] arrA = new int[N][M];
		int[][] arrB = new int[N][M];
        
        for(int i = 0; i < N; i++) {
        	for(int k = 0; k < M; k++) {
        		arrA[i][k] = sc.nextInt();
        	}
        }
        
        for(int i = 0; i < N; i++) {
        	for(int k = 0; k < M; k++) {
        		arrB[i][k] = sc.nextInt();
        	}
        }
        
        for(int i = 0; i < N; i++) {
        	for(int k = 0; k < M; k++) {
        		System.out.print(arrA[i][k] + arrB[i][k] + " ");
        	}
        	System.out.println();
        }
                
        
        sc.close();
    }
}