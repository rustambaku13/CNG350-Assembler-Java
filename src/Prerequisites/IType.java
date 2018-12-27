package Prerequisites;

public class IType extends Type {
    public  IType(){
        format.put("op",6);
        format.put("rs",5);
        format.put("rt",5);
        format.put("const",16);
    }
    public IType(String [] parts){
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
