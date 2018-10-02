package practice;

public class Ppa1 {


    public static void main(String[] args) {
        int r = 5,v=5;

        for(int i = 1; i <= r; ++i) {
        	int k=3;
        	for(int s=1;s<v;s++) {
        		System.out.print("-");
        	}
            for(int j = 1; j <= i; ++j) {
   
                System.out.print(k+" " );
                k--;
            	}
            System.out.println();
           v--;
        }
    }
}	
