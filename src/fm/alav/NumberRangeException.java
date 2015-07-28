package fm.alav;

/**
 *
 * @author Andrei
 * Made by NetBeands v8.0.2
 * Java v1.8_0_20
 * Date: 28/07/2015
 * Time: 14:45
 * Last changed: 
 */
public class NumberRangeException extends Exception {
    // VARIABLES
    //**************************************************************************
    private String msg = "The number is out of range.";
    
    // CONSTRUCTIONS
    //**************************************************************************
    public NumberRangeException(){
        Throwable ex = new Throwable(msg);
    }
    public NumberRangeException(String str){
        super(str);
    }
    public NumberRangeException(Throwable ex){
        super(ex);
        
    }
    public NumberRangeException(String str, Throwable ex){
        super(str, ex);
    }
}
