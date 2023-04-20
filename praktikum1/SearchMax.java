
/**
    Schreibe die Methode int maximum( int[] arr ), die ein Feld
    als Parameter besitzt und die den größten Wert in diesem 
    Feld bestimmt und zurückgibt.
    Hinweis: Versuche, mit einem Durchlauf durch das Feld auszukommen.
 */
import java.util.Arrays;
import java.util.Scanner;

public class SearchMax
{
    public static int searchMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int elem : arr){
            if (elem > max){
                max = elem;
            }
        }
        
        return max;
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
        System.out.println("Größte Zahl: " + searchMax(numbers));
   }
}
