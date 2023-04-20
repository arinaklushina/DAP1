/**
Eine natürliche Zahl heißt Harshad-Zahl, 
wenn Sie durch ihre Quersumme teilbar ist. 
 */

import java.lang.Math;
import java.util.Scanner;

public class Harshad
{
    public static int digitSum(int num){
        int quersum = 0;
        while (num != 0) {
            quersum += num % 10;
            num /= 10;
        }
        return quersum;
    }
    
    public static void isHarshad(int x){
        if ( x % digitSum(x) == 0 ) {
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    
    }
    
    // instance variables - replace the example below with your own
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zahl: ");
        int num = scanner.nextInt();
        int quersum = digitSum(num);
        System.out.println("Die Quersumme ist: " + quersum);

        
        isHarshad(num);
        scanner.close();

    }
}
