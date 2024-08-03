package Aug3;

import java.util.*;

public class EnchancerMain {
    public static void main(String[] args) {

        INameEnhancer nameEnhancer = name -> name.concat(name);

        enchanceMETHOD enchanceMETHOD = new enchanceMETHOD();

        System.out.println(enchanceMETHOD.enchance("Navjot", nameEnhancer));
    }
}
