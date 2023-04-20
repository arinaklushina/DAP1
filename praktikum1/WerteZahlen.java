/**
    Schreibe die Methode int countNegatives( int[] arr ), 
    die als Parameter ein Feld besitzt. Die Methode countNegatives 
    zählt die negativen Werte in diesem Feld und gibt den 
    ermittelten Wert zurück.
 */
import java.util.Arrays;
import java.util.Scanner;

public class WerteZahlen
{
    public static int sumUpNegatives( int[] sortedArr ){
        int i = 0;
        int count = 0;
        while (sortedArr[i] < 0){
            count += sortedArr[i];
            i++;
        }
        return count;
    }
    
    public static int countNegatives(int[] sortedArr){
        int i = 0;
        int count = 0;
        while (sortedArr[i] < 0){
            count += 1;
            i++;
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

        System.out.print("Das eingegebene Array lautet: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
        return numbers;
    }
    
    public static void main(String[] args) {
        int[] numbers = inputArray();

        // Sortieren des Arrays
        Arrays.sort(numbers);
        System.out.println("Sortiertes Array: ");

        // Ausgabe des sortierten Arrays
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println("Anzahl negativer Elemente: " + countNegatives(numbers));
        System.out.println("Summe negativer Elemente: " + sumUpNegatives(numbers));
    }
}
