# Data-Structures-and-algorithms-lens
This repository is for the sake of the analysis of  different algorithms and data structures. 
This repository is ment to be a deep dive into the various data structures and algorithyms.
I'm not saying i'm the best but I am putting all my knowldege on this topic here...Contributions 
are welcomed!!
---------------------------------------------------------------------------------------------------------------------------

**the search problem in the array package(search.java)**

```
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
````

**The time complexity of this code is O(N)...**

In case you are wondering how the above time complexity was reached we carry out the asymptotic computational analysis. So let's calculate the time complexity of the above code.

```
        int[] array = new int[15];  // this line has a  time complexity of O(1)
        Random random = new Random(); // this lina has a time complexity of O(1)
```
The time complexity of O(1) means that the time complexity is contant thus that line of code will always take the same amount of time to execute.
```
for (int i = 0; i < array.length; i++) { // this loop has a time complexity of O(n)
            int randomNumber = random.nextInt(20); // this line has a contant time complexity of O(1)
            array[i] = randomNumber; //this line has a time complexity of O(1)
        }
```
The time complexity of O(n) means that the time complexity of the for loop is linear.This therefore implies that the number of times that the loop execute is dependent on the value of `array.length`. But when calculating the time complexity of the whole algorithym the for loop here is taken to be a single statement thus it has it's own cumulative complexity which we'll talk about later..

```
for(int element : array){ //this loop has a time complexity of O(n)
            if(element == 15){
                System.out.println("the number 15 has been found here"); This is has line has a time complexity of  O(1)
            }
            System.out.println(element) This line has a line comlexity of O(1)
        }
```
In the above code the for each loop has a linear time complexity of O(n) since the amount of time that it will take to loop through the number of elements to check if the number is 15 will be dependent in the number of elements in the array. **Don't forget the loop is taken to be one statement so it has a cumulative complexity.**

**Overall**
```
  int[] array = new int[15];  // this line has a  time complexity of O(1)
        Random random = new Random(); // this lina has a time complexity of O(1)

for (int i = 0; i < array.length; i++) { // this loop has a time complexity of O(n)
            int randomNumber = random.nextInt(20); // this line has a contant time complexity of O(1)
            array[i] = randomNumber; //this line has a time complexity of O(1)
        }

for(int element : array){ //this loop has a time complexity of O(n)
            if(element == 15){
                System.out.println("the number 15 has been found here"); This is has line has a time complexity of  O(1)
            }
            System.out.println(element) This line has a line comlexity of O(1)
        }

```
following the steps for the calculation using the rules of the asymptotic computational complexity we will calculate as follows statement per statement.

O(1) + O(1) + (O(N)+O(1)+O(1)) + (O(N)+O(1)+O(1))

**Note that the ones in parenthesis are for calculating the cumulative complexity of the for loops which as we said before are considered to be one statement**

2O(1)+ (O(N)+2O(1)) + (O(N)+2O(1)) 

The next move will be to remove all the constants. We therefore remain with

O(1)+ O(N)+O(1) + O(N)+O(1)

In the last step we will eleiminate the least domimant terms in the alogorithym. In this case the least domiant terms are the constants O(1).After eliminating them we remain with.

O(N)+ O(N) 

2O(N)
Elminate constants and we remain with **O(N)**
--------------------------------------------------------------------------------------------------------------------------------------------------------------

**The target problem in the array package(Target.java)**
In the problem that is being focus on here, one is given an array of elements and they are expected to go through the values in an array of numbers and find any two numbers in the array to that when added give the target.

**This is an approach to solving the problem**
```
public class Target {

    public void targetfinder(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int evaluation = num[i] + num[j];
                if (evaluation == target) {
                    System.out.println("[" + num[i] + "," + num[j] + "]");
                } else {
                   System.out.println("the target could not be reached");
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

```
In the above we can see that the function ``targetFinder`` is essencially one for loop hence there will not be addition of all the steps.Instead we multiply all the steps.







