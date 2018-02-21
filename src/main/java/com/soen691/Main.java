package com.soen691;

import StaticChecker.FileParser;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        if (args == null){
            System.out.println("No arguments provided.");
        }

        for (String arg: args) {
            processPath(arg);
        }


    }

    private static void processPath(String path)
    {
        try{
            File file = new File(path);
            if(file.isDirectory()){
                processPath(path);
            }
            else{
                FileParser fp = new FileParser();
                fp.parseFile(path);
            }
        }
        catch (Exception e ){
            System.out.println(e.getStackTrace());
        }
    }
}
