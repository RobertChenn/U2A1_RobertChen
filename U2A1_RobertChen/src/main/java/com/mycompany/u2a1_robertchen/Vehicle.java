/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a1_robertchen;

/**
 *
 * @author 335091559
 */
public class Vehicle {
    private int passengerNum;
    private double passengerFare;
    private double fuelEfficiency;
    private double distance;
    
    public static double gasPrice;
    public static double PROFIT = 400;
    
    public Vehicle (double distance, int passengerNum, double passengerFare, 
            int fuelEfficiency, double gasPrice) {
        this.distance = distance;
        this.passengerNum = passengerNum;
        this.passengerFare = passengerFare;
        this.fuelEfficiency = fuelEfficiency;
        this.gasPrice = gasPrice;
    }
    
    public double revenue() {
        return passengerNum * passengerFare;
    }
    
    public double setDistance(double distance) {
        return distance;
    }
    
    public double totalCost(double distance) {
        return distance * gasPrice;
    }
    
    public double totalProfit(double distance) {
        return revenue() - totalCost(distance);
    }
    
    public boolean isProfitable(double distance) {
        if (totalProfit(distance) > PROFIT) {
            return true;
        } else {
            return false;
        }
    }
//    public static double compareTo() {}
    
    @Override
    public String toString() {
        return super.toString();
    }
}
