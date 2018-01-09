
package com.feicuiedu.atm;
import java.util.Scanner;
public class Register{
     
	public void rte(){

		  Scanner sc= new Scanner(System.in);
		  System.out.println("***haung ying shi yongATM***");
		  System.out.println("qing shu ru zhang hao");
		  String number=sc.next();

        while(true){

		    if(number.equals("370120180104")){

			  System.out.println("qing shu ru mi ma ");
			  String password=sc.next();
            

		        while(true){

			      if(password.equals("123456")){
					System.out.println("deng lu cheng gong");

			        }else{
					     System.out.println("mi ma cuo wu qing chong xin shu ru ");
					      break;

	                        }
	                    }
	                }else{
			               System.out.println("zhang hao cuo wu qing chong xin shu ru ");
			              
			
		                   }

		
	                }
	            }




}