import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'c' && i + 1 < input.length()) {
                char next = input.charAt(i + 1);
                if (next == '=' || next == '-') {
                    i++;
                }
            } else if (c == 'd' && i + 1 < input.length()) {
                char next = input.charAt(i + 1);
                if (next == '-') {
                    i++;
                } else if (next == 'z' && i + 2 < input.length() && input.charAt(i + 2) == '=') {
                    i += 2;
                }
            } else if ((c == 'l' || c == 'n') && i + 1 < input.length()) {
                char next = input.charAt(i + 1);
                if (next == 'j') {
                    i++;
                }
            } else if ((c == 's' || c == 'z') && i + 1 < input.length()) {
                char next = input.charAt(i + 1);
                if (next == '=') {
                    i++;
                }
            }

            count++;
        }

        System.out.println(count);
    }
}