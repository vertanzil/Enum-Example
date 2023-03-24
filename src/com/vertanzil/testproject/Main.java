package com.vertanzil.testproject;

import com.vertanzil.testproject.utils.Olive;
import com.vertanzil.testproject.utils.OliveName;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Olive(OliveName.OLIVE3,0x2E0854, 1 ));
        olives.add(new Olive(OliveName.OLIVE2,0x2E0854, 1 ));
        olives.add(new Olive(OliveName.OLIVE3,0x000000, 1 ));
        olives.add(new Olive(OliveName.OLIVE3,0000000, 10));

        OlivePress press = new OlivePress();
        press.getOIL(olives);
        int totalOil = press.getOIL(olives);
        System.out.printf("Total Olive oil: " + totalOil);

    }
}
