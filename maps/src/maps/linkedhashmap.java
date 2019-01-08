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
 long forCreate,forSearch,forDelete;
  long in;
        Random r1=new Random(3);
        Random r2=new Random(3);
    LinkedHashMap linkedHash=new LinkedHashMap<Integer, Double>(); 
    for (int i=0;i<100000;i++)
        {
        linkedHash.put(r1.nextInt(),new Double(r2.nextDouble()));
        }
         startTime = System.nanoTime(); 
         forCreate=System.nanoTime()-startTime;
         
    Set<Map.Entry<Integer,Double>> keySet=linkedHash.entrySet();
        for (Map.Entry<Integer,Double>me:keySet)
        {
        System.out.print(me.getKey()+":");
        System.out.println(me.getValue());
        }
        startTime = System.nanoTime(); 
        System.out.println("linked hash map created "+startTime);
         for (Map.Entry<Integer,Double>me:keySet)
        {
            in=me.getKey();
            System.out.println("");       
        if (in%2==0)
        {
            System.out.println("delete---"+in);
            //System.out.println(hashMap.get(me));
            linkedHash.remove(me);
        }
        }
         forDelete=System.nanoTime()-startTime;
         startTime = System.nanoTime(); 
         linkedHash.get(1249241365);
         forSearch=System.nanoTime()-startTime;
         System.out.println("time of work "+startTime+", time of create "+forCreate+", time for delete "+forDelete+", ");
        System.out.print("time of search "+forSearch+"\n");
        System.out.println("---------------------");
    }
    
}
