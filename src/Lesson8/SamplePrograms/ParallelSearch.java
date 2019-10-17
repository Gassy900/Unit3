
package Lesson8.SamplePrograms;

import java.util.Scanner;

public class ParallelSearch {


    public static void main(String[] args) {
        String name[] = {"Bob","Sue","Joe","Andy","Kim"};
        int age[] = {45,17,21,35,57};
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name to search for age > ");
        String searchName = s.nextLine();
        
        int loc = -1;
        for (int i = 0; i < name.length; i++) {
            if(name[i].equals(searchName)){
                loc = i;
            }
            if(loc==-1)
                System.out.println(searchName+" not found");
            else
                System.out.println(searchName+ " was found at age of " + age[i]);
        }
    }
    
}
