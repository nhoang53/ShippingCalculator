package com.example.joseph.shippingcalculator;

/**
     Nguyen Hoang C02288487
     Project 1: Shipping Calculator
 */

public class ShipItem {
    /**
     * The weight, base cost, added cost and total cost of the ship item
     */
    private double totalCost;
    private double addedCost;
    private double baseCost;
    private double weight;

    /**
     * Creates a new ShipItem with the given weight, added cost and total cost
     *
     * @param totalCost .This ShipItem's total cost
     * @param addedCost .This ShipItem's added cost
     * @param weight .This ShipItem's weight
     */
    public ShipItem(double totalCost, double addedCost, double weight) {
        this.totalCost = totalCost;
        this.addedCost = addedCost;
        this.weight = weight;
    }

    /**
     * Initial a ShipItem with instance variable to 0.0, except base cost 3.0
     */
    public ShipItem(){
        totalCost = 0.0;
        addedCost = 0.0;
        weight = 0.0;
        baseCost = 3.0;
    }

    /**
     * Get total cost of this ShipItem
     * @return ShipItem's total cost
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * Get added cost of this ShipItem
     * @return ShipItem's added cost
     */
    public double getAddedCost() {
        return addedCost;
    }

    /**
     * Get base cost of this ShipItem
     * @return ShipItem's base cost
     */
    public double getBaseCost() {
        return baseCost;
    }

    /**
     * Get weight of this ShipItem
     * @return ShipItem's weight
     */
    public double getWeight(){
        return weight;
    }

    /**
     * Changes weight of this ShipItem
     * @param weight  This ShipItem's new weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Calculate the shipping cost base on the weight input from user
     */
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
