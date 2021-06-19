/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familytree;
import java.io.*;
import java.io.Serializable;
import java.util.*;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.control.ListView;

 class name implements Serializable{
public String FirstName ;
public String SurrName;
public String MaidenName;
}
class address implements Serializable{
public int StreetNo;
public String StreetName;
public String suburb;
public int postCode;

}
class children implements Serializable{
    
    int ChildID;
    String ChildName;
}
class gchildren implements Serializable{
    
    int gChildID;
    String gChildName;
}


public class UserClass implements Serializable
{
 public name Uname=new name();
// public String Uid;
 public String Gender;
 public String father;
 public String mother;
 public String spouse;
 public int Cid;
 public int Gid;
  ArrayList<children> childrens = new ArrayList<children>();
ArrayList<gchildren> gchildrens = new ArrayList<gchildren>();

public String lifeDesc;
address Address=new address();
public UserClass()
{
    Gender="/0";
    father="/0";
    mother="/0";
    spouse="/0";
    Cid=0;
    Gid=0;       
 //father=new UserClass();
 //mother=new UserClass();
 //Spouse=new UserClass();   
}

public void addC(String Name){
    children c=new children();
   Cid++;
    c.ChildID=Cid;
    c.ChildName=Name;
    childrens.add(c);

}
public void addGC(String Name){
    gchildren c=new gchildren();
   Gid++;
    c.gChildID=Gid;
    c.gChildName=Name;
    gchildrens.add(c);

}

public void SetFather(String Name){
    this.father=Name;

}
public void SetMother(String Name){
    this.mother=Name;

}


public void SetSpouse(String Name){
    this.spouse=Name;

}

public void setGender(String n)
{
 this.Gender=n;    
}

public void setDesc(String n)
{
 this.lifeDesc=n;    
}
public void SetAdd(address add){
    this.Address.StreetName=add.StreetName;
    this.Address.StreetNo=add.StreetNo;
    this.Address.suburb=add.suburb;
    this.Address.postCode=add.postCode;

}






public void setFName(String n)
{
 Uname.FirstName=n;    
}

public void setMName(String u)
{
    Uname.MaidenName=u;
}

public void setSName(String u)
{
    Uname.SurrName=u;
}

public String getFName()
{
 return Uname.FirstName;    
}

public String getMName()
{
 return Uname.MaidenName;    
}

public String getSName()
{
 return Uname.SurrName;    
}

public String getFather()
{
 return this.father;    
}

public String getGender()
{
 return this.Gender;    
}
public String getMother()
{
 return this.mother;    
}

public String getSpouse()
{
 return this.spouse;    
}
public String getDesc()
{
    return this.lifeDesc;
    
}
public void addChild(children child){
    
    this.childrens.add(child);
    
}
public void addgChild(gchildren gchild){
    
    this.gchildrens.add(gchild);
    
}


/////
public void setStName(String S){
    this.Address.StreetName=S;
}

public void setStNo(int S){
    this.Address.StreetNo=S;
}

public void setSub(String S){
    this.Address.suburb=S;
}

public void setPost(int P){
    this.Address.postCode=P;
}




////
public String getStName(){
    return this.Address.StreetName;
}


public int getStNo(){
    return this.Address.StreetNo;
}

public String getSub(){
    return this.Address.suburb;
}

public int getPost(){
    return this.Address.postCode;
}
public String getChild(int i){
    ListIterator<children>  iterator = childrens.listIterator(); 
    children cl = new children();
    try
    {             // Printing the iterated value 
            System.out.println("\nUsing ListIterator:\n"); 
            while (iterator.hasNext()) { 
                ;
                cl=iterator.next();
                if(cl.ChildID==i){
                break;    
                }
            } 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        }    
    return cl.ChildName;
}

public String getGChilds(ListView Views){
    ListIterator<gchildren>  iterator = gchildrens.listIterator(); 
    gchildren cl = new gchildren();
    try
    {             // Printing the iterated value 
            System.out.println("\nUsing ListIterator:\n"); 
            while (iterator.hasNext()) { 
                ;
                cl=iterator.next();
                  Views.getItems().add(cl.gChildName);
            } 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        }    
    return cl.gChildName;
}



public String getChilds(ListView Views){
    ListIterator<children>  iterator = childrens.listIterator(); 
    children cl = new children();
    try
    {             // Printing the iterated value 
            System.out.println("\nUsing ListIterator:\n"); 
            while (iterator.hasNext()) { 
                ;
                cl=iterator.next();
                  Views.getItems().add(cl.ChildName);
            } 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        }    
    return cl.ChildName;
}

/*
 public static void main(String[] args)  {
  Scanner input = new Scanner(System. in);
 
UserClass U = new UserClass();
 U.Uname.FirstName="Zain";
 U.Uname.SurrName="Malik";
 U.setGender("Male");
 U.SetFather("Razzaq");
 
UserClass V = new UserClass();
 V.Uname.FirstName="Abdullah";
 V.Uname.SurrName="Saeed";
 V.setGender("Male");
  V.SetFather("Razzaq");
  ArrayList<UserClass> v=new ArrayList<UserClass>();
  v.add(U);
  v.add(V);

File f=new File("Obj.dat");
try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(v);
            oos.close();
            System.out.println("data write successfully");
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
//            ois.readObject();
//            ois.close();
            
            ArrayList<UserClass> deserializeStudent = (ArrayList<UserClass>)ois.readObject();
            System.out.println(deserializeStudent);
            ois.close();
            
            Iterator<UserClass> iter = deserializeStudent.iterator();
            while(iter.hasNext()){
                UserClass s = iter.next();
                System.out.println(
                        "Name " + s.Uname.FirstName + ", "
                        + "SurrName: " + s.Uname.SurrName + ", "
                        + "Maiden: " + s.Uname.MaidenName+", "
                        +"Gender :"+s.Gender
                        +", Father :"+s.father
                );  
                
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }


 }
*/














}

