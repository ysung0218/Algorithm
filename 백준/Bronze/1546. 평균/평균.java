import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] score = new double[N+1];
        double max = 0;
        double sum = 0;
        
        for(int i = 1; i <= N; i++){
            score[i] = sc.nextInt();
        }
        
        for(int i = 1; i <= N; i++){
            if(score[i] > max){
                max = score[i];
            }
        }
        
        for(int i = 1; i <= N; i++){
            score[i] = (score[i] / max) * 100;
            sum += score[i];
        }
               
        double avg = sum/N;
        
        System.out.println(avg);

	    sc.close();
        
    }
}