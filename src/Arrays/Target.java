/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author user1
 */
public class Target {

    public void targetfinder(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int evaluation = num[i] + num[j];
                if (evaluation == target) {
                    System.out.println("[" + num[i] + "," + num[j] + "]");
                } else {
//                    System.out.println("the target could not be reached");
                    break;
                }

            }
        }
    }

    public static void main(String[] args) {
        Target t = new Target();
        int[] array = {1, 2, 3, 4};
        int target = 7;
        t.targetfinder(array, target);
  
    }

}
