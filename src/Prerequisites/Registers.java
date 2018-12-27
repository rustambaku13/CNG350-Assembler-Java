package Prerequisites;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Registers {
    private HashMap <String,Integer> registers;
    public Registers(String filename) throws FileNotFoundException {
        registers = new HashMap <String,Integer>();
        FileReader file = new FileReader(filename);
        loadFile(file);

    }
    public int retrieve(String r){
        return registers.getOrDefault(r,-1);
    }

    public void loadFile(FileReader file){
        int i=0;
        Scanner a = new Scanner(file);
        a.reset();
        String line =null;
        while(a.hasNextLine()){
            if((line = a.nextLine()).matches("^\\$[a-zA-Z0-9]+$")){
                registers.put(line,i);
                i++;
            }
        }
        a.close();
    }


}
