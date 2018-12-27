package com.company;

import Prerequisites.Registers;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try {
            Registers a = new Registers("registers.txt");
        }catch(FileNotFoundException x){
            x.printStackTrace();
        }
    }
}
