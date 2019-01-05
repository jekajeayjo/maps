/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author User
 */
public class Camel_case {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long in;
       long startTime = System.nanoTime(); 
       long forCreate,forSearch,forDelete;
        HashMap<Integer, Double>hashMap=new HashMap<Integer, Double>();
        Random r1=new Random();
        Random r2=new Random();
        
        for (int i=0;i<100000;i++)
        {
       hashMap.put(r1.nextInt(),new Double(r2.nextDouble()));
        }
        Set<Map.Entry<Integer,Double>> keySet=hashMap.entrySet();
        System.out.println();
         forCreate=System.nanoTime();
         System.out.println("created Hash");
        for (Map.Entry<Integer,Double>element:keySet)
        {
        System.out.print(element.getKey()+":");
        System.out.println(element.getValue());
        }
        forCreate=System.nanoTime();
        
       
        for (Map.Entry<Integer,Double>me:keySet)
        {
            in=me.getKey();
            System.out.println("");
           
        if (in%2==0)
        {
            System.out.println("delete---"+in);
            //System.out.println(hashMap.get(me));
            hashMap.remove(me);
        }
        }
        forDelete=System.nanoTime()-forCreate;
       
       System.out.println("all deleted");
       hashMap.get(283176718);
       startTime = System.nanoTime(); 
        forSearch = System.nanoTime()-startTime; 
        System.out.println("time of work "+startTime+", time of create "+forCreate+", time for delete "+forDelete+", ");
        System.out.print("time of search "+forSearch);
        System.out.println("---------------------");
       
        
        
    }
    
}
