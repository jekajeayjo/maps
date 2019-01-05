/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author User
 */
public class linkedhashmap {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         long startTime = System.nanoTime(); 
 
        Random r1=new Random(3);
        Random r2=new Random(3);
    LinkedHashMap sm=new LinkedHashMap<Integer, Double>(); 
    for (int i=0;i<1000;i++)
        {
        sm.put(r1.nextInt(),new Double(r2.nextDouble()));
        }
          Set<Map.Entry<Integer,Double>> set=sm.entrySet();
        for (Map.Entry<Integer,Double>me:set)
        {
        System.out.print(me.getKey()+":");
        System.out.println(me.getValue());
        
        }
        sm.put(12, 13);
              System.out.println(sm.get(12)+" go delete");
        System.out.println(sm.remove(12)+"delete");
        startTime = System.nanoTime(); 
        System.out.println("time "+startTime);
    }
    
}
