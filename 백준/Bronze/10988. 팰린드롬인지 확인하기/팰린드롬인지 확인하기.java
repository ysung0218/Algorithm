import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String str2 = "";
              
        for(int j = str.length()-1; j >= 0; j--) {
        	str2 += Character.toString(str.charAt(j));
        }
        
        if(str.equals(str2)) {
        	System.out.println(1);
        } else {
        	System.out.println(0);
        }
        
        sc.close();
    }
}