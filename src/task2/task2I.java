package task2;

import java.util.Scanner;

public class task2I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        int[] numbers = getNumbers(input);
        int index = 0;
        if(k > numbers[numbers.length-1]){
            System.out.println("NO");
            return;
        }else if(k >= numbers[numbers.length/2]){
            for (int i = n/2; i < n+1; i++)
            {
                if(numbers[i] == k){
                    index = i;
                }
            }
        }else{
            for (int i = 0; i < n/2; i++)
            {
                if(numbers[i] == k){
                    index = i;
                }
            }
        }
        System.out.println(index);
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
