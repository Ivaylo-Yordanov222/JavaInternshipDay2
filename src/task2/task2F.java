package task2;

import java.util.Scanner;

public class task2F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();

        int resultSum = 0;
        int[] numbers = getNumbers(input);
        int startindex = 0;
        int endIndex = k;
        int startIndexResult = 0;
        int endIndexResult = 0;
        while(endIndex <= numbers.length){
            int currentSum = 0;
            for (int i = startindex; i< endIndex; i++){
                currentSum +=numbers[i];
            }
            if(currentSum > resultSum) {
                startIndexResult = startindex;
                endIndexResult = endIndex;
                resultSum = currentSum;
            }
            startindex++;
            endIndex++;
        }
        System.out.println("Max sum = " + resultSum);
        System.out.println("Final start index: "+ startIndexResult);
        System.out.println("Final end index: "+ (endIndexResult - 1));
        for(int i = startIndexResult; i < endIndexResult; i++) {
            System.out.print(numbers[i]+ " ");
        }
    }
    public static int[] getNumbers(String str) {
        String[] splitArray = str.split(" ");
        int[] array = new int[splitArray.length];

        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }
        return array;
    }
}
