import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int mul = (sc.nextInt() * sc.nextInt() * sc.nextInt());    
        
        String str = Integer.toString(mul);
        
        for(int i = 0; i < 10; i++) {
        	int count = 0;
        	for(int k = 0; k < str.length(); k++) {
        		if((str.charAt(k) - '0') == i) { // 17037300
        			count++;
        		}
        	}
        	System.out.println(count);
        }

	    sc.close();
        
    }
}