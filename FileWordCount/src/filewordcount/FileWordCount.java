/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewordcount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Naveen
 */
public class FileWordCount {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
       BufferedReader br=null;
       String line;
       
       System.out.println("Enter the file name");
       try
       {
           br = new BufferedReader(new FileReader("C:\\Users\\Naveen\\Desktop\\Dextro\\Assignments\\" + sc.next())); 
       }
       catch (Exception ex)
       {
           System.out.println(ex);
           System.out.println("File not Found");
           System.exit(0);
       }
       
       System.out.println("Enter the word to be searched ");
       String word= sc.next();
       
       int k=0;
       while((line = br.readLine())!=null)
       {
           String stringLineSplit[];
           String stringSpaceSplit[];
           stringLineSplit=line.split("\\n");
          
           int count=0,i=0;
           k++;
           for(String c:stringLineSplit)
           { 
               int j=0;
               stringSpaceSplit=stringLineSplit[i].split(" ");
              
               for(String a:stringSpaceSplit)
               {
                   if(stringSpaceSplit[j].equals(word))
                    {                   
                        count++;
                    }
               j++;   
               }
              System.out.println("The Word '" +word+ "' occured '"+count+ "' times in Row " +k);
           }
        }
       br.close();
    }
    
}
