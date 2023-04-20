import java.util.Scanner;

public class BoxMain
{
    public static void main(){
        
        Box box = new Box(1, 1, 1);
        
        System.out.println("Width: " + box.getWidth());
        System.out.println("Volume: " + box.getVolumeSize());
        System.out.println("Edges length: " + box.getEdgesLength());
    }
}
