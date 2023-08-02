import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[6];
        
        for(int i = 0; i < 6; i++) {
        	int chess = sc.nextInt();
        	arr[i] = chess;
        }
                
        int[] correct = {1, 1, 2, 2, 2, 8};
        int[] result = new int[6];
        
        for(int i = 0; i < 6; i++) {
        	result[i] = correct[i] - arr[i];
        	System.out.print(result[i] + " ");
        }
        
        sc.close();
    }
}