
/**
    Schreibe die Methode boolean isSorted( int[] arr ), 
    die als Parameter ein Feld besitzt. Die Methode isSorted 
    soll true zurückgeben, falls die im Feld enthaltenen Werte 
    aufsteigend sortiert sind; sonst wird false zurückgegeben.
*/
import java.util.Arrays;
import java.util.Scanner;

public class IsSorted
{
    public static boolean isSorted(int[] arr){
        
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
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
        System.out.println("Is sorted : " + isSorted(numbers));
    }
}
