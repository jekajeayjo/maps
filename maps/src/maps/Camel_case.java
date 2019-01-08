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
        String keyHash="",in="";
        boolean searchKey;
        long startTime = System.nanoTime(); 
        long forCreate,forSearch,forSearchtree,forSearchlink,forDelete,forDeletelink,forDeletetree;
        final  String string="abcdefghijklmnopqrstuvwxyz";
        HashMap<String, Double>hashMap=new HashMap<String, Double>();
         TreeMap <String, Double>treeMap=new TreeMap<String, Double>();
         LinkedHashMap <String, Double>  linkedHash=new LinkedHashMap<String, Double>();
        Random r2=new Random();
        //put elements to hashMap
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
         Set<Map.Entry<String,Double>> keySettree=treeMap.entrySet();
         Set<Map.Entry<String,Double>> keySetlink=linkedHash.entrySet();
        System.out.println();
         forCreate=System.nanoTime();
         System.out.println("created Hash");
        for (Map.Entry<String,Double>element:keySet)
        {
        System.out.print(element.getKey()+":");
        System.out.println(element.getValue());
        }
        //create a treemap and linkedhashmap
        
        for (Map.Entry<String,Double>element:keySet)
        {
//        System.out.print(element.getKey()+":");
//        System.out.println(element.getValue());
        linkedHash.put(element.getKey(), element.getValue());
        treeMap.put(element.getKey(), element.getValue());
        
        }
       
        System.out.println("created Treemap and LinkedHashMap");
       
        startTime=System.nanoTime();
        //delete from hashmap
        for (Map.Entry<String,Double>me:keySet)
        {
            in=me.getKey();
            if (in.contains("yie"))
        {
            System.out.println("key "+in);
            System.out.println("delete---"+keyHash);
            //System.out.println(hashMap.get(me));
            hashMap.remove(me);
        }
        }
        forDelete=System.nanoTime()-startTime;
          startTime=System.nanoTime();
      //delete from treemap
       for (Map.Entry<String,Double>me:keySettree)
        {
            in=me.getKey();
        //    System.out.println("key "+keySet);
        if (in.contains("yie"))
        {
            System.out.println("key "+in);
            System.out.println("delete---"+keyHash);
            //System.out.println(hashMap.get(me));
            hashMap.remove(me);
        }
        }
       forDeletetree=System.nanoTime()-startTime;
       startTime=System.nanoTime();
       //delete from linkhash
       for (Map.Entry<String,Double>me:keySetlink)
        {
            in=me.getKey();
        //    System.out.println("key "+keySet);
        if (in.contains("yie"))
        {
            System.out.println("key "+in);
            System.out.println("delete---"+keyHash);
            //System.out.println(hashMap.get(me));
            hashMap.remove(me);
        }
        }
        forDeletelink=System.nanoTime()-startTime;
        System.out.println("all deleted");
        startTime = System.nanoTime(); 
        //search  in hashMap
        System.out.println("finded "+hashMap.get("tiqocvvbjb"));
        forSearch = System.nanoTime()-startTime; 
         //search  in TreeMap
        startTime = System.nanoTime();
         System.out.println("finded "+treeMap.get("tiqocvvbjb"));
        forSearchtree = System.nanoTime()-startTime; 
        //search in link
         startTime = System.nanoTime();
         System.out.println("finded "+linkedHash.get("tiqocvvbjb"));
        forSearchlink = System.nanoTime()-startTime; 
        System.out.println("time of work of HashMap"+startTime+", time of create "+forCreate+", time for delete "+forDelete+", ");
        System.out.print("time of search "+forSearch+"\n");
        System.out.println("---------------------");
        System.out.println(" time for delete of treemap "+forDeletetree+", ");
        System.out.print("time of search of tree "+forSearchtree+"\n");
        System.out.println("---------------------");
         System.out.println(" time for delete of linkhash "+forDeletelink+", ");
        System.out.print("time of search of linkhash "+forSearchlink+"\n");
        System.out.println("---------------------");
        
        
    }
    
}
