/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a1_robertchen;

/**
 *
 * @author 335091559
 */
public class VehicleApp {
    private int passengerNum;
    private double passengerFare;
    private double fuelEfficiency;
    
    public static double gasPrice;
    public static double PROFIT = 400;
    
    public VehicleApp (int passengerNum, double passengerFare, int fuelEfficiency) {
        this.passengerNum = passengerNum;
        this.passengerFare = passengerFare;
        this.fuelEfficiency = fuelEfficiency;
    }
    
    public double revenue() {
        return passengerNum * passengerFare;
    }
    
    public double totalCost(int distance) {
        return distance * gasPrice;
    }
    
//    public double totalProfit() {
//        
//    }
    
    public boolean isProfitable() {
        if (totalProfit() > PROFIT) {
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
