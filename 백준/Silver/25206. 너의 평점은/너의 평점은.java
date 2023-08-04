import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float avg = 0;
        float dbsco = 0;
        float alldb = 0;
        
        for(int i = 0; i < 20; i++) {
        	String clas = sc.next();
        	double db = sc.nextDouble();
        	String score = sc.next();
        
        	switch(score) {
        		case "A+": dbsco = 4.5f; break;
        		case "A0": dbsco = 4.0f; break;
        		case "B+": dbsco = 3.5f; break;
        		case "B0": dbsco = 3.0f; break;
        		case "C+": dbsco = 2.5f; break;
        		case "C0": dbsco = 2.0f; break;
        		case "D+": dbsco = 1.5f; break;
        		case "D0": dbsco = 1.0f; break;
        		case "F": dbsco = 0.0f; break;
        	}
        	
        	if(!score.equals("P")) {
        		avg += (db * dbsco);
        		alldb += db;
        	} else {
        		continue;
        	}
        	
        }
        
        System.out.println(avg/alldb);
        
        
        sc.close();
    }
}