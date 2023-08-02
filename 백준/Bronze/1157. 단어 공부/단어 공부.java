import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        str = str.toUpperCase();       
        
        int[] arr = new int[26];
        int tmp = 0;
        char result = ' ';
        
        for(int i = 0; i < str.length(); i++) {
        	char ch = str.charAt(i);
        	arr[ch - 'A']++;
        	
        	if(arr[ch-'A'] > tmp) {
        		tmp = arr[ch-'A'];
        		result = ch;
        	} else if(arr[ch-'A'] == tmp) {
        		result = '?';
        	}
        }
        
        System.out.println(result);
        
        sc.close();
    }
}