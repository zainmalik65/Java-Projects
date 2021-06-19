/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassign1;
import java.util.Scanner;
/**
 *
 * 
 */
public class roll67{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int count=13;
        
        int S[],T[];
        S=new int[count];
        T=new int [count];
        
        
         System.out.println("______________________War Game_________________________________");
            
            System.out.println("____________Enter Energies of "+count+" Soliders and Terrorists________________________" );
            
            
            
            for(int i=1;i<=count;i++)
            {
                
                System.out.print("Solider "+ i+":");
                 S[i-1]=input.nextInt();
                
                  
            }
            for(int l=1;l<=count;l++)
            {
                 System.out.print("Terrorist "+ l+":");
                 T[l-1]=input.nextInt();
            }
            System.out.println();
            
            
            
            System.out.println("Soliders and Terrorists are ready :");
            System.out.print(" Do want to start a war: 1) Yes 2)  No " );
            
            int temp1=0;
            int temp2=0;
            int winCount=0;
            int w=input.nextInt();
            if(w==1)
            {
            for(int k=0;k<count;k++)
            {
                int min1=S[0];
                int min2=T[0];
                temp1=0;
                temp2=0;
                
                for(int i=1;i<count;i++)
                {
                    if(S[i]< min1)
                    {
                        min1=S[i];
                        temp1=i;
                        
                    }
                    if(T[i]<min2)
                    {
                        min2=T[i];
                        temp2=i;
                    }
                }
                if(S[temp1]-T[temp2]>0)
               {
                winCount++;
                 
               }
                S[temp1]=999999999;
                T[temp2]=999999999;
                
            }  
            
            
            
            
            if(winCount==count)
            {
                
             System.out.print("                     Result = Win                            ");
            }
            else if(winCount<count)
                
            {
                System.out.println("                Result = Lose                            ");
            }
            
            }
            else if(w==2)
            {
                System.out.println("           No war today Better luck next time            " );
            }
            
            
        
    }
}
    

