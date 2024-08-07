package io.pragra.learning;

import java.util.ArrayList;

public class CalMain {





        public static void main(String[] args) {
         //   NacCal nacCal = new NacCal();
           Double result1= NacCal.navcal(3,1.053);
            System.out.println(result1);

           MortageCal mortageCal = new MortageCal();

           // Double  result= mortageCal.calc(3, 1.053,NacCal::navcal);
            Double  result= mortageCal.calc(3, 1.053, (year, rate) -> year*rate*8);


            System.out.println(result);
        }
    }

