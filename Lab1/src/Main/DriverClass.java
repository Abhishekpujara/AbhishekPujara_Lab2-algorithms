package Main;

import Services.TransactionTarget;

import java.util.Scanner;

public class DriverClass{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TransactionTarget transactionTarget = new TransactionTarget();
        System.out.println("Enter the size of transaction array");
        int totalNoOfTransactions = scanner.nextInt();
        int[] transactions = new int[totalNoOfTransactions];
        System.out.println("Enter the values of array");
        for(int i = 0;i<totalNoOfTransactions;i++){
            transactions[i] = scanner.nextInt();
        }
        System.out.println("Enter the total no of targets that needs to be achieved");
        int targetCount = scanner.nextInt();
        System.out.println("Enter the value of targets");
        int targetValue;
        int[] prefixSum = new int[totalNoOfTransactions];
        prefixSum[0] = transactions[0];
        for(int i = 1;i<totalNoOfTransactions;i++){
            prefixSum[i] = prefixSum[i-1]+transactions[i];
        }
        for(int i = 0;i<targetCount;i++){
            targetValue = scanner.nextInt();
            transactionTarget.processTransactions(prefixSum,targetValue);
        }
    }
}
