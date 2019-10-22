package Lesson8.SamplePrograms;

public class QuizReview
{
    public static void main(String[] args)
    {
        /*
        5 definitions - Parallel Array, 2D Array, Ragged Array, Physical vs Logical Size
        
        Coding:
        -Write a method that adds up (and returns the total of) all the numbers in a 2D array
        -Write a method that counts how many of a certain number are in a 1D array
        
        1 CodingBat (1 of 2) we'll do both today
         */

        int nums[][] = new int[4][5];
        for (int x = 0; x < nums.length; x++)
        {
            for (int y = 0; y < nums[x].length; y++)
            {
                nums[x][y] = x * 10 + y;
                System.out.print(nums[x][y] + "\t");
            }
            System.out.println("");
        }

        System.out.println("The total of all the numbers is");
        int sum = 0;
        for (int x = 0; x < nums.length; x++)
        {
            for (int y = 0; y < nums[x].length; y++)
            {
                sum += nums[x][y];
            }
        }

        System.out.println("" + sum);

        System.out.println("\nProgram 2");
        int a[] = {7, 4, 8, 9, 6, 7, 5, 6, 9, 10, 7, 3, 7, 4, 8, 0, 1, 7};
        int b[] = {7, 8, 7, 4, 5};

        int numa7 = count7(a);
        int numb7 = count7(b);

        System.out.format("There are %d 7's in a and %d 7's in b\n", numa7, numb7);
        
        System.out.println("\nCodingBat Review");
        int cb1[] = fizzArray3(11, 18);
        for (int x = 0; x < cb1.length; x++)
        {
            System.out.print(cb1[x] + ", ");
        }
        
        System.out.println("");
        int cb2[] = {6, 2, 5, 3};
        cb2 = shiftLeft(cb2);
        for (int x = 0; x < cb2.length; x++)
        {
            System.out.print(cb2[x] + ", ");
        }
    }

    public static int count7(int arr[])
    {
        int total = 0;
        for (int x = 0; x < arr.length; x++)
        {
            if (arr[x] == 7)
            {
                total++;
            }
        }
        return total;
    }

    public static int[] fizzArray3(int start, int end)
    {
        int result[] = new int[end - start];
        int index = 0;
        for (int x = start; x < end; x++)
        {
            result[index] = x;
            index++;
        }
        return result;
    }
    
    public static int[] shiftLeft(int[] nums)
    {
        int first = nums[0];
        for(int x = 0; x < nums.length - 1; x ++)
        {
            nums[x] = nums[x + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }
}