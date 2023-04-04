package com.adapterdesignpattern.Adapter;

import com.adapterdesignpattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    
    private WeightMachine weightMachine;
    
    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }
    
    @Override
    public double getWeightInKgs() {
        return weightMachine.getWeightInPound() * 0.45;
    }
}
