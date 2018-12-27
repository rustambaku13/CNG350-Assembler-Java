package Prerequisites;
import java.util.HashMap;

public abstract class Type {
    protected String name;
    public  HashMap<String, Integer> format;
    abstract public void decode(String [] line);
    public  Type(){
        format = new HashMap<String, Integer>();
    }
    protected void fieldLength (String num,int cap)throws NumberFormatException{
        if(Integer.parseInt(num,16) > (Math.pow(2,cap)-1)){
            throw new NumberFormatException();
        }
    }

}

