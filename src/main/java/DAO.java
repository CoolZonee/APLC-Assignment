
package main.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.List;




public class DAO {
    public static List<String> readAll(String targetFile){
        List<String> savedData = new ArrayList<>();
        try{  
            Scanner file = new Scanner(new File(targetFile));
            while (file.hasNextLine()){
                String line=file.nextLine();
                savedData.add(line);
            }
            file.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return savedData;
    }
    public static void append(String line, String targetFile){
        PrintWriter writer = null;
        try {
            File f = new File(targetFile);
            if (f.exists()) {
                writer = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));
                writer.println(line);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
    
    public static void rewrite(String line, String targetFile){
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File(targetFile));
            writer.println(line);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
    
    public static void rewrite(List<String> lines, String targetFile){
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File(targetFile));
            for (String line: lines) {
                writer.println(line);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
