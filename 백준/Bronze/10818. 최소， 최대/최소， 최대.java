import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = -1000000;
        int min = 1000000;
        
        // 배열 입력
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        
        // 최댓값 구하기
        for(int i = 0; i < N; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        
        // 최솟값 구하기
        for(int i = 0; i < N; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        System.out.println(min + " " + max);

	    sc.close();
        
    }
}