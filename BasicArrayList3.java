package basicarraylists3;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class BasicArraylists3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ArrayList<Integer> arrList = new ArrayList<>();
        Random r = new Random();
       
      
        
        
        do{
            Integer num = 10 + r.nextInt(89);
            arrList.add(num);
          
        }while(arrList.size() < 1000);
    
    
        
        
            
                System.out.println(arrList);
         
    }
 }
