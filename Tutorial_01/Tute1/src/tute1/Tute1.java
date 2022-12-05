/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tute1;

/**
 *
 * @author Sam
 */
public class Tute1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numbers[] = new int[6];
       for(int i=0;i<numbers.length;i++)
           setRandom(numbers,i);
       
       for(int number: numbers)
            System.out.println(number);
      
    }
    
    public static boolean isExist(int[] arr,int value)
    {
        for(int number:arr)
        {
            if(number==value)
                return true;
        }
        return false;
    }
    
    public static void setRandom(int[] arr, int index)
    {
        boolean set = false;
        while (set==false)
           
        {
            int value = (int)Math.round(Math.random()*49);
            if(isExist(arr,value)==false)
            {
                arr[index]=value;
                set = true;
            }
        }
         
    
    }
    
}
