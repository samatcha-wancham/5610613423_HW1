/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class HW1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        final int k =4;
        int[] IncomeRange;
        int[] TaxRate;
        int MaxTaxRate;
        int Income;
        int min=0;
        int max=0;
        int temp =0;
        int sum = 0;
        int sum1 = 0;
       
    
     
       
        IncomeRange = new int[4];
        TaxRate = new int[4];
        float CalTax=0;
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<IncomeRange.length;i++)
        {
           
            System.out.print("Please enter income and  tax rate  in tax bracket"+ (i+1) + ": ");
            IncomeRange[i] = sc.nextInt();
            TaxRate[i] = sc.nextInt(); 
            
                    
            }
            System.out.print("Please enter tax rate if income >750000:");
            MaxTaxRate = sc.nextInt();
             System.out.print("Please enter income: ");
           Income = sc.nextInt();
          
            if(Income>750000)
            {
                CalTax=  (float) (MaxTaxRate/100.00);
            }
            
             for(int j=0;j<k;j++)
            {
                CalTax =   (float) (TaxRate[j]/100.00);
             max = IncomeRange[j];
            if (max > Income) {
                max = Income;
            }
             temp = max - min;
             
        
            sum = (int) (CalTax * temp);
             if (j > 0) {
                temp += 1;
               sum = (int) (CalTax * temp);
            }
            System.out.print(min + " - " + IncomeRange[j] + " you pay " + temp + " x ");
            System.out.printf("%.2f", CalTax);
            System.out.println(" = " + sum  + " baht.");
            
             min = IncomeRange[j]+1;
           
            
              
            
            if(Income == IncomeRange[j])
            {
                break;
            }
          
            
            
             
    }
             if(Income<750000)
             {
               System.out.println("Total Tax : "+sum+"baht");
             }
               
         max = Income;
        if (max > 750000 && max < 1000000 ) {
            temp = max - 750000;
            CalTax = (float) (MaxTaxRate / 100.00);
            sum = (int) (CalTax * temp);
            System.out.print(min + " - " + max + " you pay " + temp + " x ");
            System.out.printf("%.2f", CalTax);
            System.out.println(" = " + sum + " baht.");
            min = (max + 1);
            sum1+=CalTax*temp+37500;
            System.out.println("Total tax:"+sum1+"baht");
         
        } 
        if (max > 1000000  && max<2000000 ) {
            temp = max - 1000000;
            CalTax = (float) (MaxTaxRate / 100.00);
            sum = (int) (CalTax * temp);
            System.out.print(min + " - " + max + " you pay " + temp + " x ");
            System.out.printf("%.2f", CalTax);
            System.out.println(" = " + sum + " baht.");
            min = (max + 1);
            sum1+=CalTax*temp+37500;
            System.out.println("Total tax:"+sum1+"baht");
        } 
        if (max > 2000000  && max<4000000 ) {
            temp = max - 2000000;
            CalTax = (float) (MaxTaxRate / 100.00);
            sum = (int) (CalTax * temp);
            System.out.print(min + " - " + max + " you pay " + temp + " x ");
            System.out.printf("%.2f", CalTax);
            System.out.println(" = " + sum + " baht.");
            min = (max + 1);
            sum1+=CalTax*temp+37500;
            System.out.println("Total tax:"+sum1+"baht");
        } 
        if (max > 4000000   ) {
            temp = max - 2000000;
            CalTax = (float) (MaxTaxRate / 100.00);
            sum = (int) (CalTax * temp);
            System.out.print(min + " - " + max + " you pay " + temp + " x ");
            System.out.printf("%.2f", CalTax);
            System.out.println(" = " + sum + " baht.");
            min = (max + 1);
            sum1+=CalTax*temp+37500;
            System.out.println("Total tax:"+sum1+"baht");
        } 
    }
}
        
 
    
    

