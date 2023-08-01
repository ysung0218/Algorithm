import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int index = 0;
        int count = 0;
        
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        
        for(int i = 0; i < 9; i++){
            count++;
            if(max <= arr[i]){
                max = arr[i];
                index = count;
            }
        }
        
        System.out.println(max);
        System.out.println(index);

	    sc.close();
        
    }
}