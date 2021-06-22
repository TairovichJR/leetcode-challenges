package easy;

/**
 * Created by tairovich_jr on 2021-06-22.
 */
public class NumberOfStepsToReduceANumberToZero {

    public int numberOfSteps(int num) {

        int steps = 0;
        while (num != 0){

            if (num % 2 == 0){
                num = num / 2;
            }else{
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }
}
