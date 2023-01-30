/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Order {
    public ArrayList<FoodItem> list=new ArrayList<FoodItem>();
    public Order(){
    }
    public void addFood(FoodItem f){
        list.add(f);
    }
    public int getTotalBill(){
        int total=0;
        for (int i = 0; i < list.size(); i++) {
            total=total+list.get(i).getPrice();
        }
        return total;
    }
    public int getListSize(){
        return list.size();
    }
    public FoodItem getItem(int index){
        return list.get(index);
    }
}
