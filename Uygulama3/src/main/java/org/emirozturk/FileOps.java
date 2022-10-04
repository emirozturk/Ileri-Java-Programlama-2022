package org.emirozturk;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class FileOps {
    public static Squad readFile(String filepath){
        try {
            var mapper = new ObjectMapper();
            return mapper.readValue(new File(filepath), Squad.class);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
    public static void writeFile(Squad squad,String filepath){
        try{
            var mapper = new ObjectMapper();
            mapper.writeValue(new File(filepath),squad);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
