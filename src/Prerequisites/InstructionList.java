package Prerequisites;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class InstructionList  {
    private ArrayList <Type> instructions;
    public InstructionList(){
        instructions = new ArrayList<Type>();

    }
    public InstructionList(String filename) throws FileNotFoundException {
        this();
        FileReader file = new FileReader(filename);
        loadFile(file);

    }
    public void addInstruction(String x){
        Type r =null;
      try {
          if(x.matches("(^R,)(.*)")){
              r = new RType(x.split(","));

          }
          else if(x.matches("(^I,)(.*)")){
              r = new IType(x.split(","));
          }
          else if(x.matches("(^J,)(.*)")){
              r = new JType(x.split(","));
          }
      }catch(NumberFormatException a){
          System.out.println("Instruction number format is wrong for instruction:"+x);
      }catch(IllegalArgumentException a){
          System.out.println("Not enoguh arguments for instruction:"+x);
      }
      instructions.add(r);
    }

    public void loadFile(FileReader a){
        Scanner file = new Scanner(a);
        String line;
        while(file.hasNextLine()){
            line = file.nextLine();
            addInstruction(line);
        }

    }
}
