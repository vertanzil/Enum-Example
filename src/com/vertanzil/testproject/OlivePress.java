package com.vertanzil.testproject;


import com.vertanzil.testproject.utils.Olive;

import java.util.List;

public class OlivePress {

    public int getOIL(List<Olive> olives){

        int totalOil = 0;

        for (Olive o : olives){
            System.out.println(o.getName());
            totalOil += o.crush();
        }
        return totalOil;
    }


}
