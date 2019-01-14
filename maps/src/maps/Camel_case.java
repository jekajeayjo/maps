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
    public void delete() {
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Cases colection = new Cases();
        long startTime = System.nanoTime();
        long descryptiontime;
        HashMap<String, Double> hashMap = new HashMap<String, Double>();
        TreeMap<String, Double> treeMap = new TreeMap<String, Double>();
        LinkedHashMap<String, Double> linkedHash = new LinkedHashMap<String, Double>();
        Random r2 = new Random();
        //put elements to hashMap
        colection.put(hashMap);
        treeMap.putAll(hashMap);
        linkedHash.putAll(hashMap);
       // colection.show(hashMap);
        System.out.println("created Treemap and LinkedHashMap");
        startTime = System.nanoTime();
        //delete from hashmap
        long testforDelete = colection.delete(hashMap);
        System.out.println(testforDelete+ "------------------------hashMap");
        testforDelete = colection.delete(linkedHash);
        System.out.println(testforDelete + "------------------------linkedhashMap");
        testforDelete = colection.delete(treeMap);
           System.out.println(testforDelete + "------------------------treeMap");
           System.out.println("process for Search");
           startTime=System.nanoTime();
           treeMap.get("yiqtrbmhnv");
           descryptiontime=System.nanoTime()-startTime;
           System.out.println("time for search of treemap="+descryptiontime);
            hashMap.get("yiqtrbmhnv");
           descryptiontime=System.nanoTime()-startTime;
           System.out.println("time for search of hashmap="+descryptiontime);
            linkedHash.get("yiqtrbmhnv");
           descryptiontime=System.nanoTime()-startTime;
           System.out.println("time for search of linkedHash="+descryptiontime);
    }
    
}
