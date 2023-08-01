import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        
        for(int i = 1; i <= test; i++) {
        	String ox = sc.next();
        	int count = 0;
        	int sum = 0;
        	
        	for(int k = 0; k < ox.length(); k++) {
        		char c = ox.charAt(k);
        		if(c == 'O') {
        			count++;
        			sum += count;
        		} else {
        			count = 0;
        		}
        	}
        	System.out.println(sum);
        }

	    sc.close();
        
    }
}