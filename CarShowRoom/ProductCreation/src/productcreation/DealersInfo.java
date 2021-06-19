/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productcreation;

import java.text.DecimalFormat;
import java.util.ListIterator;
import java.util.Scanner;


public class DealersInfo {
        Dealer [] Dealers=new Dealer[50];
        String [] dealersName=new String[]{"Charlie","Jack","Gerry","Thomas","George","Jake","Connor","Kyle","James","Liam"};
        String [] address=new String[]{"1217 Burke Street South Boston","4956 C Street Worcester ","2746 Corpening Drive Bloomfield Township","1941  Alexander Drive Windthorst","3615 Joyce Street Pollocksville"};
        int totalDealers=50;
        boolean check=false;
 public DealersInfo(){
        for(int i=0;i<totalDealers;i++){
            Dealers[i]=new Dealer();
        }
       
        
    }
public void GenerateDealers()
    {
        for(int i=0;i<50;i++)
       {
           Dealers[i].setName(dealersName[(int)(Math.random() * 10)]);
           Dealers[i].setAddress(address[(int)(Math.random() * 5)]);
       }
    }
public void DistributeExistingCars(CarsGeneration  Cars)
{
    int count=0;
    int randomNum=0;
    Car temp=new Car();
    for(int i=0;i<50;i++)
    {
     for(int j=i*5;j<(i+1)*5;j++)
     {
         temp=Cars.GetExistingCar(j);
      Dealers[i].addCarsToInventory(temp);
      count++;
     }
    // System.out.println();
    }
    
    for(int l=count;l<500;l++)
    {
        check=false;
         
        while(check!=true){
       randomNum=(int)(Math.random() * 50);
        check=Dealers[ randomNum].isSpaceAvalible();
       // System.out.println(randomNum+"  "+check);
        if(check==true){
            temp=Cars.GetExistingCar(l);
         Dealers[ randomNum] .addCarsToInventory(temp);
            }
        }
    }
}
public void DistibuteNewCars(CarsGeneration Cars)
{
     int randomNum=0;
    Car temp=new Car();
    for(int l=0;l<200;l++)
    {
        check=false;
        while(check!=true)
        {
            randomNum=(int)(Math.random() * 50);
            check=Dealers[ randomNum].isSpaceAvalible();
           // System.out.println(randomNum+"  "+check);
            if(check==true){
            temp=Cars.GetNewCar(l);
         Dealers[ randomNum] .addCarsToInventory(temp);
            }
        }
    }
        
 }
         


public void DisplayDealers()
{
 for(int i=0;i<50;i++)
 {
     System.out.println("Dealer No : "+ i+1);
     System.out.println("Dealer Name :"+Dealers[i].getName());
     System.out.println("Address : "+Dealers[i].getAddress());
      System.out.println();
       System.out.println("presents");
    Dealers[i].ShowInventory();
 }   
}

public void DisplayListDealer()
{
    int a=0;
    for(int i=0;i<50;i++)
 {
     a=i+1;
     System.out.print("Dealer No : "+ a);
     System.out.println(" Dealer Name :"+Dealers[i].getName());
    }
}


public void DisplaySpecificDealer(int a)
{
      System.out.println();
    int i=a-1;
     System.out.println("Dealer No : "+ a);
     System.out.println("Dealer Name :"+Dealers[i].getName());
     System.out.println("Address : "+Dealers[i].getAddress());
      System.out.println();
       System.out.println("presents");
    Dealers[i].ShowInventory();
      Scanner input = new Scanner(System. in);
    System.out.print("Enter Vin Number of above List of Cars :");
        int op2;
          op2 = input.nextInt();
          displayCarsFromInventory(i,op2);
}
public void displayCarsFromInventory(int dealerID,int vin)
{
     int c=1;
       // System.out.println(dealerID);
       ListIterator<Car>iterator = Dealers[dealerID].inventory.listIterator();
         Car cl=new Car();
         
        try
        {             
            while (iterator.hasNext()) { 
               
                cl=iterator.next();
         //        System.out.println(cl.getName() +" (vin: "+ cl.getVinNumber()+")");
                if(cl.getVinNumber()==vin)
                {
                     
                     
                      System.out.println(cl.getName() +" (vin: "+ cl.getVinNumber()+")");
            if(cl.getEngineType()=="diesel" || cl.getEngineType()=="petrol"){
                DecimalFormat dec = new DecimalFormat("#0.0");
                   System.out.print(   dec.format(cl.getEngineSize())+" litre " + cl.getEngineType()+" engine , " );
        }
          else if(cl.getEngineType()=="electric"){

                   System.out.print(cl.getEngineSize()+" hp " + cl.getEngineType()+" engine " );
        } 
                
             System.out.println(cl.getGearBox()+" Speed "+cl.getTransmisson()+" transmission");
               System.out.print(cl.getWheelSize()+" inch alloy wheels,");
                System.out.println(cl.getNoOfDoors()+" doors , in "+ cl.getColour());
                
                System.out.println();
                System.out.println();
                break;
            }
                
                     
                
             }
            System.out.println("Invalid Vin Number Selected");
            } 
        
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        }
        System.out.println();
        System.out.println();
}
}
    
