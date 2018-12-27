import Prerequisites.*;

import java.io.FileNotFoundException;

public class MIPS {
    private Registers reg;
    private InstructionList inst;
    public MIPS(String regfile,String instfile){
        try {
            reg = new Registers(regfile);
            inst = new InstructionList(instfile);
        }catch(FileNotFoundException file){
            System.out.println("The file has not been found");
            file.printStackTrace();
        }
    }

    public static void main(String [] args){
        MIPS mymips = new MIPS("registers.txt","instructions.txt");

    }
}
