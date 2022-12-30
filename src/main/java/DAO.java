package main.java;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DAO {
    public static List<String> readAll(String targetFile){
        try (Stream<String> lines = Files.lines(Path.of(targetFile))){  
            return lines.collect(Collectors.toList());
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public static void append(String line, String targetFile){
        try {
            Files.writeString(Paths.get(targetFile), line+"\n", StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        }   
        catch (IOException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void rewrite(String line, String targetFile){
        Path path = Paths.get(targetFile);

        try {
            Files.delete(path);
            Files.createFile(path);
            Files.writeString(Paths.get(targetFile), line+"\n", StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        }   
        catch (IOException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void rewrite(List<String> lines, String targetFile){
        Path path = Paths.get(targetFile);
        
        try {
            Files.delete(path);
            Files.createFile(path);
            lines.forEach(line -> {
                try {
                    Files.writeString(Paths.get(targetFile), line +"\n", StandardCharsets.UTF_8, StandardOpenOption.APPEND);
                } catch (IOException ex) {
                    Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        }   
        catch (IOException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void clear(String targetFile){
        try {
            Path path = Paths.get(targetFile);
            Files.delete(Paths.get(targetFile));
            Files.createFile(path);
        } catch (IOException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
