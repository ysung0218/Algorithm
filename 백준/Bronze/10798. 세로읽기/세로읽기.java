import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] words = new String[5]; // 5개의 단어를 저장할 배열

        // 단어 입력받기
        for (int i = 0; i < 5; i++) {
            words[i] = sc.next();
        }

        // 세로로 읽어서 출력
        for (int i = 0; i < 15; i++) { // 단어의 최대 길이는 15
            for (int j = 0; j < 5; j++) {
                if (i < words[j].length()) {
                    System.out.print(words[j].charAt(i));
                }
            }
        }

        sc.close();
    }
}