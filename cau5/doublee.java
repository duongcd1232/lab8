package cau5;

/**
 *
 * @author Redmi
 */
public class Double {
    public float x;
    
    public Double(){
     }
     
    public Double(float x){
        this.x = x;
    }
    
    @Override
    public String toString(){
        return "    " + x;
    }
}