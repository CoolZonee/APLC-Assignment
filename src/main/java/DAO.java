
package main.java;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.List;




public class DAO {
    public static List<String> readAll(String targetFile){
        List<String> savedData=new ArrayList<>();
        try{  
            Scanner file=new Scanner(new File(targetFile));
            while (file.hasNextLine()){
                String line=file.nextLine();
                savedData.add(line);
            }
        
        }catch(IOException e){
            e.printStackTrace();
        }
        return savedData;
    }
    public static void write( String line, String targetFile){
        try{
            PrintWriter write=new PrintWriter(new FileWriter(targetFile));
            write.println(line);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
