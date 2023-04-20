
public class Box
{
    private double HEIGHT, WIDTH, DEPTH;
    
    public Box(double height, double width, double depth){
        this.HEIGHT = height;
        this.WIDTH = width;
        this.DEPTH = depth;
    }
    
    public double getWidth(){
        return this.WIDTH;
    }
    
    public double getHeight(){
        return this.HEIGHT;
    }
    
    public double getDepth(){
        return this.DEPTH;
    }
    
    public double getVolumeSize(){
        return this.HEIGHT * this.WIDTH * this.DEPTH;
    }
    
    public double getAreaSize(){
        return this.DEPTH * this.WIDTH;
    }
    
    public double getEdgesLength(){
        return (this.DEPTH + this.WIDTH + this.HEIGHT) * 4;
    }
    
    public boolean isCube(){
        return (this.DEPTH == this.WIDTH) & (this.WIDTH == this.HEIGHT);
    }
    
    public int compareTo(Box other){
        if (this.getVolumeSize() > other.getVolumeSize()){
            return 1;
        } else if(this.getVolumeSize() == other.getVolumeSize()){
            return 0;
        }else{
            return -1;
        }
    }
    
    public boolean encloses(Box other){
        return other.WIDTH <= this.WIDTH & other.DEPTH <= this.DEPTH & other.HEIGHT <= this.HEIGHT;
    }
    
    
}
