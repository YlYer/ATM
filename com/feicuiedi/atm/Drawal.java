package com.feicuiedi.atm;

import java.util.Scanner;
/**
 * 取款
 * @author wangxiaoyi
 *
 */
public class Drawal {
	public void  run(User user) {
		System.out.println("请输入取款金额");
		Scanner sc=new Scanner(System.in);
		double money=sc.nextDouble();
		if(money<100) {
			System.out.println("金额输入错误,请输入100或100的倍数");
			
		}if(money%100!=0) {
			System.out.println("取款成功");
			
		}
		return;
	}



}
