import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 1;
        
        for(int i = 0; i < str.length(); i++) {
        	char c = str.charAt(i);
        	if(i != 0 && i != str.length()-1 && c == ' ') {
        		count++;
        	} else if(c == ' ' && str.length() == 1) {
        		count = 0;
        	}
        }
        
        System.out.println(count);

        sc.close();
        
    }
}