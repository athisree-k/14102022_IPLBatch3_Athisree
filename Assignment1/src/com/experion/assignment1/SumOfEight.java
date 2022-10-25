package com.experion.assignment1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumOfEight {

	public static void main(String[] args) {
		
		 printPairs(getRandomArray(10), 8);
	     printPairs(getRandomArray(8), 8);
		
		// TODO Auto-generated method stub

	}

	public static void printPairs(int[] randomArray, int givenSum) 
    { 
        System.out.println("Given Array: " + Arrays.toString(randomArray)); 
        System.out.println("Given Sum : " + givenSum); 
        System.out.println("Integer numbers, whose sum is equal to : " + givenSum); 
    	
        Set<Integer> set = new HashSet<Integer>(randomArray.length); 
    	
        for(int value : randomArray)
        { 
            int target = givenSum - value; 
    		
            // if target number is not in set then add 
            if(!set.contains(target))
            { 
                set.add(value); 
            }
            else 
            { 
                System.out.printf("(%d, %d) %n", value, target); 
            }
        }
        System.out.println();
    }
	 static int[] getRandomArray(int length)
	    { 
	        int[] randoms = new int[length]; 
	    	
	        for(int i=0; i<length; i++)
	        { 
	            randoms[i] = (int) (Math.random() * 10); 
	        } 
	        return randoms; 
	    }

}
