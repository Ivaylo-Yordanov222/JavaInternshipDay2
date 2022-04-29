package task2;

import java.util.Scanner;

public class task2G {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        int[] numbers = getNumbers(input);
        printSequence(numbers,n);
    }
    static void printSequence(int sequence[],int size)
    {

        int maxSoFar = sequence[0];
        int maxEndingHere = 0;
        int lastIndex = 0;
        for (int i = 0; i < size; i++)
        {
            maxEndingHere = maxEndingHere + sequence[i];
            if (maxEndingHere < 0){
                maxEndingHere = 0;
            }

            else if (maxSoFar < maxEndingHere){
                maxSoFar = maxEndingHere;
                lastIndex =i;
            }
        }

        int tempSum = 0;
        int firstIndex = 0;
        for(int j = lastIndex; j >= 0;j--){
            if(tempSum == maxSoFar){
                firstIndex = j;
                break;
            }
            else{
                tempSum+= sequence[j];
            }
        }
        firstIndex = firstIndex+1;
        for (int k = firstIndex;k<=lastIndex;k++){
            System.out.print(sequence[k]+ " ");
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
