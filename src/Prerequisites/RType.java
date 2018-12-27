package Prerequisites;



public class RType extends Type{
    public  RType(){
        format.put("op",6);
        format.put("rs",5);
        format.put("rt",5);
        format.put("rd",5);
        format.put("shamt",5);
        format.put("funct",6);
    }
    public  RType(String [] parts){
        this();
        if(parts.length!=4){
            throw new IllegalArgumentException() ;
        }
        name = parts[1];
        fieldLength(parts[2],format.get("op"));
        fieldLength(parts[3],format.get("funct"));
        format.replace("op",Integer.parseInt(parts[2],16));
        format.replace("funct",Integer.parseInt(parts[3],16));
    }
    public void decode(String [] line){

    }
}

