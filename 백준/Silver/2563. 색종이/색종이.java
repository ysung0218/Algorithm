import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean[][] area = new boolean[100][100];
        
        int paper = sc.nextInt();
        int result = 0;
        
        for(int i = 0; i < paper; i++) {
        	int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int j = x; j < x+10; j++) {
            	for(int k = y; k < y+10; k++) {
            		if(area[j][k] == false) {
            			area[j][k] = true;
            			result++;
            		}
            	}
            }
        }
        System.out.println(result);

        sc.close();
    }
}