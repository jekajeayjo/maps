/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import static java.lang.reflect.Array.set;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author User
 */
public class tree {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         long startTime = System.nanoTime(); 
        HashMap<Integer, Double>hm=new HashMap<Integer, Double>();
        Random r1=new Random();
        Random r2=new Random();
    TreeMap <Integer, Double>tm=new TreeMap<Integer, Double>();
   Set<Map.Entry<Integer,Double>> set=hm.entrySet();
        for (int k=0;k<100000;k++)
        {
        tm.put(r1.nextInt(),new Double(r2.nextDouble()));
        }
        for (Map.Entry<Integer,Double>me:set)
        {
        System.out.print(me.getKey()+"t:");
        System.out.println(me.getValue());
        }
         startTime = System.nanoTime(); 
        System.out.println("time "+startTime);
         System.out.println("---------------------");

    }
    
}
