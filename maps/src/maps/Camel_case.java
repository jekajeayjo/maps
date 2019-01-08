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
        int diapazon=25,randomNum;
        String keyHash="";
        long in;
       long startTime = System.nanoTime(); 
       long forCreate,forSearch,forDelete;
       String string="abcdefghijklmnopqrstuvwxyz";
        HashMap<String, Double>hashMap=new HashMap<String, Double>();
        Random r1=new Random();
        Random r2=new Random();
        
        for (int i=0;i<100000;i++)
        {
            for (int k=0;k<10;k++)
            {
            randomNum=(int)(Math.random()*diapazon);
            keyHash+=string.charAt(randomNum);
            }
            // System.out.println(" element "+keyHash);
       hashMap.put(keyHash,new Double(r2.nextDouble()));
       keyHash="";
        }
        Set<Map.Entry<String,Double>> keySet=hashMap.entrySet();
        System.out.println();
         forCreate=System.nanoTime();
         System.out.println("created Hash");
         
        for (Map.Entry<String,Double>element:keySet)
        {
        System.out.print(element.getKey()+":");
        System.out.println(element.getValue());
        }
        forCreate=System.nanoTime();
        
//         startTime=System.nanoTime();
//        for (Map.Entry<String,Double>me:keySet)
//        {
//            in=me.getKey();
//            System.out.println("");
//           
//        if (in%2==0)
//        {
//            System.out.println("delete---"+in);
//            //System.out.println(hashMap.get(me));
//            hashMap.remove(me);
//        }
//        }
      
//        forDelete=System.nanoTime()-startTime;
//       
//       System.out.println("all deleted");
//        startTime = System.nanoTime(); 
//       hashMap.get(283176718);  
//        forSearch = System.nanoTime()-startTime; 
//        System.out.println("time of work "+startTime+", time of create "+forCreate+", time for delete "+forDelete+", ");
//        System.out.print("time of search "+forSearch+"\n");
//        System.out.println("---------------------");
       
        
        
    }
    
}
