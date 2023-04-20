import java.util.Scanner;

public class PeriodName
{
    public static void main(){
        
        Period period1 = new Period(20);
        Period period2 = new Period(20, 1);
        
        System.out.println("period1 minuten: " + period1.getMinutes());
        System.out.println("period2 minuten: " + period2.getMinutes());
        
        System.out.println("period1 hours: " + period1.getHours());
        System.out.println("period2 hours: " + period2.getHours());
        
        System.out.println(" period1 minor minutes: " + period1.getMinorMinutes());
        System.out.println(" period2 minor minutes: " + period2.getMinorMinutes());
        
        System.out.println("period1 hh:mm" + period1.toString());
        System.out.println("period2 hh:mm" + period2.toString());
    }
}
