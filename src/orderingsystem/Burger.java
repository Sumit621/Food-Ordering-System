/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem;

/**
 *
 * @author USER
 */
public class Burger extends FoodItem {
    protected int noOfPatties;
    protected boolean extraCheese;

    public int getNoOfPatties() {
        return noOfPatties;
    }

    public void setNoOfPatties(int noOfPatties) {
        this.noOfPatties = noOfPatties;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }
    
}
