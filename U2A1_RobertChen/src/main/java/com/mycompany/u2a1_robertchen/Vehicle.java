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
    private int vehicleNumber;
    private double revenue;
    private double cost;
    private double profit;
    private boolean isProfit;
    
    public static int compare1;
    public static int compare2;
    public static double gasPrice;
    public static double PROFIT = 400;
    
    public Vehicle (double distance, int passengerNum, double passengerFare, 
            double fuelEfficiency, double gasPrice, int vehicleNumber, double revenue, double cost, double profit, boolean isProfit) {
        this.distance = distance;
        this.passengerNum = passengerNum;
        this.passengerFare = passengerFare;
        this.fuelEfficiency = fuelEfficiency;
        this.gasPrice = gasPrice;
        this.vehicleNumber = vehicleNumber;
        this.revenue = revenue;
        this.cost = cost;
        this.profit = profit;
        this.isProfit = isProfit;
    }
    
    public int getVehicleNumber() {
        return vehicleNumber;
    }
    
    public double setDistance(double distance) {
        return distance;
    }
    
    public int setPassengerNum() {
        return passengerNum;
    }
    
    public double setPassengerFare() {
        return passengerFare;
    }
    
    public double setFuelEfficiency() {
        return fuelEfficiency;
    }
    
    public double setGasPrice() {
        return gasPrice;
    }
    
    public double revenue() {
        return revenue = passengerNum * passengerFare;
    }
    
    public double totalCost(double distance) {
        return cost = (distance * fuelEfficiency) * gasPrice;
    }
    
    public double totalProfit(double distance) {
        return profit = revenue() - totalCost(distance);
    }
    
    public boolean isProfitable(double distance) {
        if (totalProfit(distance) > PROFIT) {
            return isProfit = true;
        } else {
            return isProfit = false;
        }
    }
    
    public static String compareTo(Vehicle vehicle1, Vehicle vehicle2, double distance) {
        if (compare1 == vehicle1.getVehicleNumber() && compare2 == vehicle2.getVehicleNumber()) {
            if (vehicle1.totalProfit(distance) > vehicle2.totalProfit(distance)) {
                return "Vehicle " + compare1 + " is more profitable";
            } else if (vehicle1.totalProfit(distance) < vehicle2.totalProfit(distance)) {
                return "Vehicle " + compare2 + " is more profitable";
            } else {
                return "Both are equally profitable";
            }
        } else {
            return "This vehicle does not exist";
        }
    }

    @Override
    public String toString() {
        return "Vehicle " + vehicleNumber + ":\n" + "Number of passengers: " + passengerNum + "\nCost per Passenger: " + 
                Math.round(passengerFare * 100.0) / 100.0 + "\nFuel Efficiency: " + Math.round(fuelEfficiency * 100.0) / 100.0 
                + "\nDistance Travelled: " + Math.round(distance * 100.0) / 100.0 + "\n" + "Revenue: " + Math.round(revenue * 100.0) / 100.0 + 
                "\n" + "Cost: " + Math.round(cost * 100.0) / 100.0 + "\n" + "Profit: " + Math.round(profit * 100.0) / 100.0 + 
                "\n" + "Is Profitable: " + isProfit + "\n\n";
    }
}
