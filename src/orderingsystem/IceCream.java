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
public class IceCream extends Dessert{
    private String flavor;
    
    public IceCream(){
        name="Ice Cream";
        price=60;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    
}
