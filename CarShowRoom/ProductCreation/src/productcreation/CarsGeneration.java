/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productcreation;

import static java.lang.System.in;
import java.text.DecimalFormat;


public class CarsGeneration {
    private Car [] Existing=new Car[10];
    private Car[] newModels=new Car[4];
    private Car [] existingCarsInventory=new Car[500];
    private Car [] newCarsInventory=new Car[200];
    private String [] NewCars=new String[] {"GreenWheelSportsCar","SmallGreenMini","Medium Green Saloon","Green Bus"};
    private int numberCount;
    private int newModelsCount;
    private int StartVin;
    private int StartVinCars;
    String[] colors=new String []{"white","red","blue","black","grey","cherry red","dark blue","dark grey","silver","mica blue","yellow","pink","light brown"};
    boolean check=false;
    
    public CarsGeneration(){
        StartVin=20;
        StartVinCars=1000;
        Existing=new Car[10];
        numberCount=0;
        newModelsCount=0;
       for(int i=0;i<10;i++){
           Existing[i]=new Car();
       }
       for(int j=0;j<4;j++)
       {
           newModels[j]=new Car();
       }
       
       for(int k=0;k<500;k++)
       {
      existingCarsInventory[k]=new Car();
       }
  
       for(int l=0;l<200;l++)
       {
      newCarsInventory[l]=new Car();
        }
       
       
       
    }
    public void AddCars(Car car)
    {
        
        Existing[numberCount].setName(car.getName());
        Existing[numberCount].setVinNumber(car.getVinNumber());
        Existing[numberCount].setGearBox(car.getGearBox());
        Existing[numberCount].setTransmisson(car.getTransmisson());
        Existing[numberCount].setEngineType(car.getEngineType());
        Existing[numberCount].setEngineSize(car.getEngineSize());
        Existing[numberCount].setNoOfDoors(car.getNoOfDoors());
        Existing[numberCount].setWheelSize(car.getWheelSize());
        Existing[numberCount].setColour(car.getColour());
                
        numberCount++;
     }
    public void GenerateNewModels(){
        int randomNum;
       
        for(int i=0;i<4;i++)
        {
         newModels[i].setName(NewCars[i]);
         newModels[i].setVinNumber(StartVin);
         
         randomNum=(int)(Math.random() * 10);
         //  System.out.println("random gear:"+ randomNum);
         newModels[i].setGearBox(Existing[randomNum].getGearBox());
         newModels[i].SetGearBoxDonor(Existing[randomNum].getName(), Existing[randomNum].getVinNumber());
         
         randomNum=(int)(Math.random() * 10);
         // System.out.println("random trans:"+ randomNum);
         newModels[i].setTransmisson(Existing[randomNum].getTransmisson());
         newModels[i].SetTransDonor(Existing[randomNum].getName(), Existing[randomNum].getVinNumber());
         check=false;
         while(check!=true){
         randomNum=(int)(Math.random() * 10);
          //System.out.println("random engine:"+ randomNum); 
         check=newModels[i].IsValid(Existing[randomNum].getVinNumber());
         
         
         
         //System.out.println(check);
         if(check==true)
         {
           //  System.out.println("random engine2:"+ randomNum);
         newModels[i].setEngineType(Existing[randomNum].getEngineType());
         newModels[i].setEngineSize(Existing[randomNum].getEngineSize());
         newModels[i].SetEngineDonor(Existing[randomNum].getName(), Existing[randomNum].getVinNumber());
         }
         }
         check=false;
         while(check!=true){
         
         randomNum=(int)(Math.random() * 10);
         //System.out.println("random Doors:"+ randomNum);
         check=newModels[i].IsValid(Existing[randomNum].getVinNumber());
         //  System.out.println(check);
         if(check==true)
         {
           //   System.out.println("random Doors2:"+ randomNum);
         newModels[i].setNoOfDoors(Existing[randomNum].getNoOfDoors());
         newModels[i].SetDoorsDonor(Existing[randomNum].getName(), Existing[randomNum].getVinNumber());
         }
         }
         check=false;
         while(check!=true)
         {
             
         randomNum=(int)(Math.random() * 10);
         //System.out.println("random Wheel:"+ randomNum);
         check=newModels[i].IsValid(Existing[randomNum].getVinNumber());
         //System.out.println(check);
         if(check==true)
         {
           //  System.out.println("random Wheel2:"+ randomNum);
         newModels[i].setWheelSize(Existing[randomNum].getWheelSize());
         newModels[i].SetWheelDonor(Existing[randomNum].getName(), Existing[randomNum].getVinNumber());
         }
         }
         
         randomNum=(int)(Math.random() * 13);
         newModels[i].setColour(colors[randomNum]);
         newModelsCount++;
         StartVin++;   
        }
    }
 public void GenerateExistingCars()
 {
     int getRand;
     for(int i=0;i<500;i++)
     {
         getRand=(int)(Math.random() * 10);
         existingCarsInventory[i].setName(Existing[getRand].getName());
         existingCarsInventory[i].setVinNumber(StartVinCars);
         existingCarsInventory[i].setGearBox(Existing[getRand].getGearBox());
         existingCarsInventory[i].setTransmisson(Existing[getRand].getTransmisson());
         existingCarsInventory[i].setEngineType(Existing[getRand].getEngineType());
         existingCarsInventory[i].setEngineSize(Existing[getRand].getEngineSize());
         existingCarsInventory[i].setNoOfDoors(Existing[getRand].getNoOfDoors());
         existingCarsInventory[i].setWheelSize(Existing[getRand].getWheelSize());
         existingCarsInventory[i].setColour(colors[(int)(Math.random() * 13)]);
         existingCarsInventory[i].SetDoorsDonor(Existing[getRand].getDoorsDonorName(),Existing[getRand].getDoorsDonorNo());
         existingCarsInventory[i].SetGearBoxDonor(Existing[getRand].getGearDonorName(),Existing[getRand].getGearDonorNo());
         existingCarsInventory[i].SetEngineDonor(Existing[getRand].getEngineDonorName(),Existing[getRand].getEngineDonorNo());
         existingCarsInventory[i].SetTransDonor(Existing[getRand].getTransDonorName(),Existing[getRand].getTransDonorNo());
         existingCarsInventory[i].SetWheelDonor(Existing[getRand].getWheelDonorName(),Existing[getRand].getWheelDonorNo());
        StartVinCars++;
     }
 
 }
 
 public void GenerateNewCars()
 {
     int getRand;
     for(int i=0;i<200;i++)
     {
         getRand=(int)(Math.random() * 4);
         newCarsInventory[i].setName(newModels[getRand].getName());
         newCarsInventory[i].setVinNumber(StartVinCars);
         newCarsInventory[i].setGearBox(newModels[getRand].getGearBox());
         newCarsInventory[i].setTransmisson(newModels[getRand].getTransmisson());
         newCarsInventory[i].setEngineType(newModels[getRand].getEngineType());
         newCarsInventory[i].setEngineSize(newModels[getRand].getEngineSize());
         newCarsInventory[i].setNoOfDoors(newModels[getRand].getNoOfDoors());
         newCarsInventory[i].setWheelSize(newModels[getRand].getWheelSize());
         newCarsInventory[i].setColour(colors[(int)(Math.random() * 13)]);
         newCarsInventory[i].SetDoorsDonor(newModels[getRand].getDoorsDonorName(),newModels[getRand].getDoorsDonorNo());
         newCarsInventory[i].SetGearBoxDonor(newModels[getRand].getGearDonorName(),newModels[getRand].getGearDonorNo());
         newCarsInventory[i].SetEngineDonor(newModels[getRand].getEngineDonorName(),newModels[getRand].getEngineDonorNo());
         newCarsInventory[i].SetTransDonor(newModels[getRand].getTransDonorName(),newModels[getRand].getTransDonorNo());
         newCarsInventory[i].SetWheelDonor(newModels[getRand].getWheelDonorName(),newModels[getRand].getWheelDonorNo());
        StartVinCars++;
     }
 
 }
    

 public void DisplayOldCars()
 {
     for(int i=0;i<500;i++)
     {
         System.out.println(existingCarsInventory[i].getName()+"----- vin: "+existingCarsInventory[i].getVinNumber());
     }
     
 }
 
 public void DisplayNewCars()
 {
     for(int i=0;i<200;i++)
     {
         System.out.println(newCarsInventory[i].getName()+"----- vin: "+newCarsInventory[i].getVinNumber());
     }
     
 }
    public void DisplayNewModels()
    {
         System.out.println("New Models");
       for(int j=0;j<newModelsCount;j++)
       {
            System.out.println(newModels[j].getName() +" (vin: "+ newModels[j].getVinNumber()+")");
        
            if(newModels[j].getEngineType()=="diesel" || newModels[j].getEngineType()=="petrol"){
                DecimalFormat dec = new DecimalFormat("#0.0");
                   System.out.print(   dec.format(newModels[j].getEngineSize())+" litre " + newModels[j].getEngineType()+" engine " );
                   System.out.println("(" +newModels[j].getEngineDonorName()+"( vin: "+newModels[j].getEngineDonorNo()+")),");
            }
          else if(newModels[j].getEngineType()=="electric")
          {

                   System.out.print(newModels[j].getEngineSize()+" hp " + newModels[j].getEngineType()+" engine " );
                   System.out.println("(" +newModels[j].getEngineDonorName()+"(vin: "+newModels[j].getEngineDonorNo()+")),");
        }
            
            System.out.print(newModels[j].getGearBox()+" Speed ("+ newModels[j].getGearDonorName()+"("+newModels[j].getGearDonorNo()+")),");
             System.out.println(newModels[j].getTransmisson()+" transmission (vin:"+ newModels[j].getTransDonorName()+"(vin:"+newModels[j].getTransDonorNo()+"))," );
             
             
              System.out.print(newModels[j].getWheelSize()+" inch alloy wheels (vin:"+ newModels[j].getWheelDonorName()+"("+newModels[j].getWheelDonorNo()+"))," );
              System.out.println(newModels[j].getNoOfDoors()+" doors ("+ newModels[j].getDoorsDonorName()+"(vin:"+newModels[j].getDoorsDonorNo()+")) , in "+ newModels[j].getColour());
                
                System.out.println();
                System.out.println();
 
       
       }
        
        
        
    }
    
    public void DisplayNewInventory()
    {
        
       for(int j=0;j<200;j++)
       {
            System.out.println(newCarsInventory[j].getName() +" (vin: "+ newCarsInventory[j].getVinNumber()+")");
        
            if(newCarsInventory[j].getEngineType()=="diesel" || newCarsInventory[j].getEngineType()=="petrol"){
                DecimalFormat dec = new DecimalFormat("#0.0");
                   System.out.print(   dec.format(newCarsInventory[j].getEngineSize())+" litre " + newCarsInventory[j].getEngineType()+" engine " );
                   System.out.println("(" +newCarsInventory[j].getEngineDonorName()+"( vin: "+newCarsInventory[j].getEngineDonorNo()+")),");
            }
          else if(newCarsInventory[j].getEngineType()=="electric")
          {

                   System.out.print(newCarsInventory[j].getEngineSize()+" hp " + newCarsInventory[j].getEngineType()+" engine " );
                   System.out.println("(" +newCarsInventory[j].getEngineDonorName()+"(vin: "+newCarsInventory[j].getEngineDonorNo()+")),");
        }
            
            System.out.print(newCarsInventory[j].getGearBox()+" Speed ("+ newCarsInventory[j].getGearDonorName()+"("+newCarsInventory[j].getGearDonorNo()+")),");
             System.out.println(newCarsInventory[j].getTransmisson()+" transmission (vin:"+ newCarsInventory[j].getTransDonorName()+"(vin:"+newCarsInventory[j].getTransDonorNo()+"))," );
             
             
              System.out.print(newCarsInventory[j].getWheelSize()+" inch alloy wheels (vin:"+ newCarsInventory[j].getWheelDonorName()+"("+newCarsInventory[j].getWheelDonorNo()+"))," );
              System.out.println(newCarsInventory[j].getNoOfDoors()+" doors ("+ newCarsInventory[j].getDoorsDonorName()+"(vin:"+newCarsInventory[j].getDoorsDonorNo()+")) , in "+ newCarsInventory[j].getColour());
                
                System.out.println();
                System.out.println();
 
       
       }
        
        
        
    }
    
    
    public void DisplayExistingInventory(){
        
        System.out.println("Existing Models");
        
        for(int i=0;i<500;i++){
            System.out.println(existingCarsInventory[i].getName() +" (vin: "+ existingCarsInventory[i].getVinNumber()+")");
            if(existingCarsInventory[i].getEngineType()=="diesel" || existingCarsInventory[i].getEngineType()=="petrol"){
                DecimalFormat dec = new DecimalFormat("#0.0");
                   System.out.print(   dec.format(existingCarsInventory[i].getEngineSize())+" litre " + existingCarsInventory[i].getEngineType()+" engine , " );
        }
          else if(existingCarsInventory[i].getEngineType()=="electric"){

                   System.out.print(existingCarsInventory[i].getEngineSize()+" hp " + existingCarsInventory[i].getEngineType()+" engine " );
        } 
                
             System.out.println(existingCarsInventory[i].getGearBox()+" Speed "+existingCarsInventory[i].getTransmisson()+" transmission");
               System.out.print(existingCarsInventory[i].getWheelSize()+" inch alloy wheels,");
                System.out.println(existingCarsInventory[i].getNoOfDoors()+" doors , in "+ existingCarsInventory[i].getColour());
                
                System.out.println();
                System.out.println();
    }
    
    
}
    public void DisplayCar(int v)
    {
        System.out.println();
        System.out.println();
        if(v>=1000 && v<1500)
        {
            int i=v-1000;
        System.out.println(existingCarsInventory[i].getName() +" (vin: "+ existingCarsInventory[i].getVinNumber()+")");
            if(existingCarsInventory[i].getEngineType()=="diesel" || existingCarsInventory[i].getEngineType()=="petrol"){
                DecimalFormat dec = new DecimalFormat("#0.0");
                   System.out.print(   dec.format(existingCarsInventory[i].getEngineSize())+" litre " + existingCarsInventory[i].getEngineType()+" engine , " );
        }
          else if(existingCarsInventory[i].getEngineType()=="electric"){

                   System.out.print(existingCarsInventory[i].getEngineSize()+" hp " + existingCarsInventory[i].getEngineType()+" engine " );
        } 
                
             System.out.println(existingCarsInventory[i].getGearBox()+" Speed "+existingCarsInventory[i].getTransmisson()+" transmission");
               System.out.print(existingCarsInventory[i].getWheelSize()+" inch alloy wheels,");
                System.out.println(existingCarsInventory[i].getNoOfDoors()+" doors , in "+ existingCarsInventory[i].getColour());
                
                System.out.println();
                System.out.println();
            
            
            
        }
        else if(v>=1500 && v<1700)
        {
            int j=v-1500;
            System.out.println(newCarsInventory[j].getName() +" (vin: "+ newCarsInventory[j].getVinNumber()+")");
        
            if(newCarsInventory[j].getEngineType()=="diesel" || newCarsInventory[j].getEngineType()=="petrol"){
                DecimalFormat dec = new DecimalFormat("#0.0");
                   System.out.print(   dec.format(newCarsInventory[j].getEngineSize())+" litre " + newCarsInventory[j].getEngineType()+" engine " );
                   System.out.println("(" +newCarsInventory[j].getEngineDonorName()+"( vin: "+newCarsInventory[j].getEngineDonorNo()+")),");
            }
          else if(newCarsInventory[j].getEngineType()=="electric")
          {

                   System.out.print(newCarsInventory[j].getEngineSize()+" hp " + newCarsInventory[j].getEngineType()+" engine " );
                   System.out.println("(" +newCarsInventory[j].getEngineDonorName()+"(vin: "+newCarsInventory[j].getEngineDonorNo()+")),");
        }
            
            System.out.print(newCarsInventory[j].getGearBox()+" Speed ("+ newCarsInventory[j].getGearDonorName()+"("+newCarsInventory[j].getGearDonorNo()+")),");
             System.out.println(newCarsInventory[j].getTransmisson()+" transmission (vin:"+ newCarsInventory[j].getTransDonorName()+"(vin:"+newCarsInventory[j].getTransDonorNo()+"))," );
             
             
              System.out.print(newCarsInventory[j].getWheelSize()+" inch alloy wheels (vin:"+ newCarsInventory[j].getWheelDonorName()+"("+newCarsInventory[j].getWheelDonorNo()+"))," );
              System.out.println(newCarsInventory[j].getNoOfDoors()+" doors ("+ newCarsInventory[j].getDoorsDonorName()+"(vin:"+newCarsInventory[j].getDoorsDonorNo()+")) , in "+ newCarsInventory[j].getColour());
                
                System.out.println();
                System.out.println();
 
 
        }
        else
        {
            System.out.println("You Have Entered Wrong Vin Number");
        }
    }
    public Car GetExistingCar(int i)
    {
        return existingCarsInventory[i];
    }
    
    public Car GetNewCar(int i)
    {
        return newCarsInventory[i];
    }
}
