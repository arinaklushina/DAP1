public class HuffmanTriple
{
    private char token;
    private String code;
    private int quantity;
    
    public HuffmanTriple(char t, int q){
        this.token = t;
        this.code = "";
        this.quantity = q;
    }
    
    public HuffmanTriple(char t) {
        this(t, 1);
    }
    
    public HuffmanTriple() {
        this(' ', 0);
    }
    
    public char getToken() {
        return token;
    }
    
    public String getCode(){
        return code;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setCode(String c) {
        code = c;
    }
    
    public void incrementQuantity(){
        quantity++;
    }
    
    public int compareTo(HuffmanTriple other){
        return this.quantity - other.quantity;
    }
    
    public String toString() {
        return "token (quantity: " + quantity + "): " + token + " -> code: " + code ;
    }
}
