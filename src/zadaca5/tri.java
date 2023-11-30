
package zadaca5;
import java.util.Scanner;
public class tri {

		    public static void main(String[] args) {
		        Scanner tastatura= new Scanner(System.in);

		        System.out.print("Внеси вредност за 'm': ");
		        int m = tastatura.nextInt();

		        System.out.print(" 'n': ");
		        int n = tastatura.nextInt();

		        int count = 0;  
		        int sum = 0;    

		        System.out.println("Броеви деливи со три во интервалот [" + m + ", " + n + "]:");
		        
		        for (int i = m; i <= n; i++) {
		            if (i % 3 == 0) {
		                count++;    
		                sum += i;     
		                System.out.println(i);
		            }
		        }

		        System.out.println("Броеви деливи со три има: " + count);
		        System.out.println("Сума на броевите кои се деливи со три: " + sum);
		    }
		}

