package com.adapterdesignpattern.client;

import com.adapterdesignpattern.Adaptee.WeightMachineForBabies;
import com.adapterdesignpattern.Adapter.WeightMachineAdapter;
import com.adapterdesignpattern.Adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter =
                new WeightMachineAdapterImpl(new WeightMachineForBabies());

        System.out.println(weightMachineAdapter.getWeightInKgs());
    }
}
