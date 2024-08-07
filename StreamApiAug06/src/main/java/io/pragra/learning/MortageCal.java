package io.pragra.learning;
import java.util.*;

public class MortageCal {

    public double calc( Integer yr, Double ir, ICalculator iCalculator)
    {
        return iCalculator.calculate(yr,ir);
  }
}
