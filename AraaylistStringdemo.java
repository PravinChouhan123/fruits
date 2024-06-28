
package Collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class AraaylistStringdemo {
    
    public static void main(String[] args) {
        
        ArrayList<String> city = new ArrayList<>();
        
        city.add("mundi");
        city.add("khandwa");
        city.add("burhanpur");
        city.add("betul");
        city.add("badnagr");
        city.add("bhopal");
        city.add("rivani");
        city.add("badwani");
        
        System.out.println(city);
         ListIterator li = city.listIterator(); {
       while(li.hasNext())
           
       {
            String B =   (String) li.next();
            if (B.startsWith("b")) {
                li.remove();
            }
        }

            //System.out.println(li.next());
       //li.remove();
       // System.out.println(li.next());
       System.out.println(city);
                ListIterator lic = city.listIterator(); {

         while(lic.hasNext())
            System.out.println(lic.next());
      // li.remove();
      
         }
    }
    
}
}
