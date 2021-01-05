package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public <T> List<Integer> of(int num) {
        List<Integer> l = new ArrayList<>();
        for(int i = 2; i<=num; i++){
            if(isDivisible(num, i)){
                int factors = getFactors(i);
                if(isFactorEqualsZero(factors))
                    l.add(i);
            }
        }
        return l;
    }

    private boolean isFactorEqualsZero(int factors) {
        return factors == 0;
    }

    private int getFactors(int num) {
        int factors = 0;
        for(int j = 2; j<num; j++){
            if(isDivisible(num,j))
                factors++;
        }
        return factors;
    }

    private boolean isDivisible(int num, int i) {
        return num % i == 0;
    }

}
