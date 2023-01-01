
public class Recursivo {
    
    public int mult(int n){
        if(n==1){
            return 1;
            
        }
        else {
            mult(n);
        }
        return 0;
      
    }
}
