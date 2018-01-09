package com.feicuiedu.atm;
import java.util.Scanner;
import 
public class Menu{
	public void mu(){
		System.out.println("***qing shu ru xiang mu  ***");
		System.out.println("1.cha xun\t2.zhuan zhang \t3.qu  kuan \t4.cun kuan \t5.tui ka ");
		int number=new Scanner(System.in).nextInt();
	     if(number==1){
	     	Query qy=new Query();
			qy.query();
		}else if(number==2){
			Transfer tf= new Transfer();
			tf.transfer();

		}else if(number==3){
			Drawal dl=new Drawal();
			dl.drawal();
		}else if(number==4){
			Deposit dt =new  Deposit();
			dt.deposit();
		}else if(number==5){
			Exit et= new Exit();
			et.exit();
		}else{
			System.out.println("qing chong xin shu ru  ");
		}
			
	}


	


}