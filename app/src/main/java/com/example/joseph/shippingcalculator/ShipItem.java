package com.example.joseph.shippingcalculator;

import java.text.DecimalFormat;

/**
 * Created by nhoang53 on 9/11/2016.
 */
public class ShipItem {
    private double totalCost;
    private double addedCost;
    private double baseCost;
    private double weight;

    public ShipItem(double totalCost, double addedCost, double weight) {
        this.totalCost = totalCost;
        this.addedCost = addedCost;
        this.weight = weight;
    }

    public ShipItem(){
        totalCost = 0.0;
        addedCost = 0.0;
        weight = 0.0;
        baseCost = 3.0;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getAddedCost() {
        return addedCost;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void calculateShippingCost(){
        if(weight <= 16) {
            totalCost = baseCost;
            addedCost = 0.0;
        }
        else{
            addedCost = (((int)(weight - 17) / 4) + 1) * 0.5;
            totalCost = baseCost + addedCost;
        }
    }
}
