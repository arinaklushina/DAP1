
/**
    Schreibe die Methode int countMaximum( int[] arr ), 
    die ein Feld von int-Werten als Parameter besitzt und die zählt,
    wie häufig der größte Wert vorkommt. Die ermittelte Anzahl wird zurückgegeben.
 */
import java.util.Arrays;
import java.util.Scanner;

public class CountMax
{
    public static int countMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int elem : arr){
            if (elem > max ){
                max = elem;
                count = 1;
            } else if (elem == max){
                count += 1;
            }
            
        }
        
        return count;
    }
    
    public static int[] inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Anzahl der Elemente ein: ");
        
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        
        System.out.printf("Geben Sie %d ganze Zahlen ein: ", n);
        
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
    
        System.out.println("Das eingegebene Array lautet: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    
        scanner.close();
        return numbers;
    }
    
    public static void main(){
        int[] numbers = inputArray();
        System.out.println("");
        System.out.println("Anzahl der größten Zahlen: " + countMax(numbers));
    }
}
