/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productcreation;


class DonorDetails{
    public String donorName;
    public int donorVin;
}
public class Car {
    private String name;
    private int vinNumber;
    private int  gearBox;
    private String transmisson;
    private String engineType;
    private double engineSize;
    private  int noOfDoors;
    private int wheelSize;
    private String Colour;
    private int presentParts;
    private DonorDetails [] Donor=new DonorDetails[5];
    public Car(){
        presentParts=0;
        for(int i=0;i<5;i++){
        Donor[i]=new DonorDetails();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public void setGearBox(int gearBox) {
        this.gearBox = gearBox;
    }

    public String getName() {
        return name;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public int getGearBox() {
        return gearBox;
    }

    public String getTransmisson() {
        return transmisson;
    }

    public String getEngineType() {
        return engineType;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public String getColour() {
        return Colour;
    }

    public void setTransmisson(String transmisson) {
        this.transmisson = transmisson;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }
    public void SetGearBoxDonor(String DonorName,int vin)
    {
        this.Donor[0].donorName=DonorName;
        this.Donor[0].donorVin=vin;
        presentParts++;
    }
    public void SetTransDonor(String DonorName,int vin)
    {
        this.Donor[1].donorName=DonorName;
        this.Donor[1].donorVin=vin;
       presentParts++;
    }
    public void SetEngineDonor(String DonorName,int vin)
    {
        this.Donor[2].donorName=DonorName;
        this.Donor[2].donorVin=vin;
        presentParts++;
    }
    public void SetDoorsDonor(String DonorName,int vin)
    {
        this.Donor[3].donorName=DonorName;
        this.Donor[3].donorVin=vin;
        presentParts++;
    }
    public void SetWheelDonor(String DonorName,int vin)
    {
        this.Donor[4].donorName=DonorName;
        this.Donor[4].donorVin=vin;
        presentParts++;
    }
    public String getGearDonorName()
    {
       return  this.Donor[0].donorName;
    }
  
    public String getTransDonorName()
    {
        return  this.Donor[1].donorName;
    }
    public String getEngineDonorName()
    {
        return  this.Donor[2].donorName;
    }
    public String getDoorsDonorName()
    {
        return  this.Donor[3].donorName;
    }
    public String getWheelDonorName()
    {
        return  this.Donor[4].donorName;
    }
    public int getGearDonorNo()
    {
       return this.Donor[0].donorVin;
    }
    public int getTransDonorNo()
    {
       return this.Donor[1].donorVin; 
    }
    public int getEngineDonorNo()
    {
        return this.Donor[2].donorVin;
    }
    public int getDoorsDonorNo()
    {
        return this.Donor[3].donorVin;
    }
    public int getWheelDonorNo()
    {
        return this.Donor[4].donorVin;
    }
    boolean IsValid(int vin)
    {
        int count=0;
        for(int i=0;i<presentParts;i++)
        {
            if(this.Donor[i].donorVin==vin)
            {
              count++;  
            }
    
        }
        //System.out.println(count);
        if(count<2)
        {
        return true;    
        }
        
    
        return false;
        
    }
}