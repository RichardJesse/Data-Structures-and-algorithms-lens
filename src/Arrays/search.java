/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Random;

/**
 *
 * @author user1
 */
public class search {

    /**
     * in this problem you will be expected to initialize and array of 15 random
     * numbers using a loop and search through the array to find if the number
     * 15 is in the array
     */

    public void SearchSolution() {
        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(20);
            array[i] = randomNumber;
        }
               
        for(int element : array){
            if(element == 15){
                System.out.println("the number 15 has been found here");
            }
            System.out.println(element);
        }

    }
    

    public static void main(String[] args) {
        search s = new search();
        s.SearchSolution();
    }

}
