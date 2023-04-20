/*
 * Programmieren Sie eine Methode double computeEuler( int n ), 
 * die die Eulersche Zahl e = 2,71... berechnet. Die
Berechnung soll nach der Addition des n-ten Summenglieds 
abbrechen und die berechnete Summe zurückgeben.
 */
import java.util.Scanner;

public class EulerscheZahl
{
    public static double computeEuler(int n){
        double e = 1;
        double fakultaet = 1;
        for (int i = 1; i <= n; i++){
            fakultaet *= i;
            e += 1 / (fakultaet);
            
        }
        return e;
    }
    
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zahl n : ");
        int n = scanner.nextInt();
        System.out.println("e ~ " + computeEuler(n));
    
        scanner.close();}
}
