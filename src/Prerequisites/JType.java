package Prerequisites;

public class JType extends Type {
    public  JType(){
        format.put("op",6);
        format.put("const",26);
    }
    public JType(String [] parts){
        this();
        if(parts.length!=3){
            throw new IllegalArgumentException();
        }
        name = parts[1];
        fieldLength(parts[2],format.get("op"));
        format.replace("op",Integer.parseInt(parts[2],16));
    }
    public void decode(String [] line){

    }
}
