/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

/**
 *
 * @author User
 */
public class randomString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diapazon=25,randomNum=0;
       
      String keyHash="";
          String string="abcdefghijklmnopqrstuvwxyz";
         
     
          for (int k=0;k<10;k++)
            {
            randomNum=(int)(Math.random()*diapazon);
            keyHash+=string.charAt(randomNum);
            System.out.println("index "+randomNum+" element "+keyHash);
            }
          System.out.println(keyHash);
    }
    
}
