public class Period
{
    int MINUTES;
    
    public Period(int minutes){
        
        if (minutes >= 0){
            this.MINUTES = minutes;
        } else {
            this.MINUTES = 0;
        }
        
    }
    
    public Period(int minutes, int hours){
        
        if (minutes >= 0 & hours >= 0){
            this.MINUTES = minutes + hours * 60;
        } else {
            this.MINUTES = 0;
        }
        
    }
    
    public int getMinutes(){
        
        return this.MINUTES;
        
    }
    
    public int getHours(){
        
        return this.MINUTES / 60;
        
    }
    
    public int getMinorMinutes(){
        
        return this.MINUTES % 60;
        
    }
    
    public String toString(){
        
        String hours;
        String minutes;
        
        if (getHours() < 10){
            hours = "0" + String.valueOf(getHours());
        } else {
            hours = String.valueOf(getHours());
        }
        
        if (getMinutes() < 10){
            minutes = "0" + String.valueOf(getMinutes());
        } else {
            minutes = String.valueOf(getMinorMinutes());
        }
        
        return hours + ":" + minutes;
    }
}
