import java.util.Arrays;
import java.util.Scanner;

public class GameOfLife
{
    int[][] population;
    
    public GameOfLife( int n ){
        
        System.out.println("Constructor initiated ");
        System.out.println("Matrix dim: " + n);
        this.population = new int[n][n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix: ");
            
        for ( int i = 0; i < n; i++ ) {
            
            String line = scanner.nextLine();
            String[] elements = line.split("\\s+");
            
            for (int j = 0; j < n; j++) {
                this.population[i][j] = Integer.parseInt(elements[j]); 
            }
        }
        
        scanner.close();    
    }
    
    	private int calculateAliveNeighbors( int i, int j ) {
		int neighbors = 0;
		int left = j - 1;
		int up = i - 1;
		int right = j + 1;
		int down = i + 1;
		if ( left >= 0 ) {
		    //will check the three left neighbors
        		neighbors += this.population[i][left];
			if ( up >= 0 ) {
				neighbors += this.population[up][left];
			}
			if ( down < this.population.length ) {
				neighbors += this.population[down][left];
			}
		}
		if ( right < this.population.length ) {
		    //will check the three right neighbors
			neighbors += this.population[i][right];
			if ( up >= 0 ) {
				neighbors += this.population[up][right];
			}
			if( down < this.population.length ) {
				neighbors += this.population[down][right];
			}
		}
		if ( up >= 0 ) {
		    //checks the cell above
			neighbors += this.population[up][j];
		}
		if ( down < this.population.length ) {
		    //checks the cell below
			neighbors += this.population[down][j];
		}
		return neighbors;
		//returns the amount of neighbors
	}
    
   
   public int nextState( int i, int j ) {
       
	int neighbors;

	for(int k = 0; k < this.population.length; k++ ) {
	    
        	for (int l = 0; l < this.population.length; l++ ) {
        	    
        		neighbors = 0;
			neighbors = calculateAliveNeighbors( i, j );
			
			if ( this.population[i][j] == 1 ) {
			    
				if ( neighbors == 2 || neighbors == 3 )
					return 1;
					
				if ( neighbors < 2 || neighbors > 3 )
					return 0;
				} else if ( this.population[i][j] == 0 ) {
				    
        				if ( neighbors == 3 )
        				
        					return 1;
				}
			}

		}
	return 0;
	}

	
    public void nextGeneration() {

        for ( int i = 0; i < this.population.length; i++ ){
            
            for ( int j = 0; j < this.population.length; j++ ){
                
                this.population[i][j] = nextState( i, j );
            }
        }
        
    }
    
    public void futureGeneration( int n ) {
        
        for ( int i = 0; i < n; i++ ){
            nextGeneration();
        }
    }
    
    public void show() {
        
        System.out.println("Elements of the array are: ");  
        
        for ( int i = 0; i < this.population.length; i++ ){ 
            
            for ( int j = 0; j < this.population.length; j++ )   
 
                System.out.print( this.population[i][j] + " " );   
                System.out.println();   
        }   
    }
}
