import java.util.Scanner;
// (n+1)-i
public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니의 개수
        int M = sc.nextInt(); // 뒤집기 연산의 개수

        int[] baskets = new int[N + 1]; // 인덱스 1부터 사용하기 위해 N+1 크기의 배열 생성

        // 바구니에 초기 순서 설정
        for (int i = 1; i <= N; i++) {
            baskets[i] = i;
        }

        // 뒤집기 연산 수행
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            // start부터 end까지 바구니를 뒤집는 과정
            while (start < end) {
                int temp = baskets[start];
                baskets[start] = baskets[end];
                baskets[end] = temp;
                start++;
                end--;
            }
        }

        // 바구니의 최종 순서 출력
        for (int i = 1; i <= N; i++) {
            System.out.print(baskets[i] + " ");
        }

        sc.close();
        
    }
}