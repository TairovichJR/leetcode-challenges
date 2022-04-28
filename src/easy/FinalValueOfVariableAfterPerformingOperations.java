package easy;

public class FinalValueOfVariableAfterPerformingOperations {


    public int finalValueAfterOperations(String[] operations) {

        int X = 0;

        for (int i = 0; i < operations.length; i++) {
            String x = operations[i];
            if (x.startsWith("++") || x.endsWith("++")){
                X++;
            }
            else if(x.startsWith("--") || x.endsWith("--")){
                X--;
            }
        }
        return X;
    }

}
