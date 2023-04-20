
/**
    Ein Palindrom ist eine Folge von int-Werten, die vorwärts 
    und rückwärts gelesen die identische Ziffernfolge ergibt. 
    Beispiele: Die Folgen 12 34 78 34 12 oder 5 17 88 88 17 5 sind Palindrome.
    
    Schreibe die Methode boolean checkArray( int[] arr ), 
    die für das als Parameter übergebene Feld bestimmt, ob die Folge der 
    Zahlen ein Palindrom bildet. Die Methode gibt einen Wert des Typs boolean zurück.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Palindrom
{
    public static boolean isPalindrome(int[] arr){

        for (int i = 0; i <= arr.length / 2; i++){
            if (arr[i] != arr[arr.length - i - 1]){
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
        System.out.println("Is palindrome : " + isPalindrome(numbers));
    }
}
