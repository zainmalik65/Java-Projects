/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productcreation;

import java.util.ArrayList;
import java.util.ListIterator;


public class Dealer {
    private String name;
    private String address;
    public ArrayList<Car> inventory = new ArrayList<Car>();
    private int maxCars=20;
    private int carsCount=0;
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addCarsToInventory(Car newCar) {
       this.inventory.add(newCar);
       carsCount++;
    }
    public boolean isSpaceAvalible()
    {
        if(carsCount<20)
        {
            return true;
        }
        return false;
        
    }
    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    
    }
   public void ShowInventory(){ 
       int c=1;
      
       ListIterator<Car>iterator = inventory.listIterator();
         Car cl=new Car();
        try
        {             
            while (iterator.hasNext()) { 
               
                cl=iterator.next();
               System.out.println(cl.getName()+" in "+cl.getColour()+"(vin:"+cl.getVinNumber()+")");
               c++;
            } 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        }
        System.out.println();
        System.out.println();
   }
    
}
