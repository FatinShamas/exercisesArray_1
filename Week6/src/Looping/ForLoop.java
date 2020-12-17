package Looping;
import java.util.*;
public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=0; i <10; i++) {
		System.out.println("I LOVE PROGRAMMING!");
		
		
	}
		System.out.println("__________");
		System.out.println();
		
		
		for(int i=0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("__________");
		System.out.println();
				
		for(int i=0; i <= 10; i++) {
			System.out.println(i);
		
		}
		System.out.println("__________");
		System.out.println();
		
		int[] grades = {90, 100, 83, 98, 93};
		
		for (int i = 0; i < grades.length; i ++) {
			System.out.println(grades[i]);
		}
		System.out.println("__________");
		System.out.println();
		
        for (int i=0; i<10; i++) {
        	for (int j=9; j>0; j--) {
        		System.out.println(i+ " " +j);
        	}//loop of j
        }//loop of i
    	System.out.println("__________");
		System.out.println();
		
                int rows = 5;

                for(int i = rows; i >= 1; --i) {
                    for(int j = 1; j <= i; ++j) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            
	System.out.println("__________");
	System.out.println();
	
    int x = 5, k = 0;

    for(int i = 1; i <= x; ++i, k = 0) {
        for(int space = 1; space <= x - i; ++space) {
            System.out.print("  ");
        }

        while(k != 2 * i - 1) {
            System.out.print("* ");
            ++k;
        }

        System.out.println();
    }
    
System.out.println("__________");
System.out.println();
for (int i = 0; i < 5; i++) {
	for (int j = 0; j < 5 - i; j++) {
		System.out.print(" "); 
		} 
	for (int m = 0; m <= i; m++) { 
		System.out.print("* ");
		}
	    System.out.println();

}
    System.out.println("__________");
    System.out.println();
   

char last = 'E', alphabet = 'A';

for(int i = 1; i <= (last-'A'+1); ++i) {
    for(int j = 1; j <= i; ++j) {
        System.out.print(alphabet + " ");
    }
    ++alphabet;

    System.out.println();
}
	
	 
	} 

    
}
	



    
      


