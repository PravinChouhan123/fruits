
package Bhupendra;

import java.io.FileReader;
import java.io.FileWriter;


public class Filehandlig {
    public static void main(String[] args)throws  Exception {
        
    
    String str = "pravin chouhan";
    FileWriter fw = new FileWriter("C:\\Users\\HP\\Desktop\\myo.txt");
    
     int ch;
         FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\myo.txt");
       while((ch=fr.read())!=-1)
       
         System.out.print((char)ch);  
               System.out.println("read");
             
        
       
    fw.write(str);
    fw.close();
    //fr.close();
    
    
}
}
