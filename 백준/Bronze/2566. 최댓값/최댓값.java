import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[10][10];
		
		int tmp = 0;
		int result1 = 0;
		int result2 = 0;
        
		for(int i = 1; i <= 9; i++) {
			
			for(int k = 1; k <= 9; k++) {
				arr[i][k] = sc.nextInt();
				
				if(arr[i][k] >= tmp) {
					tmp = arr[i][k];					
					result1 = i;
					result2 = k;
				}
			}
		}
        
        System.out.println(tmp);
        System.out.println(result1 + " " + result2);
        
        sc.close();
    }
}