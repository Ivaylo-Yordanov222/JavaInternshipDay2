package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task2H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        int[] numbers = getNumbers(input);
        HashMap<Integer,ArrayList<Integer>> evenNums = new HashMap<>();
        for(int i = 0;i< numbers.length;i++){
            if(!evenNums.containsKey(numbers[i])){
                evenNums.put(numbers[i],new ArrayList<>());
            }
            evenNums.get(numbers[i]).add(numbers[i]);
        }

        for(var list:evenNums.values())
        {
            var size = list.size();
            if(size % 2 != 0)
            {
                System.out.println(list.get(0));
            }
        }
    }
    public static int[] getNumbers(String str)
    {
        String[] splitArray = str.split(" ");
        int[] array = new int[splitArray.length];

        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }
        return array;
    }
}
