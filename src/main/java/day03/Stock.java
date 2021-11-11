package day03;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Double> exchangeRate;

    public Stock(List<Double> exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double  maxProfit(){
        double maxPofit=0;
        double actPofit=0;
        for(int i = 1; i<exchangeRate.size();i++){
            for (int j = 0; j<i;j++){
                actPofit = exchangeRate.get(i)-exchangeRate.get(j);
                maxPofit = actPofit > maxPofit ? actPofit : maxPofit;
            }
        }
        return maxPofit;
    }


}
