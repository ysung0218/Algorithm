import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        boolean[] submissions = new boolean[31]; 
        // 학생 번호는 1부터 30까지이므로 크기가 31인 배열 생성

        // 과제를 제출한 학생들의 번호를 입력받아서 배열에 표시
        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            submissions[num] = true;
        }

        // 제출하지 않은 학생들의 번호를 출력
        for (int i = 1; i <= 30; i++) {
            if (!submissions[i]) {
                System.out.println(i);
            }
        }

        sc.close();
        
    }
}