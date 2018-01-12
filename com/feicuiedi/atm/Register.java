package com.feicuiedi.atm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 登录项目
 * @author wangxiaoyi
 *
 */
public class Register {
	
	public void login() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入账号");
		String str=sc.next();
		String reg="^[0-9]\\d{11}";
		Pattern pattern=Pattern.compile(reg);
		Matcher matcher=pattern.matcher(str);
		boolean rs=matcher.matches();
		
        while(rs){
        	
			System.out.println("请输入密码 ");
		    String password=sc.next();
		    while(true) {
		    	if(password.equals("123456")) {
		    		System.out.println("登陆成功");
		    	}else {
		    		System.out.println("密码错误请重新输入");
		    		
		    	}
		    	break;
		    	
		    }
		    
			       
			
	}
  
	               
  }
}


