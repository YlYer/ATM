package com.feicuiedi.atm;

import java.util.Scanner;
/**
 * 存款业务
 * @author wangxiaoyi
 *
 */
public class Deposit {
	public void run(User user,double balance) {
		Scanner sc=new Scanner(System.in);
		double balance1=sc.nextDouble();
		if(balance1<0) {
			System.out.println("存钱失败，请正确放入");
			
			return;
			
			
		}
		double d=balance1+user.getBalance();
		user.setBalance(d);
		System.out.println("你存入了"+balance1+"元，现账户余额为"+d);
		return;
	
	
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

}
