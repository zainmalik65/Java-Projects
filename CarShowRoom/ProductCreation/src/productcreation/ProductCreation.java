/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productcreation;

import java.text.DecimalFormat;
import java. util. Scanner;
public class ProductCreation {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
       CarsGeneration Cars=new CarsGeneration();
       DealersInfo Dealers=new DealersInfo();
       Dealers.GenerateDealers();
      
       
       
//   int Random;  
        int Start=0;
        int vinStart=1;
        int random = (int)(Math.random() * 3);
       String [] CarNames=new String[]{"GreenWheelX1","GreenWheelX2","GreenWheelX3","GreenWheelX4","GreenWheelX5","GreenWheelX6","GreenWheelX7","GreenWheelX8","GreenWheelX9","GreenWheelX10"};
       int [] gear=new int[]{5,6,7};
       String []transmission=new String[]{"automatic","manual","NA"};
       String []engineType=new String[]{"diesel","petrol","electric"};
       int engineSize;
       int []doors=new int[]{2,3,4,5};
       int []wheelSize=new int[]{16,17,18,19,20};
       String[]Color=new String []{"white","red","blue","black","grey","cherry red","dark blue","dark grey","silver","mica blue","yellow","pink","light brown"};
      
       
        //newCar;
    for(Start=0;Start<10;Start++){
       Car newCar=new Car();
       newCar.setName(CarNames[Start]);
       
       newCar.setVinNumber(vinStart);
       
       newCar.setGearBox(gear[ (int)(Math.random() * 3)]);
       newCar.setTransmisson(transmission[(int)(Math.random() * 3)]);
       newCar.setEngineType(engineType[(int)(Math.random() * 3)]);
       if(newCar.getEngineType()=="diesel"||newCar.getEngineType()=="petrol")
       {
           
           
          newCar.setEngineSize((double)(Math.random() * 4+1.0));
        }
       else if(newCar.getEngineType()=="electric"){
           newCar.setEngineSize((int)(Math.random() * 340+50));
       }
       newCar.setNoOfDoors(doors[(int)(Math.random() * 4)]);
    
       newCar.setWheelSize(wheelSize[(int)(Math.random() * 5)]);
        
       newCar.setColour(Color[(int)(Math.random() * 13)]);
           // System.out.println(newCar.getName());       
        Cars.AddCars(newCar);
       vinStart++;
       }
    
    //    Cars.DisplayInventory();
       Cars.GenerateNewModels();
       Cars.GenerateExistingCars();
        Cars.GenerateNewCars();
       //Cars.DisplayOldCars();
       //Cars.DisplayNewCars();
   
      Dealers.DistributeExistingCars(Cars);
      
      Dealers.DistibuteNewCars(Cars);
      
      char option='\0';
       
       do{
      
      System.out.println("-------Car Generation Menu-----");
       System.out.println("Select Any One Of them to Proceed:");
       System.out.println("1) View Existing Products ");
       System.out.println("2) View New Products");
       System.out.println("3) Select Specific Product");
       System.out.println("4 View All DealerShips");
       System.out.println("5 Select Single DealerShip");
       
       System.out.println("0 Exit");
     
       Scanner input = new Scanner(System. in);
        System. out. print("Enter an Option: ");
        option = input.next().charAt(0);
        if(option==49)
        {
            Cars.DisplayExistingInventory();
        }
        else if(option==50){
            Cars.DisplayNewInventory();
        }
        
        else if(option==51){
            
            Cars.DisplayOldCars();
            Cars.DisplayNewCars();
             System. out. print("Enter Vin To Choose Specific Product from above List: ");
          int op2;
          op2 = input.nextInt();
         Cars.DisplayCar(op2);
        }
        else if(option==52){ 
        System.out.println();
        System.out.println("Dealers Details");
        Dealers.DisplayDealers();
        }
        
        else if(option==53){ 
        System.out.println();
        Dealers.DisplayListDealer();;
        System. out. print("Enter Dealer No From Above List: ");
          int op2;
          op2 = input.nextInt();
         Dealers.DisplaySpecificDealer(op2);
       
        }
        
       }while(option!=48);
    //  Dealers.DisplayDealers();
     // */
    //  Cars.DisplayNewModels();
            //Cars.DisplayInventory();
       //System.out.println(random);
        // TODO code application logic here
    }
    
}
    

