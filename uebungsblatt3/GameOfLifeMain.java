import java.util.Scanner;

public class GameOfLifeMain
{
    public static void main(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zahl n : ");
        int n = scanner.nextInt();
        
        GameOfLife game1 = new GameOfLife( n );
        
        System.out.println("Zahl i (row) : ");
        int i = scanner.nextInt();
        System.out.println("Zahl j (column): ");
        int j = scanner.nextInt();
        
        //game1.nextState( i, j );
        System.out.println( " Next state: " + game1.nextState( i, j ) );
        System.out.println("Show(): " );
        game1.show();
        
        System.out.println(" Now game 2" );
        GameOfLife game2 = new GameOfLife( n );
        
        game2.nextGeneration();
        System.out.println("Next gen");
        game2.show();
        
        System.out.println(" Now game 3" );
        GameOfLife game3 = new GameOfLife( n );
        
        System.out.println("Gen 10" );
        game3.futureGeneration( 10 );
        game3.show();
    }
}
