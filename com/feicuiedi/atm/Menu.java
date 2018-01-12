package com.feicuiedi.atm;

import java.util.Scanner;

public class Menu {
	
	public void run(){
		System.out.println("***欢迎使用ATM***");
		System.out.println("请输入选项");
		Scanner sc =new Scanner(System.in);
		System.out.println("1.查询\t2.转账\t3.取款\t4.存款\t5.流水\t6.退卡");
		int num=sc.nextInt();
		if(num==1){
			//登录
			 Register rt = new Register();
			 rt.login();

		}else if(num==2){
			//转账
			/*Transfer tf=new Transfer();
			tf.run();*/

		}else if(num==3){
			//取款
			/*Drawal dl=new Drawal();
			dl.run();*/
			
		}else if(num==4){
			/*Deposit dt=new Deposit();
			dt.run();*/
			
			
		}else if(num==5){
			Water wt=new Water();
			wt.date();
			
		}else if(num==6){
			
			
		}
	}

}
