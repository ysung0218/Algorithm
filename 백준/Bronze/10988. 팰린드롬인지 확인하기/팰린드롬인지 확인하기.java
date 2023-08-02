import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
              
        StringBuilder sb = new StringBuilder(str).reverse();
        
        if(str.equals(sb.toString())) {
        	System.out.println(1);
        } else {
        	System.out.println(0);
        }
        
        sc.close();
    }
}