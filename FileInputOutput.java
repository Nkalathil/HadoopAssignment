package fileinputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//import java.util.Scanner;

public class FileInputOutput {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
       Scanner sc= new Scanner(System.in);
       BufferedReader br=null;
       String line;
       String abc = null;
       
       System.out.println("Enter the file name");
       try
       {
           br = new BufferedReader(new FileReader("C:\\Users\\Naveen\\Desktop\\Dextro\\Assignments\\" + sc.next())); 
           //abc=sc.
       }
       catch (Exception ex)
       {
           System.out.println(ex);
           System.out.println("File not Found");
           System.exit(0);
       }
       
       System.out.println("Enter the word to be searched ");
       String word=sc.next();
       
      
        //System.out.println("file name" );
       
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
