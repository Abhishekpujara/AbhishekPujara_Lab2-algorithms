package Main;

import MergSort.MergeSort;
import Services.noteCount;

import java.util.Arrays;
import java.util.Scanner;

public class DriverClass{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        MergeSort mergeSort = new MergeSort();
        noteCount notecount = new noteCount();
        System.out.println("Enter the total no of denominations");
        int totalNoOfDenominations = scanner.nextInt();
        int[] notes = new int[totalNoOfDenominations];
        System.out.println("Enter currency Denominations value");
        for(int i = 0;i<totalNoOfDenominations;i++){
            notes[i] = scanner.nextInt();
        }
        System.out.println("Enter the amount you want to pay");
        int amount = scanner.nextInt();
        mergeSort.sort(notes,0,notes.length-1);
        //countNotes
        System.out.println(Arrays.toString(notes));
        notecount.noteCounterAlgo(notes,amount);

        scanner.close();


    }

}
