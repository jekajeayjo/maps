/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author User
 */
public class Cases {

    final int diapazon = 25;
    int randomNum;
    String keyHash = "";
    String in;
    final String string = "abcdefghijklmnopqrstuvwxyz";
    Random r2 = new Random();

    void put(Map inputMap) {
        for (int i = 0; i < 1000000; i++) {
            for (int k = 0; k < 10; k++) {
                randomNum = (int) (Math.random() * diapazon);
                keyHash += string.charAt(randomNum);
            }
            // System.out.println(" element "+keyHash);
            inputMap.put(keyHash, new Double(r2.nextDouble()));
            keyHash = "";
        }
    }

    void show(Map inputMap) {
        Set<Map.Entry<String, Double>> keySet = inputMap.entrySet();
        for (Map.Entry<String, Double> element : keySet) {
            System.out.print(element.getKey() + ":");
            System.out.println(element.getValue());
        }
    }

    long delete(Map inputMap) {
        long startTime = System.nanoTime();
        Set<Map.Entry<String, Double>> keySet1 = inputMap.entrySet();

        for (Map.Entry<String, Double> me : keySet1) {
            System.out.println("");
            in = me.getKey();
            if (in.contains("yiqtrbmhnv")) {
                inputMap.remove(me);
            }
        }
        return System.nanoTime() - startTime;
    }
}
