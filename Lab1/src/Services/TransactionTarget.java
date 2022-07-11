package Services;

public class TransactionTarget{

    public void processTransactions(int[] prefixSum,int target){
        int sum = 0;
        for(int i = 0;i<prefixSum.length;i++){

            if (prefixSum[i]>=target) {
                System.out.println("Target achieved after "+(i+1)+" transactions ");
                sum = 1;
                break;
            }
        }
        if (sum == 0) {
            System.out.println("Given target is not achieved ");
        }
    }

}


