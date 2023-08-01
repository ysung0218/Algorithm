import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        boolean[] isRemainderExist = new boolean[42]; // 0부터 41까지의 나머지의 존재 여부를 저장하는 배열

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int remainder = num % 42;
            isRemainderExist[remainder] = true; // 해당 나머지가 존재하는 것을 표시
        }

        int count = 0;
        for (int i = 0; i < 42; i++) {
            if (isRemainderExist[i]) {
                count++; // 해당 나머지가 존재하면 count 증가
            }
        }

        System.out.println(count);

        sc.close();
        
    }
}